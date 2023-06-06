import java.util.Scanner;
import java.util.Random;

public class CambioDeDivisa_14 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Por favor ingrese la cantidad de euros que desea convertir");
        double cantidadEuros = scan.nextInt();

        System.out.println("Por favor escriba la moneda a la que desea convertir sus euros\ndolares\nlibras\nyenes");
        String moneda = scan.next();

        cambioDivisas(cantidadEuros, moneda);

    }


    public static void cambioDivisas(double cantidadEuros, String moneda){

        double cambio;

        switch (moneda){
            case "dolares":
                cambio = cantidadEuros * 1.28611;
                System.out.println(cantidadEuros + " euros equivalen a " + cambio + " dolares");
                break;
            case "libras":
                cambio = cantidadEuros * 0.86;
                System.out.println(cantidadEuros + " euros equivalen a " + cambio + " libras");
                break;
            case "yenes":
                cambio = cantidadEuros * 129.852;
                System.out.println(cantidadEuros + " euros equivalen a " + cambio + " yenes");
                break;
            default:
                System.out.println("La moneda ingresada no es valida. Por favor escriba dolares, libras o yenes");

        }
    }
}
