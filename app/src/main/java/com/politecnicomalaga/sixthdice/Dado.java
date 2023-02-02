package com.politecnicomalaga.sixthdice;

import java.util.Random;

public class Dado {

    private int valor;

    public Dado() {

        valor = new Random().nextInt(6) +1;
    }

    // Es mejor hacer un método para darle el valor al dado porque así no está
    // constantemente cargado en memoria.

    public int tirarDado() {

        return valor = new Random().nextInt(6) +1;

    }


    public int getValor() {

        return valor;

    }

}
