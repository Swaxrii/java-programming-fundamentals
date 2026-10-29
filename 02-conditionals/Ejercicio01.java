import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número entero: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("Número positivo");
        } else if (num < 0) {
            System.out.println("Número negativo");
        } else {
            System.out.println("És zero");
        }

        sc.close();
    }
}