import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un texto para convertir a número: ");
        String texto = sc.nextLine();

        try {
            double numero = Double.parseDouble(texto);
            System.out.println("Conversión exitosa: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir el texto a número.");
        }
    }
}