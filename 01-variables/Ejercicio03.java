
public class Ejercicio03 {
    public static void main(String[] args) {

        int x = 1;
        int y = 5;

        System.out.println("X: " + x);
        System.out.println("Y: " + y);
        System.out.println("-------");

        int aux = x;
        x = y;
        y = aux;

        System.out.println("X: " + x);
        System.out.println("Y: " + y);
    }
}