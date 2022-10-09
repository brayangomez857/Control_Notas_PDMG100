package com.example.aplicacion_notas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.CarrierConfigManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;


import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
  Button Alejandro, Brayan, Carlos, David;
  int contadorpasan1, contadornopasan2;
  TextView ResultadoA, ResultadoB, ResultadoC, ResultadoD,Pasan,Nopasan;
  EditText nota1a, nota2a, nota3a, nota4a,
      nota1b, nota2b, nota3b, nota4b,
      nota1c, nota2c, nota3c, nota4c,
      nota1d, nota2d, nota3d, nota4d;
  boolean notafinal, bienvenida;
  CheckBox r1;




  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    Alejandro = findViewById(R.id.Calcular_Alejandro);
    Brayan = findViewById(R.id.Calcular_Brayan);
    Carlos = findViewById(R.id.Calcular_Carlos);
    David = findViewById(R.id.Calcular_david);
    ResultadoA = findViewById(R.id.tvresultadoalejandro);
    ResultadoB = findViewById(R.id.tvresultadobrayan);
    ResultadoC = findViewById(R.id.tvresultadocarlos);
    ResultadoD = findViewById(R.id.tvresultadodavid);
    nota1a = findViewById(R.id.etValor1A);
    nota2a = findViewById(R.id.etValor2A);
    nota3a = findViewById(R.id.etValor3A);
    nota4a = findViewById(R.id.etValor4A);
    nota1b = findViewById(R.id.etValor1b);
    nota2b = findViewById(R.id.etValor2b);
    nota3b = findViewById(R.id.etValor3b);
    nota4b = findViewById(R.id.etValor4b);
    nota1c = findViewById(R.id.etValor1c);
    nota2c = findViewById(R.id.etValor2c);
    nota3c = findViewById(R.id.etValor3c);
    nota4c = findViewById(R.id.etValor4c);
    nota1d = findViewById(R.id.etValor1d);
    nota2d = findViewById(R.id.etValor2d);
    nota3d = findViewById(R.id.etValor3d);
    nota4d = findViewById(R.id.etValor4d);
    r1= findViewById(R.id.cbdocente);
    Pasan=findViewById(R.id.tvpasan);
    Nopasan=findViewById(R.id.tvnopasan);




Alejandro.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View view) {
    double total1a= Double.parseDouble(nota1a.getText().toString());
    double total2a= Double.parseDouble(nota2a.getText().toString());
    double total3a= Double.parseDouble(nota3a.getText().toString());
    double total4a= Double.parseDouble(nota4a.getText().toString());
    double resultadoa=(total1a*0.2)+(total2a*0.3)+(total3a*0.15)+(total4a*0.35);
    ResultadoA.setText(String.valueOf(resultadoa));

    if (resultadoa>=3){
      Toast.makeText(MainActivity.this, "El alumno paso la materia", Toast.LENGTH_SHORT).show();
      notafinal=true;
      contadorpasan1++;
      Pasan.setText(String.valueOf(contadorpasan1));
    }
    else {
      Toast.makeText(MainActivity.this, "El alumno NO paso la materia", Toast.LENGTH_SHORT).show();
      notafinal=false;
      contadornopasan2++;
      Nopasan.setText(String.valueOf(contadornopasan2));
    }
  }
});
Brayan.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View view) {
    double total1b= Double.parseDouble(nota1b.getText().toString());
    double total2b= Double.parseDouble(nota2b.getText().toString());
    double total3b= Double.parseDouble(nota3b.getText().toString());
    double total4b= Double.parseDouble(nota4b.getText().toString());
    double resultadob=(total1b*0.2)+(total2b*0.3)+(total3b*0.15)+(total4b*0.35);
    ResultadoB.setText(String.valueOf(resultadob));
    if (resultadob>=3){
      Toast.makeText(MainActivity.this, "El alumno paso la materia", Toast.LENGTH_SHORT).show();
      notafinal=true;
      contadorpasan1++;
      Pasan.setText(String.valueOf(contadorpasan1));

    }
    else {
      Toast.makeText(MainActivity.this, "El alumno NO paso la materia", Toast.LENGTH_SHORT).show();
      notafinal=false;
      contadornopasan2++;
      Nopasan.setText(String.valueOf(contadornopasan2));
    }


  }
});
Carlos.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View view) {
    double total1c= Double.parseDouble(nota1c.getText().toString());
    double total2c= Double.parseDouble(nota2c.getText().toString());
    double total3c= Double.parseDouble(nota3c.getText().toString());
    double total4c= Double.parseDouble(nota4c.getText().toString());
    double resultadoc=(total1c*0.2)+(total2c*0.3)+(total3c*0.15)+(total4c*0.35);
    ResultadoC.setText(String.valueOf(resultadoc));

    if (resultadoc>=3){
      Toast.makeText(MainActivity.this, "El alumno paso la materia", Toast.LENGTH_SHORT).show();
      notafinal=true;
      contadorpasan1++;
      Pasan.setText(String.valueOf(contadorpasan1));

    }
    else {
      Toast.makeText(MainActivity.this, "El alumno NO paso la materia", Toast.LENGTH_SHORT).show();
      notafinal=false;
      contadornopasan2++;
      Nopasan.setText(String.valueOf(contadornopasan2));
    }
  }
});
David.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View view) {
    double total1d= Double.parseDouble(nota1d.getText().toString());
    double total2d= Double.parseDouble(nota2d.getText().toString());
    double total3d= Double.parseDouble(nota3d.getText().toString());
    double total4d= Double.parseDouble(nota4d.getText().toString());
    double resultadod=(total1d*0.2)+(total2d*0.3)+(total3d*0.15)+(total4d*0.35);
    ResultadoD.setText(String.valueOf(resultadod));
    if (resultadod>=3){
      Toast.makeText(MainActivity.this, "El alumno paso la materia", Toast.LENGTH_SHORT).show();
      notafinal=true;
      contadorpasan1++;
      Pasan.setText(String.valueOf(contadorpasan1));

    }
    else {
      Toast.makeText(MainActivity.this, "El alumno NO paso la materia", Toast.LENGTH_SHORT).show();
      notafinal=false;
      contadornopasan2++;
      Nopasan.setText(String.valueOf(contadornopasan2));

    }
  }
});


    if (r1.isChecked()==true){
      Toast.makeText(MainActivity.this, "Bienvenido Docente", Toast.LENGTH_SHORT).show();
      bienvenida=true;
    }

  }

}

