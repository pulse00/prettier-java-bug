package com.example;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import javax.validation.Valid;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SomeClassTest {

  @Test
  void someTest() {
    SomeClass someClass = new SomeClass();
    someClass.getInteractions().add(new SomeClass.SomeInnerClass());
    SomeClass.@ValidSomeInnerClass someInnerClass = someClass
      .getInteractions()
      .get(0);
    Assertions.assertNotNull(someInnerClass);
  }
}
