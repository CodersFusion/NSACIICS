package com.abhshiek.myproject;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.abhshiek.myproject.Fragments.SignUp;
import com.abhshiek.myproject.Fragments.login;

public class Login extends AppCompatActivity implements SignUp.OnFragmentInteractionListener {
    TextView userLogin,artistLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        userLogin = findViewById(R.id.userlogin);
        artistLogin = findViewById(R.id.artistlogin);
//
//        FragmentManager manager = getSupportFragmentManager();
//        FragmentTransaction transaction = manager.beginTransaction();
//        transaction.replace(R.id.forms, new login());
//        transaction.addToBackStack(null);
//        transaction.commit();

        artistLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.forms, new SignUp());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });
    }
}
