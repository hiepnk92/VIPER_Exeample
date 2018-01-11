package com.example.hiepnk.viper.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.hiepnk.viper.R;

public class MainActivity extends AppCompatActivity implements MainContracts.View{


    MainContracts.Presenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainPresenter = new MainPresenter(this);

    }

}
