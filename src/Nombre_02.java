import java.util.Scanner;
import java.util.Random;

public class Nombre_02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Por favor ingresa tu nombre");
        String name = scan.nextLine();
        System.out.println("El nombre ingresado es "+name.toUpperCase());

    }
}
