import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 2 numeros positivos");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicación: " + (num1 * num2));
        System.out.println("División: " + (double) num1 / num2);
        sc.close();

    }
}