import java.util.Scanner;
import java.util.Random;

public class ResultadoSuma_01 {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Random random = new Random();

        System.out.println("Por favor ingrese dos números enteros");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int suma = num1 + num2;
        System.out.println("La suma de los números ingresados es " + suma);

    }
}
