package basics

//if else, forloop, while loop, dowhile loop
object basics01 {
  def main(args: Array[String]): Unit = {
      println("Hello world!")
      val name="Sou"
      val age=25
      println(name+" is "+age +" years old")
      println(s"${name} is ${age} years old.")
      println(raw"i have $$5.")
      println(raw"Hello \n World!")

      //if else statement
      val x=20;
      var res=""
      if (x==20){
        res="x==20"
      }
      else{
        res="x!=20"
      }
      println(res);

      // expression
      val res2= if(x==20) "x==20" else "x!=20";
      println(res2)

      // while loop
      var sum=0
      var y=10
      while (y > 0){
        sum=sum+y
        y=y-1
      }
      println(s"Sum of all numbers until ${y} is ${sum}")

      y=0
      do{
        y=y+1
      } while(y < 10);

      for (a <- 1 to 5){
        println(s"value of a is ${a}")
      }
      println("\n\n")
      for (a <- 1 to 5; b <- 2 to 5){
        println(s"value of a is ${a}, b is ${b}")
      }

    val names = List("Sou", "Sharang", "Aakash")

    for (a <- names) {

      if (a(0).toLower == 's' && a.toLowerCase.contains('o')) { // Convert the first character to lowercase for case-insensitive comparison
        println(a.length)       // Print the length of the name
        println(a.toUpperCase()) // Convert the entire name to uppercase and print
      }
    }

    var k=List(1,2,3,4)
    //assigning  using for loop
    var res3=for {i <- k} yield {i*i}
    println(res3)
  }
}
