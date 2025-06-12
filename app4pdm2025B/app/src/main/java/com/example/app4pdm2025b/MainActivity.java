package com.example.app4pdm2025b;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText etNombre;
    EditText etLiga;
    EditText etPoder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        etNombre = findViewById(R.id.et_nombre);
        etLiga = findViewById(R.id.et_liga);
        etPoder = findViewById(R.id.et_poder);
    }

    public void verHeroe(View v){
        //obtener valor de los campos
        String nombreDato = etNombre.getText().toString();
        String ligaDato = etLiga.getText().toString();
        int poderDato = Integer.parseInt(etPoder.getText().toString());
        //Intent para datos
        Intent it = new Intent(getApplicationContext(),DatosHeroe.class);
        it.putExtra("nombreLlave", nombreDato);
        it.putExtra("ligaLlave",ligaDato);
        it.putExtra("poderLlave", poderDato);
        startActivity(it);
    }
}