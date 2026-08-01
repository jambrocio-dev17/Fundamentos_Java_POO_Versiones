import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        String entrada = sc.nextLine();

        try {
            int numero = Integer.parseInt(entrada);

            if (numero < 0) {
                throw new IllegalArgumentException("El número no puede ser negativo.");
            }

            System.out.println("Número válido: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: Debes ingresar un número entero.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}