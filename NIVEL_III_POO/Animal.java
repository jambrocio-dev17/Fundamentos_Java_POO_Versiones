public class Animal {
    //Paso 1 (Herencia): clase base Animal
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Paso 3 (Herencia): método sonido()
    public void sonido() {
        System.out.println("El animal hace un sonido.");
    }
}