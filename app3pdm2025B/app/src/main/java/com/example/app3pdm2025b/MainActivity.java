package com.example.app3pdm2025b;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView numero;
    int contador;
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

        //relacion con el componente grafico
        numero = findViewById(R.id.txt_numero);
        contador = 0;
    }

    public void btnMas(View v){
        int valor = Integer.parseInt(numero.getText().toString());
        valor++;
        numero.setText(""+valor);
        Toast.makeText(getApplicationContext(),"Mensaje prueba"+valor,Toast.LENGTH_SHORT).show();
    }

    public void btnMenos(View v){
        int valor = Integer.parseInt(numero.getText().toString());
        valor--;
        numero.setText(""+valor);
    }
}