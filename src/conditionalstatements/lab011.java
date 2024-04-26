package conditionalstatements;

import java.util.Scanner;

public class lab011
{
    public static void main(String[] args) {

        System.out.println("enter a two numbers");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("what operation do you want to perform");
        char ch=sc.next().charAt(0);
        int res;
        switch(ch){
            case '*':
               res=a*b;
               System.out.println("the result is " +res);
               break;
            case '+':
                res=a+b;
                System.out.println("the result is " +res);
                break;
            case '/':
                res=a/b;
                System.out.println("the result is " +res);
                break;
            case '%':
                res=a%b;
                System.out.println("the result is " +res);
                break;
            case '-':
                res=a-b;
                System.out.println("the result is " +res);
                break;
            default :
                System.out.println("we cannot perform this operation");
    }
    }}
