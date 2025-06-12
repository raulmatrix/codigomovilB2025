package com.example.app6pdm2025b;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PrecioProducto extends AppCompatActivity {

    TextView categoria,precio,cantidad,resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_precio_producto);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        categoria = findViewById(R.id.txtcategoria);
        precio = findViewById(R.id.txtprecio);
        cantidad = findViewById(R.id.txtcantidad);
        resultado = findViewById(R.id.txtresultado);

        String respCategoria = getIntent().getStringExtra("categoriaLlave");
        int respPrecio = getIntent().getIntExtra("precioLlave",0);
        int respCantidad = getIntent().getIntExtra("cantidadLlave",0);

        int resul = respPrecio * respCantidad;

        //datos para mostrar en pantalla
        categoria.setText(""+respCategoria);
        precio.setText(""+respPrecio);
        cantidad.setText(""+respCantidad);
        resultado.setText(""+resul);
    }
}