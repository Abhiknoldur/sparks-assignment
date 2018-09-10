package com.knoldus

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object SubtractByKey extends App {

  val conf = new SparkConf()
  conf.setMaster("local")
  conf.setAppName("Spark Practice")
  val sc = new SparkContext(conf)

  println("Enter the key you want to Subtract with: ")
  val key: Int = scala.io.StdIn.readInt

  println("Enter the 1st value which you wants to substract: ")
  val value1: Double = scala.io.StdIn.readDouble

  println("Enter the 1st value which you wants to substract: ")
  val value2: Double = scala.io.StdIn.readDouble

  val rdd_1 = sc.parallelize(Seq((key, value1)))
  val rdd_2 = sc.parallelize(Seq((key, value2)))

  println(s"Wanted Result:", findSubOfVAlues(rdd_1, rdd_2))

  println()


  def findSubOfVAlues(value: RDD[(Int, Double)], value1: RDD[(Int, Double)]) = {
    val combordd = value join value1

    val result = combordd.map(r => (r._1, r._2._1 - r._1, r._2._2)).collect

    println(result)
  }
}