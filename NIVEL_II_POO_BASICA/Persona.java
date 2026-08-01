public class Persona {
    //Paso 1: atributos privados nombre y edad
    private String nombre;
    private int edad;

    //Paso 4: constructor básico
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        setEdad(edad);
    }

    //Paso 2: getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    //Paso 3: validar edad en el setter
    public void setEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa.");
        }
        this.edad = edad;
    }

    //Paso 5: mostrar datos
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}