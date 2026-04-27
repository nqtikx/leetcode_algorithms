package com.training;

public class IsSubsequence_392 {
  public static boolean isSubsequence(String s, String t) {
    if (s.length() > t.length()) {
      return false;
    } else if (s.isEmpty()) {
      return true;
    }
    boolean temp = false;
    char[] schar = s.toCharArray();
    char[] tchar = t.toCharArray();
    for (int i = 0, j = 0; i < schar.length && j < tchar.length;) {
      if (schar[i] == tchar[j]) {
        i++;
      }
      j++;
      if (i == schar.length) {
        temp = true;
        break;
      }
    }
    return temp;
  }

  public static void main(String[] args) {
    System.out.println(isSubsequence("abc", "aefcdb"));
  }
}
