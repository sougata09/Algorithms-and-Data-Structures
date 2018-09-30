import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Review {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int T =  Integer.parseInt(scan.nextLine());
        String[] str = new String[T];
        for(int k=0;k<T;k++)
        {
            str[k] = scan.nextLine();
        }
        for(int i=0;i<T;i++)
        {
            StringBuilder even =new StringBuilder("");
            StringBuilder odd =new StringBuilder("");
            for(int j=0;j<str[i].length();j++)
            {
                if((j%2)==0)
                {
                    even.append(String.valueOf(str[i].charAt(j)));
                }
                else{
                    odd.append(String.valueOf(str[i].charAt(j)));
                }
            }
            System.out.println(even.toString() + " " + odd.toString());
        }
    }
}
