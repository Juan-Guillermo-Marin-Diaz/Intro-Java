import java.util.Scanner;
import java.util.Random;

public class Eureka_07 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Por favor ingrese una frase");
        String frase = scan.nextLine();

        if (frase.equals("eureka")){
            System.out.println("Correcto");
        }
        else{
            System.out.println("Incorrecto");
        }

    }
}
