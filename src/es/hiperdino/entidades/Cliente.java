package es.hiperdino.entidades;

import es.hiperdino.utilidades.Utilidad;

import java.util.Stack;

public class Cliente {

    private String nombre;
    private Stack<String> cestaCompra = new Stack<>();

    public Cliente() {
        this.nombre = Utilidad.nombreRandom();
    }

    public void agregarProducto(){
        this.cestaCompra.push(Utilidad.randomProduct());
    }


    public void mostrarCesta(){
        System.out.println(cestaCompra);
    }

}

