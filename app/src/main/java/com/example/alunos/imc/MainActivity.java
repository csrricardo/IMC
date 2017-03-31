package com.example.alunos.imc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SeekBar seekBar = (SeekBar)findViewById(R.id.seekBar);
        final TextView txtPeso = (TextView)findViewById(R.id.txtPeso);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                  txtPeso.setText(progress + " Kg. ");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                //Toast.makeText(MainActivity.this, "COMEÇOU A MOVER", Toast.LENGTH_SHORT ).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //Toast.makeText(MainActivity.this, "PAROU DE MOVER", Toast.LENGTH_SHORT ).show();
            }
        });
    }

    public void calcularImc(View view){

        EditText edtAlutura = (EditText)findViewById(R.id.edtAltura);
        String altura = edtAlutura.getText().toString();

        SeekBar seekBar = (SeekBar)findViewById(R.id.seekBar);
        int peso = seekBar.getProgress();

        Intent intent = new Intent(this, ImcActivity.class);

        intent.putExtra("ALTURA", Double.parseDouble(altura));
        intent.putExtra("PESO", peso);

        startActivity(intent);


    }

}
