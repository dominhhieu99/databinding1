package com.example.databinding.UI;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.databinding.R;
import com.example.databinding.databinding.ActivityMainBinding;
import com.example.databinding.model.Wellcome;

public class MainActivity extends AppCompatActivity {
    private Wellcome welcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_welcome);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        welcome = new Wellcome("Let's get started", "Never a better time than now to start thinking about how are manage all your finances whithease", "Creat Acount", "Log in");
        binding.setWelcome(welcome);
    }

    public void register(View view) {
        Intent intent = new Intent(MainActivity.this, RegisterStep1Activity.class);
        startActivity(intent);
    }

}