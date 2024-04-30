package conditionalstatements;

import java.util.Scanner;

public class lab011
{
    public static void main(String[] args) {

        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        switch(a){
            case 1:
               System.out.println("mon");
               break;
            case 2:
                System.out.println("tue");
                break;
            case 3:
                System.out.println("wed");
                break;
            case 4:
                System.out.println("thur");
                break;
            case 5:
                System.out.println("fri");
                break;
            default :
                System.out.println("we cannot perform this operation");
    }
    }}
