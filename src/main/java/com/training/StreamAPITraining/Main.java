package com.training.StreamAPITraining;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    Data data = new Data();
    List<Person> persons = data.getPersons();
    task1(persons);
    task2(persons);
    task3(persons);
    task4(persons);
    task5(persons);
    task6(persons);
    task7(persons);
    System.out.println(task8(persons));
    System.out.println(task9(persons));
    System.out.println(task10(persons));
    System.out.println(task11(persons));
    task12(persons);
    task13(persons);
  }

  public static void task1(List<Person> persons) {
    persons.stream()
        .filter(p -> p.getAge() > 50)
        .forEach(System.out::println);
  }

  public static void task2(List<Person> persons) {
    persons.stream()
        .map(p -> p.getName() + " " + p.getLastName())
        .forEach(System.out::println);
  }

  public static void task3(List<Person> persons) {
    persons.stream()
        .sorted(Comparator.comparingInt(Person::getAge))
        .forEach(p -> System.out.println(p.getName()));
  }

  public static void task4(List<Person> persons) {
    persons.stream()
        .sorted(Comparator.comparing(Person::getName))
        .forEach(System.out::println);
  }

  public static void task5(List<Person> persons) {
    persons.stream()
        .filter(p -> p.getSalary() > 10000)
        .forEach(p -> System.out.println("name: " + p.getName() + "\n salary: " + p.getSalary()));
  }

  public static void task6(List<Person> persons) {
    persons.stream()
        .sorted(Comparator.comparingInt(Person::getAge).reversed())
        .limit(3)
        .forEach(p -> System.out.println("name: " + p.getName() + "\n salary: " + p.getAge()));
  }

  public static void task7(List<Person> persons) {
    persons.stream()
        .sorted(Comparator.comparingInt(Person::getSalary).reversed())
        .limit(3)
        .forEach(p -> System.out.println("name: " + p.getName()));
  }

  public static boolean task8(List<Person> persons) {
    return persons.stream()
        .anyMatch(p -> p.getName().equals("Anton"));
  }

  public static boolean task9(List<Person> persons) {
    return persons.stream()
        .anyMatch(p -> p.getAge() > 80);
  }

  public static int task10(List<Person> persons) {
    return persons.stream()
        .mapToInt(Person::getAge)
        .sum();
  }

  public static OptionalDouble task11(List<Person> persons) {
    return persons.stream()
        .mapToInt(Person::getSalary)
        .average();
  }

  public static void task12(List<Person> persons) {
    Optional<Person> res =  persons.stream()
        .max(Comparator.comparingInt(Person::getSalary));

    res.ifPresent(p -> System.out.println(p.getAge() + " " + p.getLastName()));
  }

  public static void task13(List<Person> persons) {
   Map<String, List<String>> res = persons.stream()
        .collect(Collectors.groupingBy(
            p -> {
              if (p.getAge() < 40) return "Молодой";
              if (p.getAge() <= 60) return "Средний";
              return "Пожилой";
            },
            Collectors.mapping( // take only names
                Person::getName,
                Collectors.toList()
            )
        ));

   res.forEach((k, v) -> System.out.println(k + ": " + v));
  }
}
