package br.fmu.fellas.discomania;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        var productClickListener = new PruductClickListener();
        findViewById(R.id.productDarkSide).setOnClickListener(productClickListener);
        findViewById(R.id.productBezerra).setOnClickListener(productClickListener);
        findViewById(R.id.productTimMaia).setOnClickListener(productClickListener);
        findViewById(R.id.productSeuJorge).setOnClickListener(productClickListener);
    }
}
