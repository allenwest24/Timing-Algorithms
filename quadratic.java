import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner myScanner = new Scanner(System.in);
        List<Integer> myList = new ArrayList<Integer>();
        List<Integer> maxValue = new ArrayList<Integer>();
        HashSet<Integer> h = new HashSet<Integer>();
        maxValue.add(0);
        maxValue.add(0);
        maxValue.add(0);
        while(myScanner.hasNextInt()) {
            int i = myScanner.nextInt();
            myList.add(i);
            h.add(i);
        }
        for (int j = 0; j < myList.size(); j++) {
            int a = myList.get(j);
            for (int k = 0; k < myList.size(); k++) {                    
                int b = myList.get(k);
                if (h.contains(a + b))  {   
                    int c = (a + b);
                    if (c > maxValue.get(2)) {
                        maxValue.set(0, a);
                        maxValue.set(1, b);
                        maxValue.set(2, c);
                    }
                }
            }
        }
    Collections.sort(maxValue);
    System.out.println(maxValue.get(0));
    System.out.println(maxValue.get(1));
    System.out.println(maxValue.get(2));
    }
}
    
