
package za.ac.cput;

import java.util.Scanner;

public class Program {
    public static void main(String [] args){
        int num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");
        num1 = scanner.nextInt();
        System.out.print("Enter second number:");
        num2 = scanner.nextInt();

        System.out.print("Select an operator" +"\n" +" 1.Addition" +"\n" +" 2.Subtraction" +"\n" +" 3.Multiplication" +"\n" +" 4.Division" +"\n");
        int operator = scanner.nextInt();

        scanner.close();
        int output;
        switch(operator) {
            case 1:
                output = num1 + num2;
                break;

            case 2:
                output = num1 - num2;
                break;

            case 3:
                output = num1 * num2;
                break;

            case 4:
                output = num1 / num2;
                break;

            default:
                System.out.printf("Select operator");
                return;
        }
        System.out.println("Your final answer is: " + output);
    }
    }

