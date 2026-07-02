package com.training;

import java.util.Arrays;

public class MaximumNumberOfWordsFoundInSentences_2114 {
  public static int mostWordsFound(String[] sentences) {
    int temp = 0;
    for (int i = 0; i < sentences.length; i++) {
      String[] s = sentences[i].split(" ");
      if (temp < s.length) {
        temp = s.length;
      }
    }
    return temp;
  }

  public static void main(String[] args) {
    System.out.println(mostWordsFound(new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"}));
  }
}
