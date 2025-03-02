package main.scala.com.test
import redis.clients.jedis.Jedis

object redis_connect {
  private val host:String = System.getenv("REDIS_HOST")
  private var port:Int = System.getenv("REDIS_PORT").toInt
  private val password: String = System.getenv("REDIS_PASSWORD")
  private val logdb:String = System.getenv("REDIS_LOG_DB")
  private val checkdb:String = System.getenv("REDIS_CHECKPOINT_DB")

  def print_creds():Unit={
    println(s"HOST--->$host")
    println(s"port--->$port")
    println(s"password--->$password")
    println(s"logdb--->$logdb")
    println(s"checkpointdb--->$checkdb")
  }
  def connect_to_Redis(db:Int):Jedis= {
    val redisconn: Jedis= new Jedis(host, port)
    redisconn.select(db)
    return redisconn
  }

  def main(args: Array[String]): Unit = {
    print_creds()
    val redconn:Jedis =connect_to_Redis(1)

  }
}
