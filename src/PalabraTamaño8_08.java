import java.util.Scanner;
import java.util.Random;

public class PalabraTamaño8_08 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Por favor ingrese una frase o palabra de ocho letras");
        String palabra = scan.nextLine();

        if (palabra.length() == 8){
            System.out.println("CORRECTO");
        }
        else{
            System.out.println("INCORRECTO");
        }

    }
}
