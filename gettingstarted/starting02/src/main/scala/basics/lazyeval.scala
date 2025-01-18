package basics

class strict {
  val e={ println("In strict"); 9}
}
class lazyv {
  lazy val e={ println("In lazyeval");9}
}


object lazyeval {
  def main(args: Array[String]): Unit = {
    val x=new strict;
    val y=new lazyv;
  }

}
