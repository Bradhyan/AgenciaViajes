package com.example.agenciadeviajes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    TextView jtvsubtotal,jtvtotal,jtviva,jtvvehiculo,jtvciudad;
    RadioButton jrbcartagena,jrbleticia,jrbpuntacana;
    EditText jetcantidad;
    CheckBox jcbvehiculo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Ocultar la barra de titulo por defecto
        getSupportActionBar().hide();
        //Asociar los objetos Xml con los objetos Java
        jtvsubtotal=findViewById(R.id.tvsubtotal);
        jtvtotal=findViewById(R.id.tvtotal);
        jtviva=findViewById(R.id.tviva);
        jtvvehiculo=findViewById(R.id.tvvehiculo);
        jtvciudad=findViewById(R.id.tvciudad);
        jrbcartagena=findViewById(R.id.rbcartagena);
        jrbleticia=findViewById(R.id.rbleticia);
        jrbpuntacana=findViewById(R.id.rbpuntacana);
        jetcantidad=findViewById(R.id.etcantidad);
        jcbvehiculo=findViewById(R.id.cbvehiculo);
    }

    public void Calcular(View view){
        String cantidad;
        //Pasar la informacion de un objeto Java a una variables de RAM
        cantidad=jetcantidad.getText().toString();
        //Validar que cantidad no este vacio
        if (cantidad.isEmpty()){
            Toast.makeText(this, "La cantidad de personas es requerida", Toast.LENGTH_SHORT).show();
            jetcantidad.requestFocus();
        }else{

        }
    }
}

