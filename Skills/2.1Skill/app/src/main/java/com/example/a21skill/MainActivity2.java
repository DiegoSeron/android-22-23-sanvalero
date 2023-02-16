package com.example.a21skill;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener{

    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn1 = (Button) findViewById(R.id.buttonAnonima);
        btn2 = (Button) findViewById(R.id.buttonImplements);
        btn2.setOnClickListener(this);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Desde la anonima", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonOnclick:
            Toast.makeText(getApplicationContext(), "Desde el onclick del metodo", Toast.LENGTH_SHORT).show();
            break;
            case R.id.buttonImplements:
                Toast.makeText(getApplicationContext(), "Desde el onclick del implements", Toast.LENGTH_SHORT).show();
                break;
        }
    }
    
    

}
