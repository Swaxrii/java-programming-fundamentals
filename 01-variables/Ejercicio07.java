import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la base y la altura de un rectángulo: ");
        // area = base x altura
        // permitero = 2 x (base + altura)
        int baseUsuario = sc.nextInt();
        int alturaUsuario = sc.nextInt();

        int area = baseUsuario * alturaUsuario;
        int perimetro = 2 * (baseUsuario + alturaUsuario);
        System.out.println("La área és de " + area + "cm" + "y la base de " + perimetro + " cm");

        sc.close();
    }
}