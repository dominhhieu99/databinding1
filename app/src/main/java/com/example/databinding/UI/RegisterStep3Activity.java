package com.example.databinding.UI;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.databinding.R;
import com.example.databinding.databinding.ActivityRegisterStep3Binding;
import com.example.databinding.model.RegistepStep3;

public class RegisterStep3Activity extends AppCompatActivity {
    private RegistepStep3 registepStep3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //   setContentView(R.layout.activity_register__step3_);
        Toast.makeText(this, "Register3", Toast.LENGTH_SHORT).show();
        ActivityRegisterStep3Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_register__step3_);
        registepStep3 = new RegistepStep3("Step 3/4","Fingerprint","To add your dingerprint,l lift and rest your finger at homebutton repeatedly (optional).","Continue");
        binding.setRegisterStep3(registepStep3);
    }

    public void onContinueClickListener3(View view) {
        Intent intent = new Intent(RegisterStep3Activity.this, RegisterStep4Activity.class);
        startActivity(intent);
    }

    public void onBackClickListener3(View view) {
        Intent intent = new Intent(RegisterStep3Activity.this, RegisterStep2Activity.class);
        startActivity(intent);
    }
}
