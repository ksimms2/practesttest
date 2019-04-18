package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PracticeTest {

  @Test
  void isSquare() {
    assertEquals(false,Practice.isSquare(-1));
    assertEquals(true, Practice.isSquare(0));
    assertEquals(false, Practice.isSquare(3));
    assertEquals(true, Practice.isSquare(25));
    assertEquals(false, Practice.isSquare(26));
  }
}