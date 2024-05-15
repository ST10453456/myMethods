
package com.mycompany.MyMethods;

import java.util.Scanner;

public class MyMethods {

	
    public void displayWelcomeMessage() {
        System.out.println("Welcome to Java Programming");
    }

    public int calculateStringLength(String str) {
        return str.length();
    }

    public boolean compareStrings(String str1, String str2) {
        return str1.equals(str2);
    }

    public boolean checkPasswordComplexity(String password) {
        boolean userPassword = false;
        
      if(!password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]*$")) ;
  
            userPassword = true;
      
           return userPassword;
           
     
           
}
   

    public double calculateTax(double salary) {
        if (salary < 10000) {
            return 0;
        } else if (salary <= 25000) {
            return salary * 0.14;
        } else {
            return salary * 0.25;
        }
    }

    public double performArithmeticOperation(double num1, double num2, String operation) {
        switch (operation) {
            case "add" -> {
                return num1 + num2;
            }
            case "subtract" -> {
                return num1 - num2;
            }
            case "multiply" -> {
                return num1 * num2;
            }
            case "divide" -> {
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    return Double.NaN;
                }
            }
            default -> {
                return Double.NaN;
            }
        }
    }

    public static void main(String[] args) {
        MyMethods myMethods = new MyMethods();
        Scanner scanner = new Scanner(System.in);

        myMethods.displayWelcomeMessage();

        System.out.println("Enter a string to calculate its length:");
        String str = scanner.nextLine();
        System.out.println("Length of the string: " + myMethods.calculateStringLength(str));

        System.out.println("Enter two strings to compare:");
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        System.out.println("Strings are identical: " + myMethods.compareStrings(str1, str2));

        System.out.println("Enter a password to check its complexity:");
        String password = scanner.nextLine();
        System.out.println("Password complexity: " + myMethods.checkPasswordComplexity(password));

        System.out.println("Enter an employee salary to calculate tax:");
        double salary = scanner.nextDouble();
        System.out.println("Tax on the salary: " + myMethods.calculateTax(salary));

        System.out.println("Enter two numbers and an arithmetic operation (add, subtract, multiply, divide):");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        String operation = scanner.next();
        System.out.println("Result of the operation: " + myMethods.performArithmeticOperation(num1, num2, operation));
    }
}



    
   
