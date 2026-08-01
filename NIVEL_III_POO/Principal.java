public class Principal {
    public static void main(String[] args) {
        // Paso 4 (Integración): implementar en Carro
        //Vehiculo carro1 = new Carro();
        //carro1.moverse();

        // Paso 5 (Integración): implementar en Moto
        Vehiculo carro1 = new Carro();
        Vehiculo moto1 = new Moto();

        carro1.moverse();
        moto1.moverse();
    }
}