import java.util.Scanner;
import java.util.Random;

public class DobleYTripleRaiz_05 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Por favor ingrese un número entero");
        int num = scan.nextInt();
        System.out.println("El doble del número ingresado es: "+num * 2);
        System.out.println("El triple del número ingresado es: "+num * 3);
        System.out.println("La raíz cuadrada del número ingresado es: "+Math.sqrt(num));

    }
}
