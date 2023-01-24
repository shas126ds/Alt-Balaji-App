package com.seeksolution.registrationwithlogindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Pattern;

public class MainActivity2 extends AppCompatActivity {

    private EditText edtName, edtFatherName, edtAddress, edtNumber, edtEmail, edtpassword;
    private TextView txt_1, txt_2, txt_3, txt_4, txt_5,txt_6;
    private String name, fatherName,address, number, email, pass;

    public static final Pattern EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",Pattern.CASE_INSENSITIVE);
    public static final Pattern PASSWORD_PATTERN = Pattern.compile("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        edtName = (EditText) findViewById(R.id.edtName);
        edtFatherName = (EditText) findViewById(R.id.edtFatherName);
        edtAddress = (EditText) findViewById(R.id.edtAddress);
        edtNumber = (EditText) findViewById(R.id.edtNumber);
        edtEmail = (EditText) findViewById(R.id.edtEmail);
        edtpassword = (EditText) findViewById(R.id.edtpassword);

        txt_1 = (TextView) findViewById(R.id.txt_1);
        txt_2 = (TextView) findViewById(R.id.txt_2);
        txt_3 = (TextView) findViewById(R.id.txt_3);
        txt_4 = (TextView) findViewById(R.id.txt_4);
        txt_5 = (TextView) findViewById(R.id.txt_5);
        txt_6 = (TextView) findViewById(R.id.txt_6);
    }

    public void registerNow(View view) {
        name = edtName.getText().toString();
        fatherName = edtFatherName.getText().toString();
        address = edtAddress.getText().toString();
        number = edtNumber.getText().toString();
        email = edtEmail.getText().toString();
        pass = edtpassword.getText().toString();

        validateName(name);
        validateFatherName(fatherName);
        validateAddrees(address);
        validateNumber(number);
        validateEmail(email);
        validatepass(pass);

        if( validateName(name) && validateFatherName(fatherName) && validateAddrees(address) && validateNumber(number)  &&  validateEmail(email) && validatepass(pass)){
            Toast.makeText(this, "Registration Successfully...", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(MainActivity2.this,MainActivity.class);
            startActivity(intent);
        }

//        Intent intent = new Intent(MainActivity2.this,MainActivity.class);
//        startActivity(intent);

    }
//    private boolean validateName(String name){
//        if(name.isEmpty()){
//            txt_1.setText("Name is Required");
//            return false;
//        }
//        txt_1.setText("");
//        return true;
//    }

    private boolean validateName(String name){
        if(name.isEmpty()){
            txt_1.setText("Name is Required..");
            edtName.setBackgroundResource(R.drawable.error_layout);
            return false;
        }
        if(name.length() < 6 ){
            txt_1.setText("Sorry, you need to enter at least 5 characters");
            return false;
        }
        edtName.setBackgroundResource(R.drawable.success_layout);
        txt_1.setText("");
        return true;

    }



//    private boolean validateFatherName(String fatherName){
//        if(fatherName.isEmpty()){
//            txt_2.setText("FatherName is Required");
//            return false;
//
//        }
//        txt_2.setText("");
//        return true;
//    }


    private boolean validateFatherName(String fatherName){
        if(fatherName.isEmpty()){
            txt_2.setText("FatherName is Required..");
            edtFatherName.setBackgroundResource(R.drawable.error_layout);
            return false;
        }
        if(fatherName.length() < 6 ){
            txt_2.setText("Sorry, you need to enter at least 5 characters");
            return false;
        }
        edtFatherName.setBackgroundResource(R.drawable.success_layout);
        txt_2.setText("");
        return true;

    }

//    private boolean validateAddrees(String address){
//        if(address.isEmpty()){
//            txt_3.setText("Addrees is Required");
//            return false;
//        }
//        txt_3.setText("");
//        return true;
//    }

    private boolean validateAddrees(String address){
        if(address.isEmpty()){
            txt_3.setText("Address is Required..");
            edtAddress.setBackgroundResource(R.drawable.error_layout);
            return false;
        }
        if(address.length() < 6 ){
            txt_3.setText("Sorry, you need to enter at least 5 characters");
            return false;
        }
        edtAddress.setBackgroundResource(R.drawable.success_layout);
        txt_3.setText("");
        return true;

    }


//    private boolean validateNumber(String number){
//        if(number.isEmpty()){
//            txt_4.setText("Number is Required");
//            return false;
//        }
//        txt_4.setText("");
//        return true;
//    }

    private boolean validateNumber(String number){
        if(number.isEmpty()){
            txt_4.setText("Number is Required..");
            edtNumber.setBackgroundResource(R.drawable.error_layout);
            return false;
        }
        if(number.length() < 6 ){
            txt_4.setText("Sorry, number should be 10 digits");
            return false;
        }
        edtNumber.setBackgroundResource(R.drawable.success_layout);
        txt_4.setText("");
        return true;

    }

    private boolean validateEmail(String email){
        if(email.isEmpty()){
            txt_5.setText("Email is Required");
            edtEmail.setBackgroundResource(R.drawable.error_layout);
            return false;
        }
        if(!EMAIL_ADDRESS_REGEX.matcher(email).matches()){
            txt_5.setText("Invalid Email");
            edtEmail.setBackgroundResource(R.drawable.error_layout);
            return false;
        }
        edtEmail.setBackgroundResource(R.drawable.success_layout);
        txt_5.setText("");
        return true;
    }
    private boolean validatepass(String pass){
        if(pass.isEmpty()){
            txt_6.setText("Password is Required");
            edtpassword.setBackgroundResource(R.drawable.error_layout);
            return false;
        }
        if(!PASSWORD_PATTERN.matcher(pass).matches()){
            txt_6.setText("Invalid Password..");
            edtpassword.setBackgroundResource(R.drawable.error_layout);
            return false;
        }
        edtpassword.setBackgroundResource(R.drawable.success_layout);
        txt_6.setText("");
        return true;
    }

    public void login(View view) {
        Intent intent = new Intent(MainActivity2.this,MainActivity.class);
        startActivity(intent);
    }
}