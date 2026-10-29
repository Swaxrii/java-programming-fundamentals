import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("El número " + num + " és par");
        } else {
            System.out.println("El número " + num + " és impar");
        }

        sc.close();
    }
}