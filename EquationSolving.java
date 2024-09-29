import java.util.Scanner;
import java.lang.Math;

public class EquationSolving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.The first-degree equation (linear equation) with one variable");
        System.out.println("2.The system of first-degree equations (linear system) with two variables");
        System.out.println("3.The second-degree equation with one variable");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:{
                System.out.println("First degree equation ax + b = 0");
                System.out.print("a = ");
                double a = sc.nextDouble();
                System.out.print("b = ");
                double b = sc.nextDouble();

                if (a == 0) System.out.println("This equation has no solution" );
                else System.out.println("The root of this equation is: " + -b/a );
            }

            case 2:{
                System.out.println("First degree equation ax1 + b = c");
                System.out.print("a = ");
                double a = sc.nextDouble();
                System.out.print("b =  ");
                double b = sc.nextDouble();
                System.out.print("c = ");
                double c = sc.nextDouble();

                System.out.println("Second degree equation dx2 + e = f");
                System.out.print("d = ");
                double d = sc.nextDouble();
                System.out.print("e = ");
                double e = sc.nextDouble();
                System.out.print("f = ");
                double f = sc.nextDouble();

                double D = a * e - d * b;
                double D1 = c * e - f * b;
                double D2 = a * f - d * c;

                if (D != 0) System.out.println("The root of this equation is: " + "x1 = " + D1/D + " and x2 = " + D2/D );
                else {
                    if (D1 == 0 && D2 == 0) System.out.println("This equation has infinite solutions");
                    else if (D1 != 0 || D2 != 0) System.out.println("This equation has no solution");
                }
            }

            case 3:{
                System.out.println("Second degree equation ax^2 + bx + c = 0");
                System.out.print("a = ");
                double a = sc.nextDouble();
                System.out.print("b =  ");
                double b = sc.nextDouble();
                System.out.print("c =  ");
                double c = sc.nextDouble();

                if (a == 0){
                    if (b == 0){
                        if (c == 0) System.out.println("This equation has infinite solutions");
                        else System.out.println("This equation has no solution");
                    }
                    else System.out.println("The root of this equation is: " + -c/b );
                }
                else {
                    double delta = b*b - 4*a*c;
                    if (delta < 0) System.out.println("This equation has no solution");
                    else if (delta == 0) System.out.println("The root of this equation is: " + -b/(2*a) );
                    else {
                        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                        System.out.println("The root of this equation is: " + x1 + " and " + x2 );
                    }
                }
            }
        }
    }
}
