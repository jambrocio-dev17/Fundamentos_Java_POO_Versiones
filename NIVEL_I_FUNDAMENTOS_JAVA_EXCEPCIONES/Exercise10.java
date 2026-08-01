import java.util.Scanner;

public class Exercise10 {

    static void validarContrasena(String contrasena) {
        if (contrasena.length() < 8) {
            throw new IllegalArgumentException("La contraseña debe tener al menos 8 caracteres.");
        }
        System.out.println("Contraseña válida.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una contraseña: ");
        String contrasena = sc.nextLine();

        try {
            validarContrasena(contrasena);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}