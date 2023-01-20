package com.example.mvc_netflix_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.mvc_netflix_1.controller.UserController;
import com.example.mvc_netflix_1.model.UserWS;
import com.example.mvc_netflix_1.model.pojo.User;

public class MainActivity extends AppCompatActivity {
    private UserController controller;
    private MainActivity view;
    private UserWS model;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //CARGAR VIEW
        view = this;
        //CARGAR MODEL
        //MODEL + VIEW
        controller = new UserController(model, view);
        // CASO DE USO -> OBTENER ESTUDIANTE
            controller.getStudent();
    }

    public void printStudentDetails(User user){
        findViewById(R.id.edtEmail);
        findViewById(R.id.edtPassword);
        Log.d("MainActivity - USER",user.getUser());
        Log.d("MainActivity - PASSWORD", user.getPassword());
    }
}