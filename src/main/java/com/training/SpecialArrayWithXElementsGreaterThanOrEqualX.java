package com.training;

import java.util.Arrays;
import java.util.Scanner;

public class SpecialArrayWithXElementsGreaterThanOrEqualX {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int length = scanner.nextInt();
    int[] nums = new int[length];
    for (int i = 0; i < length; i++) {
      nums[i] = scanner.nextInt();
    }
    System.out.println(specialArray(nums));
  }

  public static int specialArray(int[] nums) {
    Arrays.sort(nums);
    for (int x = 0; x <= nums.length; x++) {
      int temp = 0;
      for (int num : nums) {
        if (num >= x) temp++;
      }
      if (temp == x) return x;
    }
    return -1;
  }
}
