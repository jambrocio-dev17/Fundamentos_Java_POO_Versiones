public class Producto {
    //Paso 11: clase Producto creada
    private String nombre;
    //Paso 12: encapsular precio
    private double precio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    //Paso 13: validar precio positivo
    public void setPrecio(double precio) {
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo.");
        }
        this.precio = precio;
    }

    //Paso 14: método mostrar producto
    public void mostrarProducto() {
        System.out.println("Producto: " + nombre + ", Precio: Q" + precio);
    }
}