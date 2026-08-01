import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean entradaValida = false;
        int numero = 0;

        while (!entradaValida) {
            System.out.print("Ingrese un número entero: ");
            try {
                numero = sc.nextInt();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada inválida, intente de nuevo.");
                sc.nextLine(); 
            }
        }

        System.out.println("Número ingresado correctamente: " + numero);
    }
}
