package br.fmu.fellas.discomania;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import nl.hypothermic.javacogs.*;
import nl.hypothermic.javacogs.authentication.TokenAuthenticationMethod;


public class MainActivity extends AppCompatActivity {

    final Javacogs client = new Javacogs();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        client.setAuthenticationMethod(new TokenAuthenticationMethod(getString(R.string.discogsToken)));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        var productClickListener = new PruductClickListener();
        findViewById(R.id.productDarkSide).setOnClickListener(productClickListener);
        findViewById(R.id.productBezerra).setOnClickListener(productClickListener);
        findViewById(R.id.productTimMaia).setOnClickListener(productClickListener);
        findViewById(R.id.productSeuJorge).setOnClickListener(productClickListener);
    }
}
