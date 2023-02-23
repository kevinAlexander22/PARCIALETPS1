package com.example.parcial1etps1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtPeso,edtAltura;
    Button btnCalcular;
    TextView txvDatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtPeso=findViewById(R.id.edtPeso);
        edtAltura=findViewById(R.id.edtPeso);
        txvDatos=findViewById(R.id.txvDato);

    }
    public void Proceso(View v){
        double peso,altura,imc;
        peso=Double.parseDouble(edtPeso.getText().toString());
        altura=Double.parseDouble(edtAltura.getText().toString());

        imc=peso/(altura*altura);

        if (imc<10.5){
            txvDatos.setText("Críticamente Bajo de Peso"+String.valueOf(imc));
        }else if(imc<15.9){
            txvDatos.setText("Severamente Bajo de Peso"+String.valueOf(imc));
        }else if(imc<18.5){
            txvDatos.setText("Bajo de Peso"+String.valueOf(imc));
        }else if(imc<25){
            txvDatos.setText("Normal (peso saludable"+String.valueOf(imc));
        }else if(imc<30){
            txvDatos.setText("Sobrepeso"+String.valueOf(imc));
        }else if(imc<35){
            txvDatos.setText("Obesidad Clase 1 - Moderadamente Obeso"+String.valueOf(imc));
        }else if(imc<40){
            txvDatos.setText("Obesidad Clase 2 - Severamente Obeso"+String.valueOf(imc));
        }else if(imc<50){
            txvDatos.setText("Obesidad Clase 3 - Críticamente Obeso"+String.valueOf(imc));
        }








    }
}