package com.janikibichi.testingscala

import org.scalatest.matchers.Matchers
import collection.mutable.ListBuffer
import org.scalatest.{FreeSpec, OneInstancePerTest}

class AlbumListOneInstancePerTestFreeSpec extends FreeSpec with Matchers with OneInstancePerTest{
  val graceJonesDiscography = new ListBuffer[Album]()
  graceJonesDiscography += (new Album("Portfolio",1977,new Artist("Grace","Jones")))

  "Given an intial Grace Jones Discography" - {
    "When an additional two albums are added, then the discograhy size should be 3" in{
      graceJonesDiscography += (new Album("Fame",1978, new Artist("Grace","Jones")))
      graceJonesDiscography += (new Album("Muse",1979, new Artist("Grace","Jones")))
      graceJonesDiscography.size should be(3)
    }
  }

  "Given an initial Grace Jones Discography"-{
    "When one additional album from 1980 is added, then the discography should be 2" in{
      graceJonesDiscography += (new Album("Nightclubbing",1981,new Artist("Grace","Jones")))
      graceJonesDiscography.size should be(2)
    }
  }
}