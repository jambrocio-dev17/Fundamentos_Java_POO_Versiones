public class Perro extends Animal {
    //Paso 2 (Herencia): clase Perro hereda de Animal

    //Paso 4 (Herencia): sobrescribir método sonido()
    @Override
    public void sonido() {
        System.out.println("El perro ladra.");
    }
}