package es.hiperdino.entidades;

import java.util.LinkedList;
import java.util.Queue;

public class Cajero {
    private final int NUMCAJA=1;
    private boolean cajaAbierta = false;
    private Queue<String> filaClientes = new LinkedList<>();

    public boolean getCajaAbierta() {
        return cajaAbierta;
    }
    public boolean isNull (){
       if(filaClientes.isEmpty()){
           return true;
       }else{
           return false;
       }
    }
    public void atenderCliente(){
        System.out.println(filaClientes.poll());
    }

    public void abrirCaja(){
        if(cajaAbierta){
            System.out.println("La caja ya está abierta.");
        }else{
            System.out.println("Abriendo caja...");
            this.cajaAbierta = true;
        }
    }
    public void cerrarCaja(){
        if (!cajaAbierta){
            System.out.println("La caja ya está cerrada");
        }else{
            System.out.println("Cerrando caja...");
            this.cajaAbierta = false;
        }
    }
    public void agregarClientes(String nombre){
        filaClientes.add(nombre);
    }
    public void verFilaClientes(){
        System.out.println(filaClientes);
    }
    @Override
    public String toString() {
        String msg;
        msg = "----------------------------—=== CLIENTES ===—-------------------------\n" +
                "Número de Caja: " + NUMCAJA + " \n" +
                "Total de Clientes: "+ filaClientes.size() + "\n"+
                "Cola de Clientes : " + filaClientes + "\n"+
                "=========================================================================";
        return msg;
    }
}
