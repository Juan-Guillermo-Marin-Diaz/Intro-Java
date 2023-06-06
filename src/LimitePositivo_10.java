import java.util.Scanner;
import java.util.Random;

public class LimitePositivo_10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Por favor ingrese un número entero positivo como límite");
        int limite = scan.nextInt();

        int suma;
        suma = 0;

        while (suma <= limite) {
            System.out.println("Por favor ingrese otro número");
            int num = scan.nextInt();
            suma = suma + num;
            System.out.println("Hasta el momento la suma es: "+suma);
        }
        System.out.println("La suma de los números introducidos es: "+suma+" y ha superado el límite "+limite);

    }
}
