package br.fmu.fellas.discomania;

import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

import nl.hypothermic.javacogs.Javacogs;
import nl.hypothermic.javacogs.SearchBuilder;
import nl.hypothermic.javacogs.handlers.Handler;

public class searchControler implements View.OnClickListener {
    @Override
    public void onClick(View view) {
        try {
            Javacogs.getInstance().getHandler(Handler.DATABASE)
                    .getReleasesBySearch(new SearchBuilder().setQuery("dark side"),
                            response -> {
                                if (response.hasSucceeded())
                                    ;
                            });
        } catch (IOException e) {
            Log.e("Disco Mania", "onCreate: io exception", e);
        }
    }
}
