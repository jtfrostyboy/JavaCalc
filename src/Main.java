import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner Object
        System.out.println("Enter Number");

        int value1 = sc.nextInt(); // Record First Number inputted
        System.out.println("Select a Math Operation");

        System.out.println("Enter Number");
        int value2 = sc.nextInt();

        System.out.println("Your numbers are " + value1 + " and " + value2);
    }
}

