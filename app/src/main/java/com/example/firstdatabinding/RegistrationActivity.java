package com.example.firstdatabinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.firstdatabinding.databinding.ActivityMainBinding;
import com.example.firstdatabinding.databinding.RegistrationBinding;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RegistrationBinding registrationBinding = DataBindingUtil.setContentView(this, R.layout.registration);


        RegistrationModel registrationModel = new RegistrationModel("DILIP", 38, "JEYPORE",false);
        registrationBinding.setRegistration(registrationModel);
    }
}
