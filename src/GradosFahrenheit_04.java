import java.util.Scanner;
import java.util.Random;

public class GradosFahrenheit_04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Por favor ingrese la sensación térmica en grados celcius que desea convertir en grados Fahrenheit");
        double celcius = scan.nextDouble();
        double F = 32 + (9 * celcius / 5);
        System.out.println("La sensación térmica en grados Fahrenheit es: "+F+"°F");

    }
}
