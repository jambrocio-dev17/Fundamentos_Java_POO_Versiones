import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        String entrada = sc.nextLine();

        try {
            int numero = Integer.parseInt(entrada);
            System.out.println("Número válido: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: Debes ingresar solo números enteros.");
        } finally {
            System.out.println("Proceso de validación finalizado.");
        }
    }
}