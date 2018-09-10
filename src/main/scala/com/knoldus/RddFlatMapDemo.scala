package com.knoldus

import org.apache.spark.{SparkConf, SparkContext}

object RddFlatMapDemo extends App {

  val conf = new SparkConf()
  conf.setMaster("local")
  conf.setAppName("Spark Practice")
  val sc = new SparkContext(conf)

  val rdd1 = sc.parallelize(Array((1, Array((3, 4), (4, 5))), (2, Array((4, 2), (4, 4), (3, 9)))))

  val result = rdd1.flatMapValues(value => value).collect

  println(result)

}