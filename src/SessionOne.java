import java.util.Scanner;

public class SessionOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Press 1, if you want to see if it's an SessionOne number");
        System.out.println("Press 2, whether you want to see if it's an Strong number");
        System.out.println("Press 3, whether you want to see if it's an Perfect number");

        int option = input.nextInt();
        System.out.println("Enter a number");
        String number = String.valueOf(input.nextInt());

        switch (option) {
            case 1:
                isAnAmstrongNumber(number);
            case 2:
                isAnStrongNumber(number);
            case 3:
                isAPerfectNumber(Integer.valueOf(number));
        }
    }

    public static void isAnAmstrongNumber(String number) {
        String[] digits = number.split("(?<=.)");
        double is_amstrong = 0;

        for (int i = 0; i < digits.length; i++) {
            is_amstrong += Math.pow(Double.parseDouble(digits[i]), 3);
        }
        if (Integer.valueOf(number) == is_amstrong) {
            System.out.println("it is an SessionOne number");
        } else {
            System.out.println("it is not an SessionOne number");
        }
    }

    public static void isAnStrongNumber(String number) {
        String[] digits = number.split("(?<=.)");

        double isStrong = 0;

        for (int i = 0; i < digits.length; i++) {
            int factorial = 1;
            int digit = Integer.valueOf(digits[i]);

            for (int j = digit; j > 1; j = j - 2) {
                int tempNumber;
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

        if (divisors == number) {
            System.out.println("The entered number " + number + " is a perfect number");
        } else {
            System.out.println("The entered number " + number + " is not a perfect number");
        }
    }
}
