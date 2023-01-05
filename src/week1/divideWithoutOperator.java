package week1;

import java.util.Scanner;

public class divideWithoutOperator {

    public static void main(String[] args) {

        System.out.println("Enter a Dividend: ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        System.out.println("Enter a Divisor: ");
        int num2 = input.nextInt();

        int count = 0;

        while(num1 >= num2){
            num1 = num1 - num2;
            count++;
        }
        System.out.println(count);


    }
}


