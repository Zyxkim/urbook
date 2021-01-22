package com.adzteam.urbook.authorization;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.adzteam.urbook.R;

public class AuthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);

        replaceWithLoginFragment();
    }

    public void replaceWithLoginFragment() {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.activity_auth_container, new LoginFragment())
                .addToBackStack(null)
                .commit();
    }
}