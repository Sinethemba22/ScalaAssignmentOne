object Assignment {

  def main (args: Array [String]): Unit ={

    //Task 1
    println("Task one")
    for( a <- 50 to 100 by 10)
      println(a);
    println()

    //Task 2

    println("Task two")
    val Set_One : Set[Int] = Set(11, 13, 15, 20, 10)
    val Set_Two : Set [Int] = Set (10, 7, 8, 19, 10 )

    val ans2 = for { x <- Set_One  if !Set_One.exists(_ == x) } yield x
    val ans4 = for { x <- Set_Two  if !Set_Two.exists(_ == x) } yield x

    print(ans2)
    println(ans4)
    println()


    //Task 3
    println("Task three")
    val a : List[Double] = List( 99, 10, 5, 5, 7, 10, 1)
    val b : List[Double] = List(10, 30.0, 50, 4, 5)


    val c = a ::: b


    println("After mergeing lists")
    println(c)

    println("First number   " +c.head)
    println("Middle number  " +c.indexOf(6))
    println("Last number  " +c.last)


  }



}
