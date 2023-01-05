package week1;

public class OddOrEven {

    public static void main(String[] args) {


        int number = 100;

        boolean isEven = number % 2 == 0; // When dividing a number by 2, the remainder is 0, the number is even

        //boolean isOdd = number % 2 != 0;// the number is odd

        boolean isOdd = !isEven;

        //System.out.println(number + " is an even number");

        System.out.println(number + " is a even number: " + isEven);
        System.out.println(number + " is an odd number: " + isOdd);
    }
}

