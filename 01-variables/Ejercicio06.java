
import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cantidad entera de céntimos: ");
        int centimos = sc.nextInt();

        int moneda200 = centimos / 200;
        int restante = centimos % 200;

        int moneda100 = restante / 100;
        restante = restante % 100;

        int moneda50 = restante / 50;
        restante = restante % 50;

        int moneda20 = restante / 20;
        restante = restante % 20;

        int moneda10 = restante / 10;
        restante = restante % 10;

        int moneda5 = restante / 5;
        restante = restante % 5;

        int moneda2 = restante / 2;
        restante = restante % 2;

        int moneda1 = restante;

        System.out.println("Monedas de 2 euros: " + moneda200);
        System.out.println("Monedas de 1 euro: " + moneda100);
        System.out.println("Monedas de 50 céntimos: " + moneda50);
        System.out.println("Monedas de 20 céntimos: " + moneda20);
        System.out.println("Monedas de 10 céntimos: " + moneda10);
        System.out.println("Monedas de 5 céntimos: " + moneda5);
        System.out.println("Monedas de 2 céntimos: " + moneda2);
        System.out.println("Monedas de 1 céntimo: " + moneda1);

        sc.close();

    }
}