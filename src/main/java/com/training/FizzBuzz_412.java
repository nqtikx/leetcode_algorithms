package com.training;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz_412 {
  public static List<String> fizzBuzz(int n) {
    List<String> str = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      str.add(String.valueOf(i));
      if (i % 3 == 0 && i % 5 == 0) {
        str.set(i - 1, "FizzBuzz");
      } else if (i % 3 == 0) {
        str.set(i - 1, "Fizz");
      } else if (i % 5 == 0) {
        str.set(i - 1, "Buzz");
      }
    }
    return str;
  }

  public static void main(String[] args) {
    System.out.println(fizzBuzz(15));
  }
}
