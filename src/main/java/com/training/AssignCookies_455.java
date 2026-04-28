package com.training;

import java.util.Arrays;

public class AssignCookies_455 {
  public static int findContentChildren(int[] g, int[] s) {
    Arrays.sort(g);
    Arrays.sort(s);
    int i = 0;
    int j = 0;
    while (i < g.length && j < s.length) {
      if (s[j] >= g[i]) {
        i++;
      }
      j++;
    }
    return i;
  }

  public static void main(String[] args) {
    System.out.println(findContentChildren(new int[]{3,2,3}, new int[]{1,2,1}));
  }
}
