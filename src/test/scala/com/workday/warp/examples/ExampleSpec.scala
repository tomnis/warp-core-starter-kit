package com.workday.warp.examples

import com.workday.warp.junit.WarpTest
import org.junit.jupiter.api.Assertions

class ExampleSpec {

  /** A test that will be invoked a total of 5 times, 1 unmeasured warmup and 4 measured trials. */
  @WarpTest(warmups = 1, trials = 4)
  def example(): Unit = {
    Assertions.assertEquals(2, 1 + 1)
  }
}
