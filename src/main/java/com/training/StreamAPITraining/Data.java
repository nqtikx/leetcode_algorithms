package com.training.StreamAPITraining;

import java.util.ArrayList;
import java.util.List;

public class Data {
  List<Person> persons = new ArrayList<>(List.of(
      new Person("Lev", "Tolstoy", 82),
      new Person("Fyodor", "Dostoevsky", 59),
      new Person("Alexander", "Pushkin", 37),
      new Person("Anton", "Chekhov", 44),
      new Person("Nikolai", "Gogol", 43),
      new Person("Ivan", "Turgenev", 64),
      new Person("Mikhail", "Bulgakov", 48),
      new Person("Boris", "Pasternak", 70)
  ));

  public List<Person> getPersons() {
    return persons;
  }
}
