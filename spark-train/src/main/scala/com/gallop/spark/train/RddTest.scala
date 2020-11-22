package com.gallop.spark.train

import org.apache.spark.{SparkConf, SparkContext}

/**
 *
 * author gallop
 * date 2020-11-22 16:34
 * Description:
 * Modified By:
 */
object RddTest {

  def main(args: Array[String]): Unit = {
    val sparkConf = new SparkConf().setMaster("local[2]").setAppName("myRddTest")
    val sc = new SparkContext(sparkConf)

    val list = List("Hadoop","Spark","Hive")
    val rdd = sc.parallelize(list)

    //打印rdd的内容
    rdd.foreach(println)
    println(rdd.count())
    println(rdd.collect().mkString(","))
  }

}
