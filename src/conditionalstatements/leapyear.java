package conditionalstatements;

import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        System.out.println("Enter any year");
        Scanner sc=new Scanner(System.in);
        int a=  sc.nextInt();
        if(a%4==0&&a%100!=0||a%400==0)
        {
            System.out.println("leap year"+a);
        }
        else {
            System.out.println("not a leap year"+a);
        }
    }
}
