package com.upt.cti.highschoolassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NoteActivity extends AppCompatActivity {

    TextView rezultat;

    EditText editText1;
    EditText editText2;
    EditText editText3;


    Button medie;

    double rez;
    int num1, num2;
    int med;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);

        rezultat = findViewById(R.id.rezultat);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        editText3 = findViewById(R.id.editText3);


        medie = findViewById(R.id.medie);

        medie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(editText1.getText().toString());
                num2 = Integer.parseInt((editText2.getText()).toString());
                med = Integer.parseInt(editText3.getText().toString());

                rez = (0.2 * med )+ 0.8*(num1 + num2);
                rezultat.setText(String.valueOf(rez));

            }
        });


    }
}
