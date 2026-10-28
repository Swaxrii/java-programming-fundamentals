import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la temperatura en Celsius: ");
        double temperaturaC = sc.nextDouble();

        System.out.println("Temepratura en Fahrenheit: " + (temperaturaC * 9 / 5 + 32));
        sc.close();
    }
}