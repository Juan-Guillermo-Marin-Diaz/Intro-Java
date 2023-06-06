import java.util.Scanner;
import java.util.Random;

public class ParOImpar_06 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Por favor ingrese un número entero");
        int num = scan.nextInt();
        if (num % 2 == 0){
            System.out.println("El número ingresado es par");
        }
        else{
            System.out.println("El número ingresado es impar");
        }

    }
}
