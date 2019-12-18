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
        maxValue.add(0);
        maxValue.add(0);
        maxValue.add(0);
        while(myScanner.hasNextInt()) {
            int i = myScanner.nextInt();
            myList.add(i);
        }
        for (int j = 0; j < myList.size(); j++) {
            int a = myList.get(j);
            for (int k = 0; k < myList.size(); k++) {                    
                int b = myList.get(k);
                for (int l = 0; l < myList.size(); l++) {                    
                    int c = myList.get(l);
                    if (a + b == c) {
                        if (c > maxValue.get(2)) {
                            maxValue.set(0, a);
                            maxValue.set(1, b);
                            maxValue.set(2, c);
                        }
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
        
