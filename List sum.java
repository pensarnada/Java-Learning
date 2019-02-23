import java.util.Scanner;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
    n=-1;
    System.out.println("Enter your n:");
    while (n<=0);
    {
        Scanner int n = new Scanner(System.in);
        if n<=0
        {
            System.out.println("Enter your n again!")
        }
    }
    Scanner numbers = new Scanner(System.in);
    int[] ar = new int[n];
    int[] ar = numbers.split(" ");
    result=True;
    counter=0;
    while result==True;
    {
        for (i=0;i<=n;i++)
        {
            if ar[i]>=1000
            {
                counter+=1
            }
        }
        if counter==0
        {
            result=False;
        else
        {
            Scanner numbers = new Scanner(System.in);
            int[] ar = new int[n];
            int[] ar = numbers.split(" ");
            counter=0;
        }
    }

    static int simpleArraySum(int[] ar) {
        for (int i=0;i<=10;i++)
        {
            int sumof = sumof + ar[i];
        }
        return sumof;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = Integer.parseInt(scanner.nextLine().trim());

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");

        for (int arItr = 0; arItr < arCount; arItr++) {
            int arItem = Integer.parseInt(arItems[arItr].trim());
            ar[arItr] = arItem;
        }

        int result = simpleArraySum(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
