import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        String number = String.valueOf(input.nextInt());
        String[] digits = number.split("(?<=.)");
        double is_amstrong = 0;
        for (int i = 0; i < digits.length; i++) {
            is_amstrong += Math.pow(Double.parseDouble(digits[i]),3);
        }
        if(Integer.valueOf(number) == is_amstrong){
            System.out.println("it is an Amstrong number");
        }
        else{
            System.out.println("it is not an Amstrong number");
        }
    }
}
