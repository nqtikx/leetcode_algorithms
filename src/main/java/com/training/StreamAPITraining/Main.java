package com.training.StreamAPITraining;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    Data data = new Data();
    List<Person> persons = data.getPersons();

    for(Person el : persons) {
      System.out.println(el);
    }
  }
}
