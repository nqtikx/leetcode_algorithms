package com.training;

public class DetectCapital_520 {
  public static boolean detectCapitalUse(String word) {
    if (word == null || word.isEmpty()) {
      return false;
    }
    int flag = 0;
    if ((int) word.charAt(0) >= 65  && (int) word.charAt(0) <= 90) {
      flag++;
    }
    int temp = 0;
    for (int i = 0; i < word.length(); i++) {
      if ((int) word.charAt(i) >= 65  && (int) word.charAt(i) <= 90) {
        temp++;
      }
    }
    if ((flag == 1 && temp == 1) || (flag == 0 && temp == 0)) {
      return true;
    }
    else {
      return temp == word.length();
    }
  }

  public static void main(String[] args) {
    System.out.println(detectCapitalUse("GGG"));
  }
}
