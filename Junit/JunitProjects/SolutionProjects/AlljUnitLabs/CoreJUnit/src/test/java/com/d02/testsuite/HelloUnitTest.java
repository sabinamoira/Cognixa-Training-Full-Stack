package com.d02.testsuite;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HelloUnitTest
{
  private static HelloUnit helloUnit;
 
  @BeforeAll
  public static void setUpBeforeClass() throws Exception
  {
    helloUnit = new HelloUnit();
  }
 
  @AfterAll
  public static void tearDownAfterClass() throws Exception
  {
  }
 
  @BeforeEach
  public void setUp() throws Exception
  {
  }
 
  @AfterEach
  public void tearDown() throws Exception
  {
  }
 

  @Test
  public void testAdd()
  {
    assertEquals(5, helloUnit.add(2, 3));
  }

}