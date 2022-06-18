package br.fmu.fellas.discomania;

import static android.content.Context.*;
import static androidx.core.app.ActivityCompat.startActivityForResult;
import static androidx.core.app.ShareCompat.getCallingActivity;
import static androidx.core.content.ContextCompat.startActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;

import java.util.Objects;

public class PruductClickListener implements View.OnClickListener {

    @Override
    public void onClick(@NonNull View view) {
        var productPage = new Intent(view.getContext(), ProductDetailsActivity.class);
        var bundle = new Bundle();

        var id = view.getId();
        if (id == R.id.productDarkSide) {
            bundle.putInt("image", R.drawable.pink);
            bundle.putString("description", view.getContext().getString(R.string.descricaoPink));
            bundle.putString("price", "R$ 90");
            bundle.putString("telephone", "+5511999999999");
            bundle.putString("name", "Dark Side of the Moon");
        }
        if(id == R.id.productSeuJorge){
            bundle.putInt("image", R.drawable.jorge);
            bundle.putString("description", view.getContext().getString(R.string.descricaoSeuJorge));
            bundle.putString("price", "R$ 100");
            bundle.putString("telephone", "+5511999999999");
            bundle.putString("name", "Música para Churrasco");
        }
        if (id == R.id.productTimMaia){
            bundle.putInt("image", R.drawable.tim);
            bundle.putString("description", view.getContext().getString(R.string.descricaoTimMaia));
            bundle.putString("price", "R$ 350");
            bundle.putString("telephone", "+5511999999999");
            bundle.putString("name", "Vol. 1 Tim Maia");
        }
        if (id == R.id.productBezerra){
            bundle.putInt("image", R.drawable.bezerra);
            bundle.putString("description", view.getContext().getString(R.string.descricaoBezerra));
            bundle.putString("price", "R$ 350");
            bundle.putString("telephone", "+5511999999999");
            bundle.putString("name", "Vol. 1 Tim Maia");
        }
        productPage.putExtras(bundle);
        startActivity(view.getContext(), productPage, null);
    }
}
