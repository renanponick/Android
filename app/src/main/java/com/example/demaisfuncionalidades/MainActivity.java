package com.example.demaisfuncionalidades;

import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends Nova {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textoTela = (TextView) findViewById(R.id.log);
        textoTela.setText(this.getLocalClassName() + ".onCreate() chamado - bundle = "+savedInstanceState);
    }
}