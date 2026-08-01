public class Cuadrado extends Figura {
    //Paso 3 (Abstracción): clase Cuadrado hereda de Figura
    private double lado;

    public void setLado(double lado) {
        this.lado = lado;
    }

    //Paso 4 (Abstracción): implementar método área
    @Override
    public double area() {
        return lado * lado;
    }
}