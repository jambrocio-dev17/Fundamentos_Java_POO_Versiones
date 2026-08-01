public class Principal {
    public static void main(String[] args) {
        // Paso 5: mostrar datos con método (Persona)
        //Persona persona1 = new Persona("Josue", 22);
        //persona1.mostrarDatos();

        // Paso 10: mostrar saldo (Cuenta)
        //Cuenta cuenta1 = new Cuenta();
        //cuenta1.depositar(500.00);
        //cuenta1.retirar(200.00);
        //cuenta1.mostrarSaldo();

        // Paso 14: mostrar producto (Producto)
        //Producto producto1 = new Producto();
        //producto1.setNombre("Laptop");
        //producto1.setPrecio(4500.00);
        //producto1.mostrarProducto();

        // Paso 15: crear lista de productos (Producto)
        //List<Producto> productos = new ArrayList<>();
        //Producto producto1 = new Producto();
        //producto1.setNombre("Laptop");
        //producto1.setPrecio(4500.00);
        //Producto producto2 = new Producto();
        //producto2.setNombre("Mouse");
        //producto2.setPrecio(75.00);
        //productos.add(producto1);
        //productos.add(producto2);
        //for (Producto p : productos) {
        //    p.mostrarProducto();
        //}

        // Paso 19: mostrar resultado (Estudiante)
        //Estudiante estudiante1 = new Estudiante();
        //estudiante1.setNotas(new double[]{80, 90, 70});
        //System.out.println("Promedio: " + estudiante1.calcularPromedio());

        // Paso 20: validar notas entre 0 y 100 (Estudiante)
        //Estudiante estudiante1 = new Estudiante();
        //estudiante1.setNotas(new double[]{80, 90, 150});

        // Paso 24: mostrar datos (Empleado)
        //Empleado empleado1 = new Empleado();
        //empleado1.setNombre("Josue");
        //empleado1.setSalario(4500.00);
        //empleado1.mostrarDatos();

        // Paso 25: crear varios objetos (Empleado)
        Empleado empleado1 = new Empleado();
        empleado1.setNombre("Josue");
        empleado1.setSalario(4500.00);

        Empleado empleado2 = new Empleado();
        empleado2.setNombre("Ana");
        empleado2.setSalario(5200.00);

        Empleado empleado3 = new Empleado();
        empleado3.setNombre("Carlos");
        empleado3.setSalario(3800.00);

        empleado1.mostrarDatos();
        empleado2.mostrarDatos();
        empleado3.mostrarDatos();
    }
}