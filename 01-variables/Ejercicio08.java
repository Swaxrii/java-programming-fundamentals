import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 3 notas con decimales: ");
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double nota3 = sc.nextDouble();

        double mediaArtimetica = (nota1 + nota2 + nota3) / 3;
        System.out.println("La media aritmética de las 3 notas: " + nota1 + "" + nota2 + "" + nota3 + " és de: "
                + mediaArtimetica);
        sc.close();
    }
}