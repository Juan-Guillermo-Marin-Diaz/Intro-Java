import java.util.Scanner;
import java.util.Random;

public class Vector100NumerosDescendente_15 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int [ ] numeros = new int [100];

        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = i + 1;

        }
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);

        }

    }
}
