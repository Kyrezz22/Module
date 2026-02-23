package com.example.bugapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etTarget;
    private Button btnBugWA, btnBugGroup, btnBugEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etTarget = findViewById(R.id.etTarget);
        btnBugWA = findViewById(R.id.btnBugWA);
        btnBugGroup = findViewById(R.id.btnBugGroup);
        btnBugEmail = findViewById(R.id.btnBugEmail);

        btnBugWA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleAction("Bug WA");
            }
        });

        btnBugGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleAction("Bug Group");
            }
        });

        btnBugEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleAction("Bug Email");
            }
        });
    }

    private void handleAction(String actionName) {
        String target = etTarget.getText().toString();
        if (target.isEmpty()) {
            Toast.makeText(MainActivity.this, getString(R.string.enter_target), Toast.LENGTH_SHORT).show();
        } else {
            // Placeholder for educational purposes
            Toast.makeText(MainActivity.this, "Action '" + actionName + "' triggered for " + target, Toast.LENGTH_SHORT).show();
        }
    }
}
