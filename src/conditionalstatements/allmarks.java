package conditionalstatements;

import java.util.Scanner;

public class allmarks {
    public static void main(String[] args) {
        int marks[]=new int[3];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the marks");
        for(int i=0;i<marks.length;i++){
            int a=sc.nextInt();
            System.out.println("the marks are: " +a);
        }
    }
}
