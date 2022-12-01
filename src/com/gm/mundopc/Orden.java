package com.gm.mundopc;

import java.util.Arrays;

public class Orden {
    private int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private final static int MAX_COMPUTADORAS = 10;

    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
    }

    public void agregarComputadora(Computadora computadora){
        if(this.contadorComputadoras < MAX_COMPUTADORAS)this.computadoras[this.contadorComputadoras] = computadora;
            this.contadorComputadoras++;
    }

    public void mostrarOrden(){
        System.out.println("Orden N°: " + this.idOrden);
        System.out.println("Computadoras :" + Arrays.toString(this.computadoras));
        System.out.println("Gracias por tu compra!");
    }

}
