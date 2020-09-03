package com.twc.javaBasic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BooleanOperatorsTest {
  @SuppressWarnings({"PointlessBooleanExpression", "ConstantConditions"})
  @Test
  void should_perform_logical_boolean_operations() {
    boolean[] actualResults = {
      true && true,
      true && false,
      false && false,
      true || true,
      true || false,
      false || false,
      true & true,
      true & false,
      false & false,
      true | true,
      true | false,
      false | false,
      3 == 7,
      4 != 5
    };

    boolean[] expectedResult = {
      true,
      false,
      false,
      true,
      true,
      false,
      true,
      false,
      false,
      true,
      true,
      false,
      false,
      true
    };

    assertArrayEquals(expectedResult, actualResults);
  }
}
