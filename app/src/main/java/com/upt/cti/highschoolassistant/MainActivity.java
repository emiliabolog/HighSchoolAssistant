package com.upt.cti.highschoolassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

import static android.provider.ContactsContract.CommonDataKinds.Website.URL;

public class MainActivity extends AppCompatActivity {
     Button specActivity;
     Spinner spinner2;

     String url = "http://localhost/Licenta2/getData2.php";

     ArrayList<String> numeSpec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        specActivity = findViewById(R.id.specActivity);
//
//        specActivity.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, NoteActivity.class);
//                startActivity(intent);
//            }
//        });
//
//        numeSpec = new ArrayList<>();
//        spinner2 = findViewById(R.id.spinner2);
//        loadSpinner2Data(URL);
//
//        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                String numeLiceu = spinner2.getItemAtPosition(spinner2.getSelectedItemPosition()).toString();
//
//            }
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//
//            }
//        });
    }

//    private  void loadSpinner2Data(String url){
//
//    }
}

