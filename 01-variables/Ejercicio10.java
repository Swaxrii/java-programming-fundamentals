import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el precio unitario: ");
        double precioUnitario = sc.nextDouble();

        System.out.println("Introduce la cantidad comprada: ");
        int cantidadComprada = sc.nextInt();

        System.out.println("Precio unitario: " + precioUnitario + " €");
        System.out.println("Cantidad comprada: " + cantidadComprada);

        double subtotal = precioUnitario * cantidadComprada;
        System.out.println("Subtotal: " + subtotal + " €");

        double iva = 0.21;

        System.out.println("IVA (21%): " + subtotal * iva);

        System.out.println("TOTAL: " + (subtotal + subtotal * iva));
        sc.close();
    }
}