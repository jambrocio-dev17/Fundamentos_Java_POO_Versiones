import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una opción (1 o 2): ");
        int opcion = sc.nextInt();

        try {
            if (opcion != 1 && opcion != 2) {
                throw new RuntimeException("Opción no válida, debe ser 1 o 2.");
            }
            System.out.println("Opción seleccionada: " + opcion);
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}