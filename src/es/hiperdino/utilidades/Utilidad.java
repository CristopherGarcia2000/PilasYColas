package es.hiperdino.utilidades;

import java.util.Random;

public class Utilidad {
    public static String randomProduct(){
        final  String [] PRODUCTOS = {"Jamón Argal","Dorada","Plátano Canario","Cerveza Hiperdino","Ambrosia Hiperdino",
                "Urban Fresa","Urban Cola","Papas","Naranja","Papaya","Mandarina","Champiñon"};
        Random random = new Random();
        int productoAleatorio = random.nextInt(PRODUCTOS.length);
        return PRODUCTOS[productoAleatorio];
    }
    public static String nombreRandom(){
        final  String [] NOMBRES = {"Manolo","Paco","Patricia","Ana","Emilio",
                "Pepe","Sara","Pacheco","Laura","Pablo","Lucas","Leonardo"};
        Random random = new Random();
        int nombreAleatorio = random.nextInt(NOMBRES.length);
        return NOMBRES[nombreAleatorio];
    }
}