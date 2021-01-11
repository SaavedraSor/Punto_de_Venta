package com.example.inicio_punto_venta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menubd extends AppCompatActivity {
Button consultar,modificar,eliminar,insertar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menubd);

        consultar = (Button) findViewById(R.id.consul);

        consultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent consultar = new Intent(Menubd.this,consultar.class);
                startActivity(consultar);
            }
        });
        modificar = (Button) findViewById(R.id.button2);

        modificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent modificar = new Intent(Menubd.this,Modificar.class);
                startActivity(modificar);
            }
        });

        insertar = (Button) findViewById(R.id.insert);

        insertar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent insertar = new Intent(Menubd.this,insertar.class);
                startActivity(insertar);
            }
        });

        eliminar = (Button) findViewById(R.id.menu);

        eliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent eliminar = new Intent(Menubd.this,eliminar.class);
                startActivity(eliminar);
            }
        });

    }
}