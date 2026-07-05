package com.training.StreamAPITraining;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    Data data = new Data();
    List<Person> persons = data.getPersons();

    List<Person> persons2 = persons.stream()
        .sorted()
        .filter(s -> s.getAge() > 50)
        .toList();

    for(Person el : persons) {
      System.out.println(el);
    }
  }
}
