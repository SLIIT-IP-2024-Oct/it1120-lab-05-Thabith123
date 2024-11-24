import java.util.Scanner;

public class IT24610812Lab5Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int firstInteger = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int secondInteger = scanner.nextInt();

        System.out.print("Enter the third integer: ");
        int thirdInteger = scanner.nextInt();

        int smallest = firstInteger;

        if (secondInteger < smallest || thirdInteger < smallest) {
            smallest = (secondInteger < thirdInteger) ? secondInteger : thirdInteger;
        }

        int largest = firstInteger;

        if (secondInteger > largest || thirdInteger > largest) {
            largest = (secondInteger > thirdInteger) ? secondInteger : thirdInteger;
        }

        System.out.println("User entered numbers are: " + firstInteger + " " + secondInteger + " " + thirdInteger);
        System.out.println("The Smallest number is: " + smallest);
        System.out.println("The Largest number is: " + largest);
    }
}