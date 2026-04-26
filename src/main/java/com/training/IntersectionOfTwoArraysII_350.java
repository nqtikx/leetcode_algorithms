package com.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class IntersectionOfTwoArraysII_350 {
  public static int[] intersect(int[] nums1, int[] nums2) {
    Map<Integer, Integer> counts = new HashMap<>();

    for (int num : nums1) {
      counts.put(num, counts.getOrDefault(num, 0) + 1);
    }

    List<Integer> result = new ArrayList<>();

    for (int num : nums2) {
      int count = counts.getOrDefault(num, 0);

      if (count > 0) {
        result.add(num);
        counts.put(num, count - 1);
      }
    }

    int[] answer = new int[result.size()];

    for (int i = 0; i < result.size(); i++) {
      answer[i] = result.get(i);
    }

    return answer;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2})));
  }
}
