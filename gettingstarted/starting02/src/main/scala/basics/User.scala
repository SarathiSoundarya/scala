package basics

class User (private var name:String, val age:Int){//primary constructor
  //Auxillary constructor 1
  def this(name:String) = {
    this(name, 0)//calls primary constructor
  }
  //Auxillary constructor 2
  def this()={
    this("Unknown")//calls the auxillary constructor 1 that in turns calls the default constructor.
  }
  println("Constructing user....");
  def greet():Unit={println(s"Hi ${name}!")}

  def sayhiuser(times:Int):Unit={
    for (_ <- 1 to times){
      println(s"Hi ${name}")
    }
  }

  def getName():String= name
}

