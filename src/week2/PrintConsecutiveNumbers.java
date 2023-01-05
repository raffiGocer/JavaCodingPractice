package week2;

public class PrintConsecutiveNumbers {

    public static void main(String[] args) {
        int N = 20;  // Replace N with the positive integer you want to use

        for (int i = 1; i <= N; i++) { // loop will run until it reaches the N number
            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) { // if number divisible by 2, 3 and 5 it will print
                System.out.println("CodilityTestCoders");
            } else if (i % 2 == 0 && i % 3 == 0) { // if number divisible by 2 and 3, it will print
                System.out.println("CodilityTest");
            } else if (i % 2 == 0 && i % 5 == 0) { // if number divisible by 2 and 5, it will print
                System.out.println("CodilityCoders");
            } else if (i % 3 == 0 && i % 5 == 0) { // if number divisible by 3 and 5, it will print
                System.out.println("TestCoders");
            } else if (i % 2 == 0) { // if the number divisible by 2, it will print Codility
                System.out.println("Codility");
            } else if (i % 3 == 0) { // by 3, it will print Test
                System.out.println("Test");
            } else if (i % 5 == 0) { // by 5, it will print Coders
                System.out.println("Coders");
            } else { // if not divisible by 2, 3 or 5, it will print the number
                System.out.println(i);
            }
        }
    }
}

