package basics

class Rational private(val n:Int, val d:Int) {
  require(d!=0, "Denominator is zero!!!!")

  //Auxillary constructor for integers
  def this(num:Int) = {
    this(num,1)
  }
  override def toString: String = s"R($n/$d)"

  def min(other:Rational):Rational={
    if ((n.toDouble/d)<(other.n.toDouble/other.d))
      this else other
  }
  def +(other:Rational):Rational={
    new Rational(n*other.d+d*other.n, d*other.d)
  }
//  def +(i:Int):Rational={
//    this+Rational(i)
//  }
}
object Rational {
  var rationalcount=0

  // Factory method to create a new rational number and increment the count
  def apply(n:Int, d:Int): Rational = {
    print("Creating rational through companion...")
    rationalcount = rationalcount+1  // Increment count when a new rational is created
    new Rational(n,d)
  }
  implicit def apply(n:Int): Rational = {
    print("Creating rational through companion...")
    rationalcount = rationalcount+1  // Increment count when a new rational is created
    new Rational(n,1)
  }

}
