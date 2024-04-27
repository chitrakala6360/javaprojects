package conditionalstatements;

import java.util.Scanner;

public class fizzbuzz {

    public static void main(String[] args) {
        System.out.println("numbers from 1-100");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("fizz buzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
