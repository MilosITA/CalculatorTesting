import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite prvi broj:");
        double num1 = scanner.nextDouble();
        System.out.println("Unesite operaciju (+, -, *, /):");
        char operation = scanner.next().charAt(0);
        System.out.println("Unesite drugi broj:");
        double num2 = scanner.nextDouble();

        double result;

        switch (operation) {
            case '+':
                result = num1 + num2;
                System.out.println("Rezultat: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Rezultat: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Rezultat: " + result);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Greška: deljenje nulom nije dozvoljeno.");
                } else {
                    result = num1 / num2;
                    System.out.println("Rezultat: " + result);
                }
                break;
            default:
                System.out.println("Nepoznata operacija.");
        }

        scanner.close();
    }
}
