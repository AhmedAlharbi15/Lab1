import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner in = new Scanner(System.in);
//      Q1:
//        System.out.print("Input first number: ");
//        int num1 = in.nextInt();
//
//        System.out.print("Input second number: ");
//        int num2 = in.nextInt();
//
//        int sum = num1 + num2;
//        int difference = num1 - num2;
//        int product = num1 * num2;
//        int quotient = num1 / num2;
//        int remainder = num1 % num2;
//
//        System.out.println(num1 + " + " + num2 + " = " + sum);
//        System.out.println(num1 + " - " + num2 + " = " + difference);
//        System.out.println(num1 + " x " + num2 + " = " + product);
//        System.out.println(num1 + " / " + num2 + " = " + quotient);
//        System.out.println(num1 + " mod " + num2 + " = " + remainder);

//    Q2;
//        System.out.print("Input a number: ");
//        int number = in.nextInt();
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(number + " x " + i + " = " + (number * i));
//        }

//      Q3
//        System.out.print("Radius: ");
//        double radius = in.nextDouble();
//
//        double perimeter = 2 * Math.PI * radius;
//        double area = Math.PI * radius * radius;
//
//        System.out.println("Perimeter is = " + perimeter);
//        System.out.println("Area is = " + area);

//       Q4:
//        System.out.print("Enter the count of numbers: ");
//        int count = in.nextInt();
//
//        int sum = 0;
//        for (int i = 1; i <= count; i++) {
//            System.out.print("Enter an integer: ");
//            int num = in.nextInt();
//            sum += num;
//        }
//        double average = (double) sum / count;
//
//        System.out.println("The average is: " + average);

//      Q5:
//        System.out.print("Input the first number: ");
//        int firstNumber = in.nextInt();
//        System.out.print("Input the second number: ");
//        int secondNumber = in.nextInt();
//        System.out.print("Input the third number: ");
//        int thirdNumber = in.nextInt();
//
//        boolean result = (firstNumber + secondNumber) == thirdNumber;
//        System.out.println("The result is: " + result);

//     Q6:
//        System.out.println("Input a word: ");
//        String String1 = in.nextLine();
//
//        StringBuilder reversed = new StringBuilder(String1).reverse();
//
//        System.out.println("Reverse word:" +reversed);

//     Q7:
//        System.out.print("Enter a number: ");
//        int number = in.nextInt();
//
//        if (number % 2 == 0) {
//            System.out.println("The number is Even");
//        } else {
//            System.out.println("The number is Odd");
//        }

//    Q8:
//        System.out.print("Enter temperature in Centigrade: ");
//        double celsius = in.nextDouble();
//
//        double fahrenheit = (celsius * 9 / 5) + 32;
//        System.out.println("Temperature in Fahrenheit is: " + fahrenheit);

//    Q9:
//        System.out.print("Input a string: ");
//        String str = in.nextLine();
//
//        System.out.print("Input a number: ");
//        int index = in.nextInt();
//
//        if (index >= 0 && index < str.length()) {
//            char character = str.charAt(index);
//            System.out.println("Character at index " + index + ": " + character);
//        } else {
//            System.out.println("Invalid index.");
//        }


//       Q10
//        System.out.print("Width = ");
//        double width = in.nextDouble();
//        System.out.print("Height = ");
//        double height = in.nextDouble();
//
//        double area = width * height;
//        double perimeter = 2 * (width + height);
//
//        System.out.println("Area is " + width + " * " + height + " = " + area);
//        System.out.println("Perimeter is 2 * (" + width + " + " + height + ") = " + perimeter);

//     Q11:
//        System.out.print("Input first integer: ");
//        int num1 = in.nextInt();
//
//        System.out.print("Input second integer: ");
//        int num2 = in.nextInt();

//        if (num1 != num2) {
//            System.out.println(num1 + " != " + num2);
//        }
//        if (num1 < num2) {
//            System.out.println(num1 + " < " + num2);
//        }
//        if (num1 <= num2) {
//            System.out.println(num1 + " <= " + num2);
//        }


//      Q12:
//        System.out.print("Input seconds: ");
//        int seconds = in.nextInt();
//        int hours = seconds / 3600;
//        int minutes = (seconds % 3600) / 60;
//        int remainingSeconds = seconds % 60;
//
//        System.out.printf("%02d:%02d:%02d\n", hours, minutes, remainingSeconds);

//     Q13
//        System.out.print("Input first number: ");
//        int num1 = in.nextInt();
//        System.out.print("Input second number: ");
//        int num2 = in.nextInt();
//        System.out.print("Input third number: ");
//        int num3 = in.nextInt();
//        System.out.print("Input fourth number: ");
//        int num4 = in.nextInt();
//
//        if (num1 == num2 && num1 == num3 && num1 == num4) {
//            System.out.println("Numbers are equal!");
//        } else {
//            System.out.println("Numbers are not equal!");
//        }

//      Q14:
//        System.out.print("Input a number: ");
//        int number = in.nextInt();
//
//        if (number < 0) {
//            System.out.println("Number is negative");
//        } else if (number == 0) {
//            System.out.println("Number is zero");
//        } else {
//            System.out.println("Number is positive");
//        }

//        Q15:
//        int positiveCount = 0;
//        int negativeCount = 0;
//        int zeroCount = 0;
//
//        while (true) {
//            System.out.print("Enter a number (or -1 to stop): ");
//            int number = in.nextInt();
//
//            if (number == -1) {
//                break;
//            }
//
//            if (number > 0) {
//                positiveCount++;
//            } else if (number < 0) {
//                negativeCount++;
//            } else {
//                zeroCount++;
//            }
//        }
//        System.out.println("Positive : " + positiveCount);
//        System.out.println("Zero : " + zeroCount);
//        System.out.println("Negative : " + negativeCount);


//        Q16:
//        System.out.print("Enter an integer: ");
//        int number = in.nextInt();
//
//        int reversedNumber = 0;
//        while (number != 0) {
//            int digit = number % 10;
//            reversedNumber = reversedNumber * 10 + digit;
//            number /= 10;
//        }
//        System.out.println("Reversed number: " + reversedNumber);

//      Q17:
//
//        int large = Integer.MIN_VALUE;
//        int small = Integer.MAX_VALUE;
//        while (true) {
//            System.out.print("Enter a number (or 9 to stop): ");
//            int number = in.nextInt();
//
//            if (number == 9) {
//                break;
//            }
//            if (number > large) {
//                large = number;
//            }
//            if (number < small) {
//                small = number;
//            }
//        }
//        System.out.println("The large number: " + large);
//        System.out.println("The small number: " + small);

//     Q18:
//        System.out.print("Enter String:");
//        String input = in.nextLine();
//
//        int count = 0;
//        for (int i = 0; i < input.length(); i++) {
//            if (input.charAt(i) == 'a') {
//                count++;
//            }
//        }
//        System.out.println("Number of a's: " + count);
    }
}