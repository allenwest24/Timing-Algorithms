import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BigInteger big = BigInteger.ZERO;
        BigInteger zero = BigInteger.ZERO;
        List<BigInteger> pleaseWork = new ArrayList<BigInteger>();
        BigInteger million = new BigInteger("1000000");
        BigInteger one = new BigInteger("1");
        List<BigInteger> myList = new ArrayList<BigInteger>();
        Scanner myScanner = new Scanner(System.in);
        while(myScanner.hasNextLine()) {
            BigInteger i = new BigInteger(myScanner.nextLine());
            big = big.multiply(million);
            big = big.add(i);
            for (int j = 2; j < 1000001; j++) {
                BigInteger a = new BigInteger("" + j);
                if (big.mod(a).equals(zero) && !(big.equals(a))) {
                    pleaseWork.add(a);
                }
            }
        }
        if (pleaseWork.size() == 0) {
            System.out.println("prime");
        }
        else {
            for (int k = 0; k < pleaseWork.size(); ++k) {
                System.out.println(pleaseWork.get(k));
            } 
        } 
    }
}
