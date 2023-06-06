import java.util.Scanner;
import java.util.Random;

public class RS232_12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int lecturasCorrectas = 0;
        int lecturasIncorrectas = 0;

        while (true) {
            System.out.println("Ingrese una palabra que inicie con X y termine con O: ");
            String palabra = scan.nextLine();

            if (palabra.equals("&&&&&")) {
                break; // Se ingresó la secuencia de finalización
            }

            if (validarpalabra(palabra)) {
                lecturasCorrectas++;
            } else {
                lecturasIncorrectas++;
            }

    }

    System.out.println("Informe final:");
        System.out.println("Lecturas correctas: " + lecturasCorrectas);
        System.out.println("Lecturas incorrectas: " + lecturasIncorrectas);
}

    private static boolean validarpalabra(String palabra) {
        if (palabra.length() > 5) {
            System.out.println("La palabra tiene mas de 5 letras");
            return false;
        }

        char primerCaracter = palabra.charAt(0);
        char ultimoCaracter = palabra.charAt(4);

        return primerCaracter == 'X' && ultimoCaracter == 'O';
    }
}
