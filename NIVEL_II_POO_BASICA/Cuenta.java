public class Cuenta {
    //Paso 6: atributo privado saldo
    private double saldo;

    //Paso 7: método depositar
    public void depositar(double monto) {
        //Paso 9: evitar que un depósito negativo afecte el saldo
        if (monto < 0) {
            System.out.println("No se puede depositar un monto negativo.");
        } else {
            saldo = saldo + monto;
        }
    }

    //Paso 8: método retirar con validación
    public void retirar(double monto) {
        if (monto > saldo) {
            System.out.println("Fondos insuficientes.");
        } else {
            saldo = saldo - monto;
        }
    }

    //Paso 10: mostrar saldo
    public void mostrarSaldo() {
        System.out.println("Saldo actual: Q" + saldo);
    }
}