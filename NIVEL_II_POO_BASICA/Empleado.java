public class Empleado {
    //Paso 21: clase Empleado creada
    private String nombre;
    //Paso 22: encapsular salario
    private double salario;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    //Paso 23: validar salario positivo
    public void setSalario(double salario) {
        if (salario < 0) {
            throw new IllegalArgumentException("El salario no puede ser negativo.");
        }
        this.salario = salario;
    }

    //Paso 24: mostrar datos
    public void mostrarDatos() {
        System.out.println("Empleado: " + nombre + ", Salario: Q" + salario);
    }
}