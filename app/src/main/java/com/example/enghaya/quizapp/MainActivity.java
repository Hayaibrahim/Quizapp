package com.example.enghaya.quizapp;

import android.content.Context;
import android.os.StrictMode;
import android.provider.MediaStore;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int Score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText name = (EditText) findViewById(R.id.editText);//Q1

        RadioButton Radio1 = (RadioButton) findViewById(R.id.radioButton);
        RadioButton Radio2 = (RadioButton) findViewById(R.id.radioButton2);
        RadioButton Radio3 = (RadioButton) findViewById(R.id.radioButton3);
        RadioButton Radio4 = (RadioButton) findViewById(R.id.radioButton4);

        CheckBox check1 = (CheckBox) findViewById(R.id.checkBox);
        CheckBox check2 = (CheckBox) findViewById(R.id.checkBox2);
        CheckBox check3 = (CheckBox) findViewById(R.id.checkBox3);
        CheckBox check4 = (CheckBox) findViewById(R.id.checkBox4);
        TextView scor = (TextView) findViewById(R.id.textView5);

        if (name.getText().equals("Linear layout"))
            Score++;
        if (Radio1.isChecked()) {
            Score++;
        }
        if (Radio4.isChecked()) {
            Score++;
        }
        if (check1.isChecked()) {
            Score++;
        }
        if (check3.isChecked()) {
            Score++;
        }
        System.out.print(Score);
    }


    public void display() {
        LinearLayout re = (LinearLayout) findViewById(R.id.textView5);

        String scr = String.valueOf(Score);

        TextView score1 = (TextView) findViewById(R.id.textView5);
        score1.setText(scr);
    }

}

