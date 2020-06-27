package com.example.spark

import org.apache.spark.sql.SparkSession

object SparkApplication extends App{
  val sparkSession = SparkSession.builder().appName("sample-spark").master("local[*]").getOrCreate()
  import sparkSession.implicits._

  print("\n Showing Sample DataFrame")
  List((1, 20),(2, 30),(3, 50),(4, 50)).toDF("score", "data").show()
}
