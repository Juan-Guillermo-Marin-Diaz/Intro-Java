import java.util.Scanner;
import java.util.Random;

public class SwitchOperacionesBasicas_11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Por favor ingrese el primer número entero positivo");
        int num1 = scan.nextInt();
        System.out.println("Por favor ingrese el segundo número entero positivo");
        int num2 = scan.nextInt();
        int menu;

        while (true){

            System.out.println("MENU\n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Salir\n Elija opción");
            System.out.println("Por favor ingrese la operación que desea realizar");
            menu = scan.nextInt();
            switch(menu){
                case 1:
                    int resultadoS = suma(num1, num2);
                    System.out.println("El resultado de la suma es: "+resultadoS);
                    break;
                case 2:
                    int resultadoR = resta(num1, num2);
                    System.out.println("El resultado de la resta es: "+resultadoR);
                    break;
                case 3:
                    int resultadoM = multiplicar(num1, num2);
                    System.out.println("El resultado de la multiplicación es: "+resultadoM);
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("No se puede dividir entre cero.");
                    } else {
                        double resultadoD = dividir(num1, num2);
                        System.out.println("El resultado de la división es: " + resultadoD);
                    }
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    String salir = scan.next();
                    if (salir.equalsIgnoreCase("S")) {
                        System.out.println("Hasta luego.");
                        scan.close();
                        return;
                    }
                    break;
                default:
                    System.out.println("Por favor elija una opción dentro del menu");
                    break;
            }

    }
}

    public static int suma(int a, int b){

        int c = a + b;
        return c;
    }

    public static int resta(int a, int b){

        int c = a - b;
        return c;
    }

    public static int multiplicar(int a, int b){

        int c = a * b;
        return c;
    }

    public static double dividir(int a, int b) {

        double c = a / b;
        return c;
    }
}
