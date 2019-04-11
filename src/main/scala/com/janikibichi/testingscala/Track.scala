package com.janikibichi.testingscala

class Track(val name:String, val length:String ){
  require(!name.trim().length.equals(0), "Track name cannot be blank")

  def this(name:String) = this(name,"0:00")

  def period = {
    val format = new PeriodFormatterBuilder()
        .printZeroAlways()
        .appendMinutes()
        .printZeroAlways()
        .appendSeconds()
        .toFormatter()
    format.parsePeriod(length)
  }
}