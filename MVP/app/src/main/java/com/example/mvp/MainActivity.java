package com.example.mvp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.mvp.presenter.LoginPresenter;
import com.example.mvp.view.LoginActivity;

public class MainActivity extends AppCompatActivity {
    private static final int SCREEN = 1;

    private LoginPresenter loginPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginPresenter = new LoginPresenter();
        loginPresenter.lstFilms(null);

        final Handler handler = new Handler();
        // SetTimeOut - SetInterval
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent screenChanger = new Intent(
                        getBaseContext(),
                        LoginActivity.class
                );
                startActivity(screenChanger);
            }
        },4000);
    }
}