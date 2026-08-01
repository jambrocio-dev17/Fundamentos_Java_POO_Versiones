import java.util.Scanner;

public class Exercise18 {

    static double dividirSeguro(int numerador, int denominador) {
        if (denominador == 0) {
            throw new ArithmeticException("No se puede dividir entre cero.");
        }
        return (double) numerador / denominador;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el numerador: ");
        int numerador = sc.nextInt();
        System.out.print("Ingrese el denominador: ");
        int denominador = sc.nextInt();

        try {
            double resultado = dividirSeguro(numerador, denominador);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}