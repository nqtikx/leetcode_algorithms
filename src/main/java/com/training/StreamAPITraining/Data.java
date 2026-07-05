package com.training.StreamAPITraining;

import java.util.ArrayList;
import java.util.List;

public class Data {
  List<Person> persons = List.of(
      new Person("Lev", "Tolstoy", 82, 1500, List.of("reading", "chess", "walking")),
      new Person("Fyodor", "Dostoevsky", 59, 800, List.of("gambling", "reading")),
      new Person("Alexander", "Pushkin", 37, 1200, List.of("writing", "dueling", "reading")),
      new Person("Anton", "Chekhov", 44, 600, List.of("writing", "gardening", "traveling")),
      new Person("Nikolai", "Gogol", 43, 500, List.of("writing", "cooking", "walking")),
      new Person("Ivan", "Turgenev", 64, 900, List.of("hunting", "reading", "traveling")),
      new Person("Mikhail", "Bulgakov", 48, 700, List.of("writing", "theatre", "reading")),
      new Person("Boris", "Pasternak", 70, 1100, List.of("writing", "music", "translating")),
      new Person("Anna", "Akhmatova", 77, 1300, List.of("poetry", "reading", "walking")),
      new Person("Vladimir", "Mayakovsky", 36, 400, List.of("poetry", "acting", "drawing"))
  );

  public List<Person> getPersons() {
    return persons;
  }
}
