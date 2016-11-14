package org.alitouka.spark.dbscan.util.debug

import org.apache.log4j.Logger

private [dbscan] class Clock {
  val startTime = System.currentTimeMillis()

  def logTimeSinceStart (): Unit = {
    logTimeSinceStart("Test")
  }

  def logTimeSinceStart (message: String) = {
    val currentTime = System.currentTimeMillis()
    val timeSinceStart = (currentTime - startTime) / 1000.0
    Logger.getLogger("dbscan").info (s"$message took $timeSinceStart seconds")
  }
}
