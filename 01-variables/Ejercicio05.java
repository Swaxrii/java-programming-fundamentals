
import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cantidad entera de minutos: ");
        int min = sc.nextInt();

        int horas = min / 60;
        int minutosRestantes = min % 60;

        System.out.println("En " + min + " minutos son " + horas +  " horas y " + minutosRestantes + " minutos.");

        sc.close();
    }
}