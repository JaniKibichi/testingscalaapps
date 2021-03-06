package com.janikibichi.testingscala

import org.scalatest.Matchers
import org.scalatest.FunSpec

class AlbumFixtureTraitSpec extends FunSpec with Matchers{
  trait AlbumFixture{
    val letterFromHome = new Album("Letter from Home",1989,new Band("Pat Metheny Group"))
  }

  describe("The Letter From Home Album by Pat Metheny"){
    it("should get the year 1989 from the album"){
      new AlbumFixture {
        letterFromHome.year should be(1989)
      }
    }
  }
}