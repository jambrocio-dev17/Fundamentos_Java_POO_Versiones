import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30};

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un índice: ");
        String entrada = sc.nextLine();

        try {
            int indice = Integer.parseInt(entrada);
            System.out.println("Valor: " + numeros[indice]);
        } catch (NumberFormatException e) {
            System.out.println("Error: Debe ingresar un número entero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: El índice está fuera de rango.");
        }
    }
}