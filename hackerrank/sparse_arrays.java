import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/* ############
 * # PROBLEM  #
 * ############
 * 
 * There are N strings. Each string's length is no more than 20
 * characters. There are also Q queries. For each query, you are 
 * given a string, and you need to find out how many times this
 * string occurred previously
 *
 * Input Format:
 * The first line contains N, the number of strings.
 * The next N lines each contain a string.
 * The N+2nd line contains Q, the number of queries.
 * The following Q lines each contain a query string.
 *
 * Sample Input:
 * 4
 * aba
 * baba
 * aba
 * xzxb
 * 3
 * aba
 * xzxb
 * ab
 * 
 * Sample Output:
 * 2
 * 1
 * 0
 * 
 * ##############
 * #  APPROACH  #
 * ##############
 * 
 * First loop counts queries and put them into a hashmap. Second
 * loop prints out queries and number of times they appear.
 * 
 */

public class sparse_arrays {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner inputs = new Scanner(System.in);

        // count queries
        int n = Integer.parseInt(inputs.nextLine());
        int index = 0;
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        while (index < n) {
            String query = inputs.nextLine();
            if (!result.containsKey(query)) {
                result.put(query, 1);
            } else {
                int temp = result.get(query);
                result.put(query, ++temp);
            }
            index++;
        }

        // print queries
        index = 0;
        int q = Integer.parseInt(inputs.nextLine());
        while (index < q) {
            String query2 = inputs.nextLine();
            if (!result.containsKey(query2)) {
                result.put(query2, 0);
            }
            System.out.println(result.get(query2));
            index++;
        }
    }
}
