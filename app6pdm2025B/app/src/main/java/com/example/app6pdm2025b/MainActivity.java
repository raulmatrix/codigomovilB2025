package com.example.app6pdm2025b;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner spCategorias;
    EditText etNombre;
    EditText etPrecio;
    EditText etCantidad;
    ArrayList<Producto> listaP = new ArrayList<Producto>();


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
        spCategorias = findViewById(R.id.sp_productoCat);
        etNombre = findViewById(R.id.et_nombreP);
        etPrecio = findViewById(R.id.et_precio);
        etCantidad = findViewById(R.id.et_cantidad);
    }
    //registrar productos en un arraylist
    public void registrarProductos(View v){
        String categorias = spCategorias.getSelectedItem().toString();
        String nombre = etNombre.getText().toString();
        double precio = Double.parseDouble(etPrecio.getText().toString());
        double cantidad = Double.parseDouble(etCantidad.getText().toString());

        //crear el objeto de tipo Producto
        Producto producto = new Producto(categorias,nombre,precio,cantidad);
        //adicion al arraylist
        listaP.add(producto);

        //limpiar los campos o setearlos
        etNombre.setText("");
        etPrecio.setText(""+0);
        etCantidad.setText(""+1);
    }

    public void calcularPrecio(View v){
        Intent it = new Intent(getApplicationContext(),CostoTotal.class);
        it.putExtra("listaProductos",listaP);
        startActivity(it);
    }
}