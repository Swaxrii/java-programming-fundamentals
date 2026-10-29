import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 3 número entero: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " es el mayor");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " es el mayor");
        } else if (num3 >= num1 && num3 >= num3) {
            System.out.println(num2 + " es el mayor");
        }

        sc.close();
    }
}