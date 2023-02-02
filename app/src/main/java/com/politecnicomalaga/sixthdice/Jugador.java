package com.politecnicomalaga.sixthdice;

public class Jugador {

    //Atributos
    private Dado dado1;
    private Dado dado2;

    //Si quiero usar dos objetos de otra clase, debo instanciarlos en el constructor.
    public Jugador() {

        dado1 = new Dado();
        dado2 = new Dado();

    }

    public void tirarDaditos() {

        dado1.tirarDado();
        dado2.tirarDado();

    }

    //Sumo el resultado de ambos dados (PUNTUACIÓN TOTAL)
    public int getSuma() {

        //DEBO INVOCAR EL MÉTODO DE DADO QUE ME DEVUELVE EL VALOR PARA SUMARLO XDD
        return dado1.getValor() + dado2.getValor();

    }

    //Como si fuese un sout, solo que literalmente pongo texto y concateno el objeto + el getter que me retorna su valor.
    public String getTirada() {

        return "\nDado 1: " + dado1.getValor() + "\nDado 2: " + dado2.getValor();

    }

    public int getDado1() {

        return dado1.getValor();

    }

    public int getDado2() {

        return dado2.getValor();

    }

    /*
    Si uno de sus dados obtiene un 6, ganará el jugador correspondiente.
    Si ambos jugadores obtienen un 6 en su jugada, ganará el que más puntuación tenga en la suma de los dados.
    Por último, quedarán empate ambos jugadores si tienen la misma suma de dados y seis en cada dado.
     */
    public int haySeises() {

        int contador = 0;

        if (dado1.getValor() == 6 || dado2.getValor() == 6) {

            //Cómo anuncio que ha ganado
            contador++;

        }

        return contador;
    }

    public String haGanado(Jugador jugador2) {

        String mensaje = "";

        if (this.haySeises() > jugador2.haySeises()) {

            mensaje = "Ha ganado el jugador 1";

        } else if (this.haySeises() < jugador2.haySeises()) {

            mensaje = "Ha ganado el jugador 2";

            //Si ambos tienen dos seises o no tienen ningun seis, se decantan por la suma
        } else if ((this.haySeises() == jugador2.haySeises())) {

            if (this.getSuma() > jugador2.getSuma()) {

                mensaje = "Ha ganado el jugador 1";

                //Aquí usar operador matemático porque esto no es booleano
            } else if (this.getSuma() < jugador2.getSuma()) {

                mensaje = "Ha ganado el jugador 2";

            } else {

                mensaje = "empate";
            }

        }

        return mensaje;
    }
}
