package edu.cnm.deepdive;

public class Practice {

  public static boolean isSquare(int n){
    double root = Math.sqrt(n);
    int roundRoot = (int) Math.round(root);
    return roundRoot * roundRoot == n;
  }

}
