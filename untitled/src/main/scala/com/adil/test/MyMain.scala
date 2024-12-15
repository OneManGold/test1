package com.adil.test

object MyMain extends App {
  val chairs: List[Chair] = List(Chair("blue", "home", 160, true), Chair("black", "office", 170, false), Chair("white", "office", 180, false), Chair("black", "office", 158, false))
  val heights: List[Int] = chairs.map((lineChair: Chair) => lineChair.heightSm)

  println(s"количество стульев: " + chairs.length)

  println(s"общее длина стульев " + heights.sum)

  println(s"количество жестких стульев: " + chairs.count((chair: Chair) => !(chair.isSoft)))

  println(s"Количество синих мягких стульев: " +
    chairs.count(chair => chair.colour == "blue" && chair.isSoft))

  println(s"Количество офисных стульев высотой более или равной 180 см: " +
    chairs.count(chair => chair.model == "office" && chair.heightSm >= 180))

  println(s"Количество мягких или белых стульев: " +
    chairs.count(chair => chair.isSoft || chair.colour == "white"))

  println(s"количество стульев ниже 170 см: " +
  chairs.count(chair => chair.heightSm <= 170))

  println(s"количество не белых мягких стульев: " +
    chairs.count(chair => !(chair.colour == "white") && chair.isSoft))

  val colorChairs = chairs.filter(chair => chair.heightSm < 170).map(_.colour).mkString(", ")
    println(s"Цвета стульев ниже 170 см: " + colorChairs)
}