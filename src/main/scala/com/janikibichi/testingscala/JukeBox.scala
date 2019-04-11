package com.janikibichi.testingscala

class JukeBox(val albums:Option[List[Album]]){
  def readyToPlay = albums.isDefined
}