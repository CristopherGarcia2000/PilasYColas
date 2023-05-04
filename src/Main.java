import es.hiperdino.entidades.Cajero;
import es.hiperdino.entidades.Cliente;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        Cliente cliente3 = new Cliente();
        Cajero cajero1 = new Cajero();
        cliente1.agregarProducto();
        cliente1.agregarProducto();
        cliente1.agregarProducto();
        cajero1.agregarClientes(cliente1.getNombre());
        cajero1.agregarClientes(cliente2.getNombre());
        cajero1.agregarClientes(cliente3.getNombre());


        System.out.println(cajero1);

    }
}