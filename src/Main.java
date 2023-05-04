import es.hiperdino.entidades.Cliente;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.agregarProducto();
        cliente1.agregarProducto();
        cliente1.agregarProducto();
        cliente1.mostrarCesta();
        cliente1.borrarProducto("Papas");
    }
}