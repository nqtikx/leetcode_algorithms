package com.training;

public class StudentAttendanceRecord1_551 {
  public static boolean checkRecord(String s) {
    if (s.length() <= 1) {
      return true;
    }
    int a = 0;
    boolean flag = false;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'A') {
        a++;
      } else if (s.charAt(i) == 'L') {
        if (s.length() - 1 != i && i != 0) {
          if (s.charAt(i - 1) == 'L' && s.charAt(i + 1) == 'L') {
            flag = true;
          }
        }
      }
    }
    return a < 2 && (flag != true);
  }

  public static void main(String[] args) {
    System.out.println(checkRecord("LLLL"));
  }
}
