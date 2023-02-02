package com.politecnicomalaga.sixthdice;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        //Convoco dos tiradas cuales cada una tiene dos dados
        Jugador jugador1 = new Jugador();
        Jugador jugador2 = new Jugador();

        //Elementos de la interfaz
        Button BTirar = findViewById(R.id.BTirar);
        TextView TVResultado = findViewById(R.id.TVResultado);
        TextView TVJugador1 = findViewById(R.id.TVJugador1);
        TextView TVJugador2 = findViewById(R.id.TVJugador2);
        ImageView IDice1 = findViewById(R.id.IDice1);
        ImageView IDice2 = findViewById(R.id.IDice2);
        ImageView IDice3 = findViewById(R.id.IDice3);
        ImageView IDice4 = findViewById(R.id.IDice4);


        //Cuando el Button se ejecute, llamará a los dados y actualizaré los TextViews

        BTirar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jugador1.tirarDaditos();
                jugador2.tirarDaditos();

                TVResultado.setText(jugador1.haGanado(jugador2));
                TVJugador1.setText(jugador1.getTirada());
                TVJugador2.setText(jugador2.getTirada());

                //También actualizará los dados acorde al resultado

                switch (jugador1.getDado1()) {

                    case 1:

                        IDice1.setImageResource(R.drawable.dice1);
                        break;

                    case 2:

                        IDice1.setImageResource(R.drawable.dice2);
                        break;

                    case 3:

                        IDice1.setImageResource(R.drawable.dice3);
                        break;

                    case 4:

                        IDice1.setImageResource(R.drawable.dice4);
                        break;

                    case 5:

                        IDice1.setImageResource(R.drawable.dice5);
                        break;

                    case 6:

                        IDice1.setImageResource(R.drawable.dice6);
                        break;


                }

                switch (jugador1.getDado2()) {

                    case 1:

                        IDice2.setImageResource(R.drawable.dice1);
                        break;

                    case 2:

                        IDice2.setImageResource(R.drawable.dice2);
                        break;

                    case 3:

                        IDice2.setImageResource(R.drawable.dice3);
                        break;

                    case 4:

                        IDice2.setImageResource(R.drawable.dice4);
                        break;

                    case 5:

                        IDice2.setImageResource(R.drawable.dice5);
                        break;

                    case 6:

                        IDice2.setImageResource(R.drawable.dice6);
                        break;


                }

                switch (jugador2.getDado1()) {

                    case 1:

                        IDice3.setImageResource(R.drawable.dice1);

                        break;

                    case 2:

                        IDice3.setImageResource(R.drawable.dice2);
                        break;

                    case 3:

                        IDice3.setImageResource(R.drawable.dice3);
                        break;

                    case 4:

                        IDice3.setImageResource(R.drawable.dice4);
                        break;

                    case 5:

                        IDice3.setImageResource(R.drawable.dice5);
                        break;

                    case 6:

                        IDice3.setImageResource(R.drawable.dice6);
                        break;


                }

                switch (jugador2.getDado2()) {

                    case 1:

                        IDice4.setImageResource(R.drawable.dice1);

                        break;

                    case 2:

                        IDice4.setImageResource(R.drawable.dice2);
                        break;

                    case 3:

                        IDice4.setImageResource(R.drawable.dice3);
                        break;

                    case 4:

                        IDice4.setImageResource(R.drawable.dice4);
                        break;

                    case 5:

                        IDice4.setImageResource(R.drawable.dice5);
                        break;

                    case 6:

                        IDice4.setImageResource(R.drawable.dice6);
                        break;


                }





            }
        });

    }
}