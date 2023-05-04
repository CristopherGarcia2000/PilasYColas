package es.hiperdino.entidades;

import es.hiperdino.utilidades.Utilidad;

import java.util.Stack;

public class Cliente {

    private String nombre;
    private Stack<String> cestaCompra = new Stack<>();

    public Cliente() {
        this.nombre = Utilidad.nombreRandom();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarProducto(){
        this.cestaCompra.push(Utilidad.randomProduct());
    }


    public void mostrarCesta(){
        System.out.println(cestaCompra);
    }

    @Override
    public String toString() {
        String msg;
        msg = "----------------------------—=== CLIENTES ===—-------------------------\n" +
                "Nombre: " + nombre + " \n" +
                "Total de productos: "+ cestaCompra.size() +"\n"+
                "Lista de artículos: " + cestaCompra + "\n" +
                "=========================================================================";
        return msg;
    }

}

