package com.training;

public class FindNearestPointThatHasTheSameXorYCoordinate {

  public static void main(String[] args) {
    int x = 3, y = 4;
    int[][] points = new int[][] {
        {1, 2},
        {3, 1},
        {2, 4},
        {2, 3},
        {4, 4}
    };
    System.out.println(nearestValidPoint(x, y, points));
  }
  public static int nearestValidPoint(int x, int y, int[][] points) {
    int bestIndex = -1;
    int result = 1000000000;
    for (int i = 0; i < points.length; i++) {
      for (int j = 0; j < points[i].length - 1; j++) {
        if (points[i][j] - x == 0 || points[i][j+1] - y == 0) {
          if (result > Math.abs(points[i][j] - x) + Math.abs(points[i][j+1] - y)) {
            result = Math.abs(points[i][j] - x) + Math.abs(points[i][j+1] - y);
            bestIndex = i;
          }
        }
      }
    }
    return bestIndex;
  }
}
