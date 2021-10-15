case class Cell(value: Int) {
  def isSet: Boolean = value != 0
}

val cell1 = Cell(0)
cell1.isSet

val cell2 = Cell(2)
cell2.isSet

case class Field(cells: Array[Cell])

val field1 = Field(Array.ofDim[Cell](1))
field1.cells(0) = cell1
case class House(cells: Vector[Cell])

val house = House(Vector(cell1, cell2))

house.cells(0).value
house.cells(0).isSet

//package SoftwareEngineering
/*
import scala.io.StdIn._

object test {
  def main(args: Array[String]) = {
    println("Welcome to Rommé \n")
    val greeting = "Hello " + signUp(args)
    println(greeting)
  }

  def signUp(playerNames: Array[String]): String = {
    if (playerNames.length > 0)
      playerNames.head
    else
      readLine("Please enter your name: ")
  }
}
 */
