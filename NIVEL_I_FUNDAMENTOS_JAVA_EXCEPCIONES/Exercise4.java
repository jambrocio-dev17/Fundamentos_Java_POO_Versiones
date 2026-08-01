import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        String entrada = sc.nextLine();

        try {
            int numero = Integer.parseInt(entrada);
            System.out.println("Número válido: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Mensaje personalizado: Debes ingresar solo números enteros, sin letras ni símbolos.");
        }
    }
}