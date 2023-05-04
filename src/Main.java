import es.hiperdino.entidades.Cajero;
import es.hiperdino.entidades.Cliente;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion = -1;
        Random cantidadAlAzar = new Random();
        int cantidadProductos;
        Cajero donCajero = new Cajero();
        Scanner teclao = new Scanner(System.in);
        while (opcion != 5){
            System.out.println("Seleccione una opción: ");
            System.out.println("1.-Abrir Caja");
            System.out.println("2.-Añadir cliente a la cola");
            System.out.println("3.-Atender cliente");
            System.out.println("4.-Ver clientes pendientes");
            System.out.println("5.-Cerrar caja y Supermercado");
            opcion = teclao.nextInt();
            switch (opcion){
                case 1:
                    donCajero.abrirCaja();
                    break;
                case 2:
                    if(donCajero.getCajaAbierta()){
                        Cliente clienteNuevo = new Cliente();
                        cantidadProductos = cantidadAlAzar.nextInt(20);
                        for (int i = 0; i < cantidadProductos; i++) {
                            clienteNuevo.agregarProducto();
                        }
                        donCajero.agregarClientes(clienteNuevo.getNombre());
                    }else{
                        System.out.println("Atender a gente con la caja cerrada está complicado");
                    }
                    break;
                case 3:
                    if (donCajero.isNull() == false) {
                        donCajero.atenderCliente();
                    }else {
                        System.out.println("No hay clientes para atender");
                    }
                    break;
                case 4:
                    System.out.println(donCajero);
                    break;
                case 5:
                    donCajero.cerrarCaja();
                    break;
                default:
                    System.out.println("Introduzca un valor válido");
                    break;
            }
        }
    }
}