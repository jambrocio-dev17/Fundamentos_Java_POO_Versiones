import java.util.Scanner;

public class Exercise15 {

    static class MiExcepcionPersonalizada extends Exception {
        public MiExcepcionPersonalizada(String mensaje) {
            super(mensaje);
        }
    }

    static void validarNumero(int numero) throws MiExcepcionPersonalizada {
        if (numero < 0) {
            throw new MiExcepcionPersonalizada("Número inválido: no se permiten negativos.");
        }
        System.out.println("Número válido: " + numero);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();

        try {
            validarNumero(numero);
        } catch (MiExcepcionPersonalizada e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}