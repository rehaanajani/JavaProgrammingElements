import java.util.Scanner;

public class Level2Practice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number1: ");
        double number1 = input.nextDouble();

        System.out.print("Enter number2: ");
        double number2 = input.nextDouble();

        double add = number1 + number2;
        double sub = number1 - number2;
        double mul = number1 * number2;
        double div = number1 / number2;

        System.out.println("Addition: " + add);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + mul);
        System.out.println("Division: " + div);

        input.close();
    }
}