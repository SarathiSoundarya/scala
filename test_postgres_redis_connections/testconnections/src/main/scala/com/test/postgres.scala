package main.scala.com.test

import java.sql.{Connection, DriverManager}
import java.util.Properties

object postgres {
  private val host: String = System.getenv("POSTGRES_HOST")
  private val port: String = System.getenv("POSTGRES_PORT")
  private val db: String = System.getenv("POSTGRES_DB")
  private val user: String = System.getenv("POSTGRES_USER")
  private val password: String = System.getenv("POSTGRES_PASSWORD")

  def print_postgres_creds(): Unit = {
    println(s"Host: $host")
    println(s"port: $port")
    println(s"db: $db")
    println(s"user: $user")
    println(s"password: $password")
  }
  def get_postgres_connection():Connection = {
    val url = s"jdbc:postgresql://$host:$port/$db"
    val props = new Properties()
    props.setProperty("user", user)
    props.setProperty("password", password)
    props.setProperty("driver", "org.postgresql.Driver")

    val connection = DriverManager.getConnection(url,props)
    connection
  }
  def execute_query(connection: Connection,query: String):Unit={
    val statement = connection.createStatement()
    val resultSet = statement.executeQuery(query)
    println(resultSet)
  }
  def main(args: Array[String]): Unit = {
    //print all the postgres creds
    print_postgres_creds()
    val conn: Connection = get_postgres_connection()
    execute_query(conn,"Select * from refinery.vw_expressions limit 5")
  }
}
