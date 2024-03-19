package function;


import java.util.Scanner;

public class SumCalculator {
    Scanner sc = new Scanner(System.in);
    int sum = 0;

    public int sum() {
        System.out.println("Enter the number(enter the 'x' to stop) :");
        String input = sc.next();
        while (!input.equalsIgnoreCase("x")) {
            try {
                int number = Integer.parseInt(input);
                sum = sum + number;
            } catch (NumberFormatException e) {
                System.out.println("e = " + e);
            }
            System.out.println("Enter another number (enter 'x' to stop):");
            input = sc.next();
        }
        return sum;
    }
}

class Main {
    public static void main(String[] args) {
        SumCalculator sumCalculator = new SumCalculator();
        int sum = sumCalculator.sum();
        System.out.println("sum = " + sum);
    }
}
