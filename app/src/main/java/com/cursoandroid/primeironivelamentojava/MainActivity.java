package com.cursoandroid.primeironivelamentojava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.cursoandroid.primeironivelamentojava.model.Cliente;

public class MainActivity extends AppCompatActivity {
    Cliente objCliente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        objCliente = new Cliente();
    }
}