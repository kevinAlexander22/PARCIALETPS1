package com.example.parcial1etps1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtName,edtPass;
    Button btnlogin,captura;
    TextView txvMensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtName=findViewById(R.id.edtName);
        edtPass=findViewById(R.id.edtPass);
        txvMensaje=findViewById(R.id.txvMensaje);
        btnlogin=(Button)findViewById(R.id.btnLogin);

            btnlogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(edtName.getText().toString().equals("123") && edtPass.getText().toString().equals("123") ) {
                    startActivity(new Intent(MainActivity.this, CalculoIMC.class));
                    }else{
                        txvMensaje.setText("Error de Usuario o contrasena");
                    }
                }
            });

    }
    public void Captura(View e){
        String username;
        // username = edtName.getText().toString();
        //   password = edtPass.getText().toString();
        username =edtName.getText().toString();
        txvMensaje.setText("Error de Usuario o contrasena"+String.valueOf(username));
    }


}