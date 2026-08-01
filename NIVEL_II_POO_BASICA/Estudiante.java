public class Estudiante {
    //Paso 16: clase Estudiante creada
    private String nombre;
    //Paso 17: notas privadas
    private double[] notas;

    //Paso 20: validar que las notas estén entre 0 y 100
    public void setNotas(double[] notas) {
        for (double nota : notas) {
            if (nota < 0 || nota > 100) {
                throw new IllegalArgumentException("Las notas deben estar entre 0 y 100.");
            }
        }
        this.notas = notas;
    }

    //Paso 18: calcular promedio
    public double calcularPromedio() {
        double suma = 0;
        for (double nota : notas) {
            suma = suma + nota;
        }
        return suma / notas.length;
    }
}