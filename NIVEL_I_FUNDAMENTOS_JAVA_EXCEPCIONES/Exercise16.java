import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un texto: ");
        String texto = sc.nextLine();

        try {
            if (texto.trim().isEmpty()) {
                throw new IllegalArgumentException("El texto no puede estar vacío.");
            }
            System.out.println("Texto ingresado: " + texto);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}