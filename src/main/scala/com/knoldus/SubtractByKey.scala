package com.knoldus

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object SubtractByKey {
  def main(args: Array[String]): Unit = {

  val conf = new SparkConf ()
  conf.setMaster ("local")
  conf.setAppName ("Spark Practice1")
  val sc = new SparkContext (conf)

  println ("Enter the key you want to Subtract with: ")
  val key: Int = scala.io.StdIn.readInt

  println ("Enter the 1st value which you wants to substract: ")
  val value1: Double = scala.io.StdIn.readDouble

  println ("Enter the 1st value which you wants to substract: ")
  val value2: Double = scala.io.StdIn.readDouble

  val rdd_1 = sc.parallelize (Seq ((key, value1) ) )
  val rdd_2 = sc.parallelize (Seq ((key, value2) ) )

   findSubOfVAlues(rdd_1, rdd_2)

}

  def findSubOfVAlues(value: RDD[(Int, Double)], value1: RDD[(Int, Double)]) = {
    val combordd = value join value1

    val res = combordd.map(r=>(r._1,(r._2._1-r._2._2))).collect

    for (result <- res) println(result)
  }
}