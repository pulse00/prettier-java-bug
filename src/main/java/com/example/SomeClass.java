package com.example;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;

public class SomeClass {

  private List<@Valid SomeInnerClass> interactions = new ArrayList<>();

  public List<SomeInnerClass> getInteractions() {
    return interactions;
  }

  public static class SomeInnerClass {}
}
