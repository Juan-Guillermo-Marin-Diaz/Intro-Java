import java.util.Scanner;
import java.util.Random;

public class MayusculasMinusculas_03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.println("por favor ingrese una frase");
        String frase = scan.nextLine();
        System.out.println("la frase ingresada en mayúsculas es "+frase.toUpperCase());
        System.out.println("La frase ingresada en minúsculas es "+frase.toLowerCase());

    }
}
