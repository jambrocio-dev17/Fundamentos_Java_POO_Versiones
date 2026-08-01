public class Circulo extends Figura {
    //Paso 5 (Abstracción): clase Circulo hereda de Figura
    private double radio;

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * radio * radio;
    }
}