import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/* #############
 * #  PROBLEM  #
 * #############
 *
 * Given a 2D array, an hour glass in the array is
 * shaped like this:
 * 
 * a b c
 *   d
 * e f g
 *
 * Find the hourglass with the largest sum in the array.
 * Assume dimension will always be 6x6. */

/* ############
 * #  APROAH  # 
 * ############
 * 
 * Divide array into 3x3 submatrices and add up elements. */

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
    
    int max = Integer.MIN_VALUE;
    
    // divide grid into 3x3 blocks
    for (int topLeft = 0; topLeft < 4; topLeft++) {
        int sum = 0;
        for (int bottomLeft = 0; bottomLeft < 4; bottomLeft++) {
            sum = addElem(arr, topLeft, bottomLeft);
            max = Math.max(sum, max);
        }
    }
    
    System.out.println(max);
    }
        
    // helper to add up elements in submatrix
    public static int addElem (int[][] arr, int r, int c) {
        int result = 0;
        for (int i = 0; i < 3; i++) {
            // top row
            result += arr[r][c + i];
            // bottom row
            result += arr[r + 2][c + i];
        }
        // add middle
        result += arr[r + 1][c + 1];
        return result;
    }
}


