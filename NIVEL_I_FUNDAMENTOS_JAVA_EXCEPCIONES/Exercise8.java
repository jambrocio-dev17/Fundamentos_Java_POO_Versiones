import java.util.Scanner;

public class Exercise8 {

    static void validarNumero(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo.");
        }
        System.out.println("Número válido: " + numero);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();

        try {
            validarNumero(numero);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}