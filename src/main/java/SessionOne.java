
import java.util.Scanner;


public class SessionOne {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Press 1, if you want to see if it's an Armstrong number");
        System.out.println("Press 2, whether you want to see if it's an Strong number");
        System.out.println("Press 3, whether you want to see if it's an Perfect number");

        int option = input.nextInt();

        System.out.println("Enter a number");
        String number = String.valueOf(input.nextInt());

        switch (option) {
            case 1:
                isAnArmstrongNumber(number);
            case 2:
                isAStrongNumber(number);
            case 3:
                isAPerfectNumber(Integer.valueOf(number));
            case 4:
                isAPrimeNumber(Integer.valueOf(number));
        }
    }

    public static void isAnArmstrongNumber(String number) {
        String[] digits = number.split("(?<=.)");

        double isArmstrong = 0;

        for (int i = 0; i < digits.length; i++) {

            isArmstrong += Math.pow(Double.parseDouble(digits[i]), 3);
        }

        if (Integer.valueOf(number) == isArmstrong) {
            System.out.println("it is an Armstrong number");
        } else {
            System.out.println("it is not an Armstrong number");
        }
    }


    public static void isAStrongNumber(String number) {
        String[] digits = number.split("(?<=.)");

        double isStrong = 0;

        for (int i = 0; i < digits.length; i++) {
            int factorial = 1;
            int digit = Integer.valueOf(digits[i]);

            for (int j = digit; j > 1; j = j - 2) {
                int tempNumber = 0;
                tempNumber = (j * (j - 1));
                factorial *= tempNumber;
            }
            isStrong += factorial;
        }

        if (isStrong == Integer.valueOf(number)) {
            System.out.println("The number is a Strong number " + isStrong);
        } else {
            System.out.println("The number is not a Strong number " + isStrong);
        }
    }

    public static void isAPerfectNumber(int number) {
        int divisors = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                divisors += i;
            }
        }
        if (divisors == number)
            System.out.println("The entered number " + number + " is a perfect number");
        else
            System.out.println("The entered number " + number + " is not a perfect number");
    }

    public static void nextPrimeNumber(int number){
        boolean isPrime = isAPrimeNumber(number+1);
        int nextPrime = number+2;
        while (isPrime==false){
            nextPrime = number+1;
            isPrime = isAPrimeNumber(nextPrime);
        }
        if(isPrime == true){
            System.out.println("number " + nextPrime);
        }
    }

    public static boolean isAPrimeNumber(int number){
        int divisors = 1;
        for (int i = 2; i <= number; i++) {
            if(number%i == 0){
                divisors++;
                if(divisors>2) {
                    System.out.println("The number is not prime");
                    break;
                }
            }
        }
        if(divisors==2) {
            System.out.println("the number is prime");
            return true;
        }
        else
            return false;
    }
}

