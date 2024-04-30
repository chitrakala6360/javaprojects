package conditionalstatements;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        System.out.println("Enter any number");
        Scanner sc=new Scanner(System.in);
    int actual=sc.nextInt();
    int temp=actual;
    int rev=0, rem;
    while(temp!=0){
        rem=temp%10;
        rev=rev*10+rem;
        temp=temp/10;
    }
    if(rev==actual)
    {
        System.out.println("palindrome");
    }
    else {
        System.out.println("not a palindrome");
    }
    }
}
