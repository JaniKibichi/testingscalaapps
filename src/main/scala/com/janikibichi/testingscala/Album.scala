package com.janikibichi.testingscala

class Album(val title: String, val year:Int, val tracks:Option[List[Track]],val acts:Act*){
  require(acts.size >0)

  def this(title:String, year:Int, acts:Acts*) = this(title,year,None,acts:_*)
}