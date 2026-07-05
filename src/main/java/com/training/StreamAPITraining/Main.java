package com.training.StreamAPITraining;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    Data data = new Data();
    List<Person> persons = data.getPersons();

    Supplier<List<Person>> persons2 = () -> persons.stream()
        .map(person -> new Person(person.getName() + " Miracle", person.getLastname(),
            person.getAge()))
        .filter(s -> s.getAge() > 50)
        .collect(Collectors.toList());

     Optional<Person> persons3 = persons.stream()
        .filter(s -> s.getAge() > 50)
        .findAny();

    persons2.get().forEach(System.out::println);

    System.out.println(persons3);

    System.out.println(persons.stream()
        .filter(s -> s.getAge() > 50)
        .count());

    /*for(Person el : persons2.get()) {
      System.out.println(el);
    }*/
  }
}
