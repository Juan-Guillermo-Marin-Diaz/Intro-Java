import java.util.Scanner;
import java.util.Random;

public class ValidarPalabra_09 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Por favor ingrese una palabra o frase");
        String palabra = scan.nextLine();

        String newpalabra = palabra.toLowerCase();
        String buscarA = newpalabra.substring(0, 1);


        if (buscarA.equals("a") ){
            System.out.println("CORRECTO");
        }
        else{
            System.out.println("INCORRECTO");
        }

    }
}
