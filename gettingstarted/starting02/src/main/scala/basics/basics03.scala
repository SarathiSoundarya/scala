package basics
//arrays, list, set, maps
object basics03 {

  def main(args: Array[String]): Unit = {
    val str1: String="Sou"
    val str2: String="Sharang"
    println(str1.length());
    println(str1.concat(str2));

    val myarray= new Array[Int](2);
    val myarraystr = new Array[String](2);
    val test=Array(1,2,3,4,5);
    myarray(0)=5
    myarray(1)=6
    for (x<- myarray){
      println(x)
    }
    for (x<- 0 to (myarraystr.length-1)){
      println(x)
    }
    val mylist:List[Int]=List(1,2,3,4);
    val mlist:List[String]=List("Sou", "Sharang");
    //preappend 0 to mylist
    println(0::mylist);
    println(mylist.head);
    println(mylist.tail);
    println(mylist.isEmpty);
    println(mylist.reverse);
    println(mylist.max);
    mylist.foreach(println)
    var sum:Int=0;
    mylist.foreach(sum+=_);
    println(sum)


    //Sets
    val mset: Set[Int] = Set(1,2,4,4);
    println(mset(8))//if 8 is contained in the set or not

    var mset1=scala.collection.mutable.Set(1,2,4,4)
    mset1 += 5
    println(mset1)
    mset1-=2
    println(mset1)

    var mset2=mset|mset1
    println(mset2)

    var mset3=mset& mset1
    println(mset3)

    val setToList = mset.toList
    print(setToList)


    //Maps
    val mymap: Map[Int, String]=Map(801->"max",802->"xam")
    println(mymap)
    //get a value
    println(mymap.get(801))
    println(mymap.get(803))

    //updating a map
    val updatedMap = mymap + (804 -> "tim")
    println(updatedMap)

    //removing a key from map
    val smallerMap = mymap - 804
    println(smallerMap)
    println(mymap.keys)
    println(mymap.values)
    mymap.keys.foreach(key=>
    println(mymap(key)))

    val myMutableMap = scala.collection.mutable.Map("x" -> 10, "y" -> 20)
    myMutableMap("z") = 30 // Adds a new key
    myMutableMap("x") = 15 // Updates an existing key
    println(myMutableMap)  // Output: Map(x -> 15, y -> 20, z -> 30)


    //Tuples
    var mytuple= new Tuple3("sou","sharang","iyers")
    println(mytuple._1)
    println(mytuple._3)
    mytuple.productIterator.foreach{
      i=>println(i)
    }

    //Map
    val lst=List(1,2,3,4,5);
    println(lst.map(_*2));//new list with each element doubles
    println(lst.map(x=>x*2));

    var mymap1=Map(1->"sou",2->"Sharang")
    println(mymap1.mapValues(x=>"hi"+x))

    //with a string
    println("hello".map(_.toUpper))

    //flatten
    print("Flattening...")
    println(List(List(1,2,3),List(4,5,6)).flatten)

    val numbers = List(1, 2, 3)
    val result = numbers.flatMap(x => List(x, x * 2))
    print("Flat Mapping--------->")
    println(result)
    // Output: List(1, 2, 2, 4, 3, 6)

    //filter
    var mlist1 = List(1, 2, 3,4)
    println(mlist1.filter(x => x%2==0))
    println(mlist1.reduceLeft(_+_)) //sum of all the numbers in the list.
    println(mlist1.reduceLeft((a,b)=>{println(a+", "+b);a+b;}))
    println("*************")
    println(mlist1.reduceRight(_+_)) //sum of all the numbers in the list.
    println(mlist1.reduceRight((a,b)=>{println(a+", "+b);a+b;}))

    //fold left
    println(mlist1.foldLeft(100)(_+_))
    println(mlist1.foldRight(100)(_+_))
    println(mlist1.foldRight(100)((a,b)=>{println(a+", "+b);a+b;}))

    println(mlist1.scanLeft(100)(_+_))
  }


}
