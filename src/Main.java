import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> mathOP = new HashMap<Integer, String>();

        mathOP.put(1,"Addition");
        mathOP.put(2,"Subtraction");
        mathOP.put(3,"Multiplication");
        mathOP.put(4,"Division");

        String chosenOP;

        Scanner sc = new Scanner(System.in); // Scanner Object
        System.out.println("Enter Number");

        int value1 = sc.nextInt(); // Record First Number inputted
        System.out.println("Select a Math Operation");
        System.out.println("1:Addition\t 2:Subtraction\t 3:Multiplication\t 4:Division");
        chosenOP = mathOP.get(sc.nextInt());

        System.out.println("Enter Number");
        int value2 = sc.nextInt();

        Math problem = new Math(value1,value2);

        if (Objects.equals(chosenOP, "Addition")){
            problem.addition();
            System.out.println(problem.answer);
        } else if (Objects.equals(chosenOP, "Subtraction")) {
            problem.subtraction();
            System.out.println(problem.answer);
        } else if (Objects.equals(chosenOP, "Multiplication")) {
            problem.multiplication();
            System.out.println(problem.answer);
        } else if (Objects.equals(chosenOP, "Division")) {
            problem.division();
            System.out.println(problem.answer);
        }

    }
}

class Math {
    int val1;
    int val2;
    int answer;

    public Math(int value1, int value2) {
        this.val1 = value1;
        this.val2 = value2;
    }
    public void addition() {
        answer = this.val1 + this.val2;
    }

    public void subtraction() {
        answer = this.val1 - this.val2;
    }

    public void multiplication() {
        answer = this.val1 * this.val2;
    }

    public void division() {
        answer = this.val1 / this.val2;
    }
}

