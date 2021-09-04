package com.example.hw2_438;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.os.Bundle;
import android.widget.Toast;

import java.util.Map;

public class login extends AppCompatActivity {
    private String user = "lexi", pass = "lol";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        Button login = findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et_user = findViewById(R.id.username), et_pass = findViewById(R.id.password);

                if (et_user.getText().toString().equals(user) && et_pass.getText().toString().equals(pass)) {
                    et_user.setBackgroundColor(0x00000000);
                    et_pass.setBackgroundColor(0x00000000);
                    Toast.makeText(login.this, "Success!", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(login.this, MainActivity.class));
                }
                else if (!et_user.getText().toString().equals(user) && !et_pass.getText().toString().equals(pass)) {
                    et_pass.setBackgroundColor(0x55FF0000);
                    et_user.setBackgroundColor(0x55FF0000);
                    Toast.makeText(login.this, "Incorrect Password and Username!", Toast.LENGTH_SHORT).show();
                }
                else if (!et_pass.getText().toString().equals(pass)) {
                    et_pass.setBackgroundColor(0x55FF0000);
                    et_user.setBackgroundColor(0x00000000);
                    Toast.makeText(login.this, "Incorrect Password!", Toast.LENGTH_SHORT).show();
                }
                else if (!et_user.getText().toString().equals(user)) {
                    et_user.setBackgroundColor(0x55FF0000);
                    et_pass.setBackgroundColor(0x00000000);
                    Toast.makeText(login.this, "Incorrect Username!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public static String isValidCredentials(String username, String password) {
            if(username.equals("lexi")){
                if(password.equals("lol")){
                    return "valid";
                }
                else{
                    return "wrong password";
                }
            }
        return "wrong user";
    }
}