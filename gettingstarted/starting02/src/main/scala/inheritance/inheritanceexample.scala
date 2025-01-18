package inheritance
import inheritance.Animal;
import inheritance.Dog;
import inheritance.Cat;

object inheritanceexample {
  def main(args: Array[String]): Unit = {
    val cat=new Cat;
    val dog=new Dog;
    println(cat.makesound())
    println(dog.makesound())
  }
}
