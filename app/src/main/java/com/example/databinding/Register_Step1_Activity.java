package com.example.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.databinding.databinding.ActivityMainBinding;
import com.example.databinding.databinding.ActivityRegisterStep1Binding;
import com.example.databinding.model.RegisterStep1;
import com.example.databinding.model.Wellcome;

public class Register_Step1_Activity extends AppCompatActivity {
    private Wellcome welcome;
    private RegisterStep1 registerStep1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_welcome);

        ActivityRegisterStep1Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_register__step1_);
        registerStep1 = new RegisterStep1("Let's get started", "Never a better time than now to start thinking about how are manage all your finances whithease", "Creat Acount", "Log in");
        binding.setRegisterStep1(registerStep1);
        Toast.makeText(this, "Register1", Toast.LENGTH_SHORT).show();
    }

    public void register(View view) {
        Intent intent = new Intent(Register_Step1_Activity.this, Register_Step2_Activity.class);
        startActivity(intent);
    }
}