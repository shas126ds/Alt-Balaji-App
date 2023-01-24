package com.fms.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText et_1,et_2,et_3;
    private TextView text_1,text_2,text_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_1=(EditText) findViewById(R.id.etext_1);
        et_2=(EditText) findViewById(R.id.etext_2);
        et_3=(EditText) findViewById(R.id.etext_3);
    }
    public void submit(View view){
        String name1= et_1.getText().toString();
        String name2= et_2.getText().toString();
        String name3= et_3.getText().toString();
//        Toast.makeText(this, "your name"+name1+"your emAIL"+name2+"your father "+name3, Toast.LENGTH_SHORT).show();

    }
}