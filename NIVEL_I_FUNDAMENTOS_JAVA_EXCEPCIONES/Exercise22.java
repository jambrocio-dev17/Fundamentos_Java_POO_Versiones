import java.util.Scanner;

public class Exercise22 {

    static void validarLongitud(String texto) {
        if (texto.length() > 20) {
            throw new IllegalArgumentException("El texto no puede exceder los 20 caracteres.");
        }
        System.out.println("Texto válido: " + texto);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un texto: ");
        String texto = sc.nextLine();

        try {
            validarLongitud(texto);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}