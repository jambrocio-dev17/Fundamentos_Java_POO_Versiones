import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");

        try {
            int numero = sc.nextInt();
            System.out.println("Número ingresado: " + numero);
        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar un número entero válido.");
        }
    }
}