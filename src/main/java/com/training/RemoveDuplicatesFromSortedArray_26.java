package com.training;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray_26 {
  public static int removeDuplicates(int[] nums) {
    int i = 1;
    for (int j = 1; j < nums.length; j++) {
      if (nums[j] != nums[i - 1]) {
        nums[i] = nums[j];
        i++;
      }
    }
    return i;
  }

  public static void main(String[] args) {
    int[] nums = {0,0,1,2,3};
    System.out.println(removeDuplicates(nums));
  }
}
