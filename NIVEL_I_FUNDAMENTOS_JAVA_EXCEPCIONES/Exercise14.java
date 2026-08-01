public class Exercise14 {

    static class MiExcepcionPersonalizada extends Exception {
        public MiExcepcionPersonalizada(String mensaje) {
            super(mensaje);
        }
    }

    public static void main(String[] args) {
        System.out.println("Clase de excepción personalizada creada correctamente.");
    }
}