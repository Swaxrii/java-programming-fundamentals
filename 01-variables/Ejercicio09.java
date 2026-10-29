import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cantidad entera de segundos: ");
        int segundos = sc.nextInt();

        int horas = segundos / 3600;
        int segundosRestantes = segundos % 3600;

        int minutos = segundosRestantes / 60;
        segundosRestantes = segundosRestantes % 60;

        sc.close();
    }
}