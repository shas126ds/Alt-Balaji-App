package com.seeksolution.registrationwithlogindemo;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    private EditText edt_email, edt_pass;
    private TextView error_email, error_pass;
    private String email, pass;
    public static final Pattern EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",Pattern.CASE_INSENSITIVE);
    public static final Pattern PASSWORD_PATTERN = Pattern.compile("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_email = (EditText) findViewById(R.id.edt_email);
        edt_pass = (EditText) findViewById(R.id.edt_pass);

        error_email = (TextView) findViewById(R.id.error_email);
        error_pass = (TextView) findViewById(R.id.error_pass);

    }

    public void submit(View view) {
        email = edt_email.getText().toString();
        pass = edt_pass.getText().toString();

        //validateEmail(email);
        //Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();

        // validatepassword(pass);
        // Blank validation for email
        // Blank validation for pass

        if(validateEmail(email) | validatepassword(pass)) {
            // Toast.makeText(this, "" + email + pass, Toast.LENGTH_SHORT).show();
            if (email.equals("shashank@gmail.com") && pass.equals("Password@123")) {
                Toast.makeText(this, "Login Success", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,NavigationDrawerActivity.class);
                startActivity(intent);
            } else {
                Toast.makeText(this, "Invalid Email or Password", Toast.LENGTH_SHORT).show();
                edt_email.setBackgroundResource(R.drawable.error_layout);
                edt_pass.setBackgroundResource(R.drawable.error_layout);
            }
        }
    }
    private  boolean validateEmail(String email){
        if(email.isEmpty()){
            error_email.setText("Email field is Required..");
            edt_email.setBackgroundResource(R.drawable.error_layout);
            return false;
        }
        if(!EMAIL_ADDRESS_REGEX.matcher(email).matches()){
            error_email.setText("Invalid Email");
            return false;
        }
        edt_email.setBackgroundResource(R.drawable.success_layout);
        error_email.setText("");
        return true;
    }
    private boolean validatepassword(String pass){
        if(pass.isEmpty()){
            error_pass.setText("Password field is Required..");
            edt_pass.setBackgroundResource(R.drawable.error_layout);
            return false;
        }
        if(!PASSWORD_PATTERN.matcher(pass).matches()){
            error_pass.setText("Invalid Password..");
            return false;
        }
        edt_pass.setBackgroundResource(R.drawable.success_layout);
        error_pass.setText("");
        return true;
    }

    public void createAccount(View view) {
        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        startActivity(intent);
        //finish
    }
}