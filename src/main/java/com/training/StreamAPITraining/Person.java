package com.training.StreamAPITraining;

import java.util.List;

public class Person implements Comparable<Person> {
  private String name;
  private String lastName;
  private int age;
  private int salary;
  private List<String> hobbies;

  public Person(String name, String lastName, int age, int salary, List<String> hobbies) {
    this.name = name;
    this.lastName = lastName;
    this.age = age;
    this.salary = salary;
    this.hobbies = hobbies;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public List<String> getHobbies() {
    return hobbies;
  }

  public void setHobbies(List<String> hobbies) {
    this.hobbies = hobbies;
  }

  @Override
  public String toString() {
    return "Person: {" + "name: " + getName()
        + ", lastname: " + getLastName()
        + ", age: " + getAge() + "};";
  }


  @Override
  public int compareTo(Person o) {
    return getName().compareTo(o.getName());
  }
}
