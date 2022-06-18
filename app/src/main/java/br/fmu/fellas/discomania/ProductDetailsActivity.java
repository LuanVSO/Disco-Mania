package br.fmu.fellas.discomania;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import br.fmu.fellas.discomania.databinding.ActivityProductDetailsBinding;

public class ProductDetailsActivity extends AppCompatActivity {

    private ActivityProductDetailsBinding binding;
    private String telefone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProductDetailsBinding.inflate(getLayoutInflater());

        Bundle bundle = getIntent().getExtras();
        setContentView(binding.getRoot());

        telefone = bundle.getString("telephone");
        @NonNull
        TextView name = findViewById(R.id.name);
        name.setText(bundle.getString("name"));
        @NonNull
        TextView price = findViewById(R.id.price);
        price.setText(bundle.getString("price"));
        @NonNull
        TextView description = findViewById(R.id.produtoDescription);
        description.setText(bundle.getString("description"));
        @NonNull
        ImageView image = findViewById(R.id.imageProduto);
        image.setImageDrawable(AppCompatResources.getDrawable(this, bundle.getInt("image")));

        findViewById(R.id.buttonTelefone).setOnClickListener(view -> {
            var i = Uri.parse("tel:" + telefone);
            var openUri = new Intent(Intent.ACTION_VIEW, i);
            startActivity(openUri);
        });
    }
}
