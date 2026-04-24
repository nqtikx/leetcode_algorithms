package com.training;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays_349 {
  public static int[] intersection(int[] nums1, int[] nums2) {
    Set<Integer> unique = new HashSet<>();
    if (nums1.length < nums2.length) {
      return intersection(nums2, nums1);
    }
    for (Integer el : nums1) {
      unique.add(el);
    }
    Set<Integer> resultSet = new HashSet<>();
    for (Integer el : nums2) {
      if (unique.contains(el)) {
        resultSet.add(el);
      }
    }
    int[] res = new int[resultSet.size()];
    int i = 0;
    for(Integer el : resultSet) {
      res[i++] = el;
    }
    return res;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2})));
  }
}
