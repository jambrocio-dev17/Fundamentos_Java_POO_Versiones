import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("----- Menú -----");
            System.out.println("1. Sumar dos números");
            System.out.println("2. Dividir dos números");
            System.out.print("Seleccione una opción: ");

            try {
                int opcion = sc.nextInt();

                if (opcion == 1) {
                    System.out.print("Ingrese el primer número: ");
                    int a = sc.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    int b = sc.nextInt();
                    System.out.println("Resultado: " + (a + b));
                    salir = true;
                } else if (opcion == 2) {
                    System.out.print("Ingrese el numerador: ");
                    int a = sc.nextInt();
                    System.out.print("Ingrese el denominador: ");
                    int b = sc.nextInt();
                    System.out.println("Resultado: " + (a / b));
                    salir = true;
                } else {
                    System.out.println("Opción no válida, intente de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar valores numéricos.");
                sc.nextLine(); 
            } catch (ArithmeticException e) {
                System.out.println("Error: No se puede dividir entre cero.");
                salir = true;
            }
        }
    }
}