package com.training;

public class AddStrings_415 {
  public static String addStrings(String num1, String num2) {
    StringBuilder res = new StringBuilder();

    int length1 = num1.length() - 1;
    int length2 = num2.length() - 1;
    int carry = 0;

    while (length1 >= 0 || length2 >= 0 || carry > 0) {
      int sum = (length1 >= 0 ? num1.charAt(length1) : 48)
          + (length2 >= 0 ? num2.charAt(length2) : 48)
          - 96 + carry; // asc2 table 48 -> '0'; 96 т.к. 48*2
      carry = sum / 10; // if sum > 10 -> надо перенос 1 делать
      res.append(sum % 10);
      length1--;
      length2--;
    }
    return res.reverse().toString();
  }

  public static void main(String[] args) {
    System.out.println(addStrings("123","11"));
  }
}
