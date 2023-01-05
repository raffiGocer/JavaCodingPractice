package week2;

public class SwapNumbersWithoutThirdVariable {

    public static void main(String[] args) {
        // I wrote a method that swaps numbers without third variable

        int x = 10; // I initialized x
        int y = 20; // I initialized y

        System.out.println("Before swapping: x = " + x + ", y = " + y);

        x = x + y; // x now becomes 30
        y = x - y; // y becomes 10
        x = x - y; // x becomes 20

        System.out.println("After swapping: x = " + x + ", y = " + y);
    }
}


