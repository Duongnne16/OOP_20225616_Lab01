import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");

        double num1 = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;

        System.out.println("The sum is: " + sum);
        System.out.println("The difference is: " + difference);
        System.out.println("The product is: " + product);

        if (num2 != 0){
            double quotient = num1 / num2;
            System.out.println("The quotient is: " + quotient);
        }
        else System.out.println("Error: Division by zero");

        sc.close();
    }
}
