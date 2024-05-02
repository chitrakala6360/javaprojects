package conditionalstatements;

import java.util.Scanner;

public class doublearray {

    public static void main(String[] args) {
        int [] a=new int[3];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number you want to make it double");
        for(int i=0;i<a.length;i++)
        {
            int c=sc.nextInt();
            System.out.println(c*2);
        }

    }
}
