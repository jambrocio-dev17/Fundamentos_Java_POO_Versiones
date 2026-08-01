import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();

        try {
            if (numero == 0) {
                throw new ArithmeticException("El número no puede ser cero.");
            }
            System.out.println("Número ingresado: " + numero);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}