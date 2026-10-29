import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 2 número entero: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " és mas grande que " + num2);
        } else if (num1 < num2 ) {
            System.out.println(num2 + " és mas grande que " + num1);
        } else {
            System.out.println("Los dos numeros son iguales");
        }

        sc.close();
    }
}