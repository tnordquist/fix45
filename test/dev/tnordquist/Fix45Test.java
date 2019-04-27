package dev.tnordquist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class Fix45Test {

  private static Object[][] fix45() {
    return new Object[][]{

        {new int[]{4, 5, 4, 5, 1} , new int[] {4, 5, 4, 1, 5}},
        {new int[] {9, 4, 5, 4, 5, 9}, new int[] {5, 4, 9, 4, 9, 5}},
        {new int[]{1, 4, 5, 4, 5}, new int[]{5, 4, 5, 4, 1}}
    };
  }

  @ParameterizedTest
  @MethodSource
  void fix45(int[] expected, int[] input) {

  int[] actual = Fix45.fix45(input);
  assertArrayEquals(expected, actual);

  }
}