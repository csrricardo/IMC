package com.example.alunos.imc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ImcActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);

        Intent intent = getIntent();

        double altura = intent.getDoubleExtra("ALTURA", 0);
        int peso = intent.getIntExtra("PESO", 0);

        TextView txtPeso2 = (TextView)findViewById(R.id.txtPeso2);
        TextView txtAltura = (TextView)findViewById(R.id.txtAltura);
        TextView txtImc = (TextView)findViewById(R.id.txtImc);
        TextView txtCategoria = (TextView)findViewById(R.id.txtCategoria);

        txtPeso2.setText(peso + "Kg.");
        txtAltura.setText(altura + "m.");

        Imc imc = new Imc(peso, altura);
        txtImc.setText(String.format("%2.2f",imc.calcularValor()));
        txtCategoria.setText(imc.calcularCategoria());

    }
}
