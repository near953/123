 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите первое число ");
        int num1 = scanner.nextInt();
        System.out.println("Ведите второе число ");
        int num2 = scanner.nextInt();
        System.out.println("Ведите действие");
        String s1 = scanner.nextLine();
        s1 = scanner.nextLine();
        switch (s1){
            case "+":
                int res1 = num1 + num2;
                System.out.println("Результат сложения "+ res1);
                break;
            case "-":
                int res2 = num1 - num2;
                System.out.println("Результат вычитания "+ res2);
                break;
            case "*":
                int res3 = num1 * num2;
                System.out.println("Результат умножения "+ res3);
                break;
            case "/":
                int res4 = num1 / num2;
                System.out.println("Результат деления "+ res4);
                break;

        }
    }
}