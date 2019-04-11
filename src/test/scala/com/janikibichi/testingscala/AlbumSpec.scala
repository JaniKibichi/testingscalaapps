package com.janikibichi.testingscala

import org.scalatest.Matchers
import org.scalatest.FunSpec

class AlbumSpec extends FunSpec with Matchers with GivenWhenThen{
  describe("An Album"){
    it("can add an artist to the album at construction time"){
      given("The album Thriller by Michael Jackson")
      val album = new Album("Thriller",1981,new Artist("Michael","Jackson"))

      when("the album\'s artist is obtained")
      val artist = album.artist

      then("the artist obitained should be an instance of Artist")
      artist.isInstanceOf[Artist] should be (true)

      and("the artists first name and last name should be Michael Jackson")
      artist.firstName should be("Michael")
      artist.lastName should be("Jackson")
    }
  }
}