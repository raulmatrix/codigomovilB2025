package com.example.app6pdm2025b;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class CostoTotal extends AppCompatActivity {

    String mostrarCostos = "";
    TextView costos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_costo_total);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        costos = findViewById(R.id.txt_costos);
        //forma para obtener el arraylist
        ArrayList<Producto> listaObtenida = (ArrayList<Producto>) getIntent().getSerializableExtra("listaProductos");

        if(!listaObtenida.isEmpty()){
            for(int i=0; i<listaObtenida.size();i++){
                mostrarCostos+="\nNombre Producto: "+listaObtenida.get(i).getNombre();
                mostrarCostos+="\nPrecio Parcial: "+listaObtenida.get(i).calcularPrecio();
                mostrarCostos+="\n ------------------";
            }

            costos.setText(mostrarCostos);
        }else{
            Toast.makeText(getApplicationContext(),"Lista Vacia",Toast.LENGTH_SHORT).show();
        }

    }
}