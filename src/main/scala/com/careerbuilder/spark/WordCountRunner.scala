package com.careerbuilder.spark

import org.apache.spark.{SparkContext, SparkConf, Logging}

/**
 * Main method to the Spark WordCount application.
 * @author oozturk
 */
object WordCountRunner extends App with Logging {
  if (args.length < 2) {
    System.err.println("Usage: WordCountRunner input_path output_path")
    System.exit(1)
  }

  val Array(inputPath, outputPath) = args
  val stopWords = Set("a", "an", "the")

  val conf = new SparkConf().setAppName("WordCount")
  val sc = new SparkContext(conf)

  val lines = sc.textFile(inputPath)
  val counts = WordCount.count(lines, stopWords)

  log.info(counts.collect().mkString("[", ", ", "]"))

  counts.saveAsTextFile(outputPath)
}
