import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un índice para consultar el arreglo: ");
        int indice = sc.nextInt();

        try {
            System.out.println("Valor en el índice " + indice + ": " + numeros[indice]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: El índice ingresado está fuera de rango.");
        }
    }
}