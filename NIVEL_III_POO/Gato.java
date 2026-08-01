public class Gato extends Animal {
    //Paso 1 (Polimorfismo): clase Gato hereda de Animal

    //Paso 2 (Polimorfismo): sobrescribir método sonido()
    @Override
    public void sonido() {
        System.out.println("El gato maúlla.");
    }
}