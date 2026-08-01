import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un texto: ");
        String texto = sc.nextLine();

        System.out.print("Ingrese la posición a consultar: ");
        int posicion = sc.nextInt();

        try {
            char letra = texto.charAt(posicion);
            System.out.println("Carácter en la posición " + posicion + ": " + letra);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: La posición ingresada no existe en el texto.");
        }
    }
}
