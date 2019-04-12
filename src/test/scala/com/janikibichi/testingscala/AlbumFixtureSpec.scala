package com.janikibichi.testingscala

import org.scalatest.Matchers
import org.scalatest.FunSpec

class AlbumFixtureSpec extends FunSpec with Matchers{
  def fixture: Unit ={
    val letterFromHome = new Album("Letter from Home",1989,new Band("Pat Metheny Group"))
  }

  describe("The Letter From Home Album by Pat Metheny"){
    it("should get the year 1989 from the album"){
      val album - fixture.letterFromHome
      album.year should be (1989)
    }
  }
}