package com.workday.warp.examples

import com.workday.warp.junit.WarpTest
import org.junit.jupiter.api.Assertions

class ExampleSpec {

  /** A test that will be invoked a total of 6 times, 2 unmeasured warmups and 4 measured trials. */
  @WarpTest(warmups = 1, trials = 2)
  def measured(): Unit = {
    Assertions.assertEquals(2, 1 + 1)
  }
}
