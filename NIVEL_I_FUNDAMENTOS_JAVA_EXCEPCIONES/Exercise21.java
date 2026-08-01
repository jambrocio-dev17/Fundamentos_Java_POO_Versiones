import java.util.Scanner;

public class Exercise21 {

    static void validarEmail(String email) {
        if (!email.contains("@") || !email.contains(".")) {
            throw new IllegalArgumentException("El email ingresado no es válido.");
        }
        System.out.println("Email válido: " + email);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un email: ");
        String email = sc.nextLine();

        try {
            validarEmail(email);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}