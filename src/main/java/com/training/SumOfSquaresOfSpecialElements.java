package com.training;

import java.util.Scanner;

public class SumOfSquaresOfSpecialElements {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int l = scanner.nextInt();
    int[] nums = new int[l];
    for(int i = 0; i < l; i++) {
      nums[i] = scanner.nextInt();
    }
    System.out.println(sumOfSquares(nums));
  }
  public static int sumOfSquares(int[] nums) {
    int l = nums.length;
    int temp = 0;
    for(int i = 0; i < l; i++) {
      if (l % (i + 1) == 0) {
        temp += nums[i] * nums[i];
      }
    }
    return temp;
  }
}
