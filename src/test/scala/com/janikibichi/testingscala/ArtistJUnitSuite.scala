package com.janikibichi.testingscala

import org.scalatest.junit.JUnitSuite
import org.junit.{Test,Before}
import org.junit.Assert._

class ArtistJUnitSuite extends JUnitSuite{
  var artise:Artist=_

  @Before
  def startUp(): Unit ={
    artist = new Artist("Kenny","Rogers")
  }

  @Test
  def addOneAlbumAndGetCopy(): Unit ={
    val copyArtist = artist.addAlbum(new Album("Love will turn you around",1982,artist))
    assertEquals(copyArtist.albums.size,1)
  }

  @Test
  def addTwoAlbumsAndGetCopy(): Unit ={
    val copyArtist = artist
      .addAlbum(new Album("Love will turn you around",1982,artist))
      .addAlbum(new Album("We've got tonight",1983,artist))
    assertEquals(copyArtist.albums.size,2)
  }
}
