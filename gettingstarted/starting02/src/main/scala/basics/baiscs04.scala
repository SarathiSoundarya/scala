package basics
import basics.User
import basics.Rational
//classes
object baiscs04 {
  def main(args: Array[String]): Unit = {
    var user=new User("Sou",25);
    user.greet();
    user.sayhiuser(1);
    user.getName();

//    val user1 = new User("Alice", 30) // Calls primary constructor
//    val user2 = new User("Bob")       // Calls auxiliary constructor 1
//    val user3 = new User()            // Calls auxiliary constructor 2
    var rat= Rational(2,3);
    println(rat.toString())
    var rat1= Rational(1,5)
    println(rat1.toString())
    var rat2= Rational(1,2)
    println(rat2.toString())
    println(rat1.min(rat2))
    println(rat1+rat2)
    println(rat2+1)//this will implicity convert 1 to rational and then add
    println(Rational.rationalcount)
  }


}
