package conditionalstatements;

import java.util.Scanner;

public class palindrom_using_javamethods {
    public static void main(String[] args) {
        System.out.println("enter any number or word");
        Scanner sc=new Scanner(System.in);
        String actual_string=sc.nextLine();
        StringBuffer sb=new StringBuffer(actual_string);
        String rev_string=sb.reverse().toString();
        if(rev_string.equalsIgnoreCase(actual_string))
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not a palindrome");
        }
    }

}
