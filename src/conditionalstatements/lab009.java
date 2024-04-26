package conditionalstatements;

import java.util.Scanner;

public class lab009 {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
      int a=  sc.nextInt();
      if(a<0){
          System.out.println("neg");
      }
      else if(a==0)
      {
          System.out.println("zero");
        }
      else {
          System.out.println("positive4");
      }
    }
}
