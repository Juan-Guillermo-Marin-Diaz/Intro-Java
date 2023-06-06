import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;


public class BuscarNumeroEnVector_16 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Por favor ingrese el tamaño del vector");
        int tamaño = scan.nextInt();

        int [] vector = llenarVector(tamaño);
        System.out.println("Vector llenado: " + Arrays.toString(vector));

        System.out.println("Por favor introduzca el número que desea buscar");
        int numeroabuscar = scan.nextInt();

        buscarNumero(vector, numeroabuscar);

    }


    public static int[] llenarVector(int tamaño){
        int [] vector = new int[tamaño];
        Random aleatorio = new Random();

        for (int i = 0; i < tamaño; i++) {
            vector[i] = aleatorio.nextInt(100);
        }
        return vector;
    }

    public static void buscarNumero(int [] vector, int numero){
        boolean encontrado = false;
        boolean repetido = false;
        int posicion = -1;

        for(int i = 0; i < vector.length; i++) {
            if (vector [i] == numero){
                if (encontrado){
                    repetido = true;
                } else {
                    encontrado = true;
                    posicion = i;
                }
            }

        }

        if (encontrado) {
            System.out.println("El número " + numero + " se encuentra en la posición " + posicion + " del vector.");

            if (repetido) {
                System.out.println("El número " + numero + " tambien se repite en otras posiciones");
            } else {
                System.out.println("El número " + numero + " no se encuentra repetido en otras posiciones del vector");
            }
        } else {
            System.out.println("El número " + numero + " no esta dentro del vector");
        }
    }
}
