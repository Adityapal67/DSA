package Leetcode.Leetcode;

public class LargestTriangleArea {
    public static void main(String[] args) {

    }
    public static double largestTriangleArea(int[][] points) {
      int maxX=0,maxY=0;
//      int i =0;
//      while(i<points.length){
//         for(int x:points[i][0]){
//             maxX = Math.max(maxX,x);
//         }
//          for(int y:points[i][1]){
//              maxY = Math.max(maxY,y);
//          }
//      }
      double area = (maxX*maxY)*0.5;
      return area;
    }
}
