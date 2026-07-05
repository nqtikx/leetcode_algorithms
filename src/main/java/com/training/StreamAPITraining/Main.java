package com.training.StreamAPITraining;

import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;

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
//    System.out.println(task12(persons));
   task13(persons);
   task14(persons);
   task15(persons);
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
        .sorted()
        .forEach(System.out::println);
  }

  public static void task5(List<Person> persons) {
    persons.stream()
        .filter(p -> p.getSalary() > 10000)
        .forEach(p -> System.out.println("name: " + p.getName() + "\n salary: " + p.getSalary()));
  }

  public static void task6(List<Person> persons) {
    persons.stream()
        .limit(3)
        .sorted(Comparator.comparingInt(Person::getAge).reversed())
        .forEach(p -> System.out.println("name: " + p.getName() + "\n salary: " + p.getAge()));
  }

  public static void task7(List<Person> persons) {
    persons.stream()
        .limit(3)
        .sorted(Comparator.comparingInt(Person::getSalary).reversed())
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

  /*public static int task12(List<Person> persons) {
    return persons.stream()
        .limit(1)
        .sorted(Comparator.comparingInt(Person::getSalary).reversed())
        .mapToInt(Person::getSalary);
  }*/

  /*public static OptionalDouble task13(List<Person> persons) {
    return persons.stream()
        .mapToInt(Person::getSalary)
        .average();
  }

  public static OptionalDouble task14(List<Person> persons) {
    return persons.stream()
        .mapToInt(Person::getSalary)
        .average();
  }

  public static OptionalDouble task15(List<Person> persons) {
    return persons.stream()
        .mapToInt(Person::getSalary)
        .average();
  }*/

}
