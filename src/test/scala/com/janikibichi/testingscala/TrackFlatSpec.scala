package com.janikibichi.testingscala

import org.scalatest.Matchers
import org.scalatest.FlatSpec
import org.joda.time.Period

class TrackFlatSpec extends FlatSpec with MustMatchers{
    behavior of "A Track"

    it should """have a constructor that accepts the name and the length of the track in min:sec and returns a joda.time.Period when track.period is called """ in{
        val track = new Track("Last Dance", "5:00")
        track.period must be(new Period(0,5,0,0))
    }

    it must """throw an illegalArgumentException with the message \"track name cannot be blank\" if the name of the track is blank """ in{
        val exception = evaluating(new Track("")) must produce [IllegaArgumentException]
        exception.getMessage must be ("requirement failed: Track name cannot be blank")
    }
}