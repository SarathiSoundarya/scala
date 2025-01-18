package basics
//match expressions,methods,
object basics02 {
  var number=10;
  val addd = ( c :Int) => c+number;

  def add2 (x:Int) = (y:Int)=>x+y;

  object Math {
    def add(x:Int, y:Int):Int={
      return x+y;
    }
    def subtract(x:Int, y:Int):Int={
      return x+y;
    }
    def square(x:Int)=x*x;

    def print(x:Int, y:Int=200): Unit = {
      println(x+y)
    }

  }

  //higher order functions
  def mathadd(x:Double, y:Double,f:(Double, Double)=>Double):Double=f(x,y);
  def tripadd(x:Double, y:Double, z:Double, f:(Double, Double)=>Double):Double=f(f(x,y),z);


  //partially applied functions

  import java.util.Date;

  def log(date: Date, message: String): Unit = {
    println(date + " " + message)
  }

  def main(args: Array[String]): Unit = {
    val age = 18
    age match {
      case 18 | 20 => println("Age is 18 or 20");
      case _ => println("Age not 18");
    }
    val result = age match {
      case 18 | 20 => "Age is 18 or 20";
      case _ => "Age not 18";
    }
    println(s"Result: ${result}")

    println(Math.add(13, 12));
    println(Math.print(12));
    var add=(x:Int, y:Int)=>x+y;
    println(add(20,30))
    val res=mathadd(5,2,(x,y)=>x+y);
    println(res)
    println(tripadd(5,2,3,_+_))
    println(tripadd(5,2,3,_ max _))

    val date= new Date;
    val newlog=log(date,_:String);
    newlog("mess 1");
    newlog("mess 2");
    println(addd(30));

    //adding using add2
    println(add2(20)(10));
    val sum40=add2(40);
    println(sum40(100));

  }

}
