package com.example.bugapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Arrays;
import java.util.List;

public class LoginActivity extends AppCompatActivity {

    private EditText etAuthor, etPassword;
    private Button btnLogin;

    // Hardcoded credentials for demonstration
    private final String REQUIRED_AUTHOR = "Java_nih_deks";

    // List of allowed passwords
    private final List<String> ALLOWED_PASSWORDS = Arrays.asList(
        "pass1",
        "pass2",
        "admin123"
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etAuthor = findViewById(R.id.etAuthor);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String author = etAuthor.getText().toString();
                String password = etPassword.getText().toString();

                if (author.equals(REQUIRED_AUTHOR) && ALLOWED_PASSWORDS.contains(password)) {
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(LoginActivity.this, getString(R.string.invalid_creds), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
