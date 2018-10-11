package com.example.estudiante.practicas11controlador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//Valentina Chávez, Juanita Hoyos, Isabella Jordán


public class MainActivity extends AppCompatActivity implements Comunicacion.OnMessage{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Comunicacion com = new Comunicacion();
        com.setObserver(this);
        com.start();
    }
    public void onRecieved(String input) {
        System.out.println(input);

    }
}
