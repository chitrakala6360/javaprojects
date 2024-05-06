package conditionalstatements;

import java.util.Scanner;

public class max_salary {
    public static void main(String[] args) {
        int [] salary={30,50,60,90,10, 100,999};
        int max=0;
       for(int i=0;i<salary.length;i++)
       {
           if(salary[i]>max)
           {
               int n=salary[i];
                   max=n;
           }
       }
        System.out.println(max);

    }
}
