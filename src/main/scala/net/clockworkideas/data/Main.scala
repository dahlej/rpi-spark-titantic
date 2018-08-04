package net.clockworkideas.data

import org.apache.spark.sql.SparkSession


object Main extends App {
  override def main(args: Array[String]): Unit = {
    val spark = SparkSession
      .builder
      .appName("clockwork")
      .getOrCreate()

    val df=spark.read.csv("src/main/resources/data/train.csv")
    val count=df.count()
    df.printSchema()
    println(s"There are $count records in the dataset")
    spark.stop()
  }

}
