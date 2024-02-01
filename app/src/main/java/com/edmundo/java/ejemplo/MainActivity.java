package com.edmundo.java.ejemplo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onRestart() {
        super.onRestart();

    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    /*
    Se usa para cargar toda la interfaz visual onCreate
    * */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    /*
    Se usa para recargar datos de internet o algo que no dependa tanto
    * */
    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case 0:
                ((TextView) findViewById(R.id.mi_pinche_boton)).setText("Tu puta gana");
            case 1:
                ((TextView) findViewById(R.id.mi_pinche_boton)).setText("Mi puta gana");
                break;
            default:
                ((TextView) findViewById(R.id.mi_pinche_boton)).setText("Tu puta gana");
                break;
        }
    }
}