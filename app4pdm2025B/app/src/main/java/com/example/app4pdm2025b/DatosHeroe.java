package com.example.app4pdm2025b;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DatosHeroe extends AppCompatActivity {

    TextView nombreObt,ligaObt,poderObt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_datos_heroe);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //text view
        nombreObt = findViewById(R.id.txt_nombre);
        ligaObt = findViewById(R.id.txt_liga);
        poderObt = findViewById(R.id.txt_poder);

        //datos obtenidos del primer activity
        String datoNombre = getIntent().getStringExtra("nombreLlave");
        String datoLiga = getIntent().getStringExtra("ligaLlave");
        int datoPoder = getIntent().getIntExtra("poderLlave",0);

        //mostrar valores
        nombreObt.setText(datoNombre);
        ligaObt.setText(datoLiga);
        poderObt.setText(""+datoPoder);
    }
}