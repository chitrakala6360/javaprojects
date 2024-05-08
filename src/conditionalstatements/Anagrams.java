package conditionalstatements;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first string");
        String s1=sc.nextLine();
        s1=s1.toLowerCase();
        System.out.println("enter second string");
        String s2=sc.nextLine();
        s2=s2.toLowerCase();
       if(s1.length()==s2.length())
       {
           char[] c1=s1.toCharArray();
           char[] c2=s2.toCharArray();
           Arrays.sort(c1);
           Arrays.sort(c2);
          if(Arrays.equals(c1,c2))
          {
              System.out.println("anagram");
          }
          else {
              System.out.println("not a anagram");
          }

       }

else {
           System.out.println("not a anagram");
       }
    }

}


