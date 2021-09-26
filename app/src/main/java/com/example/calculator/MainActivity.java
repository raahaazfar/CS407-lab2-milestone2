package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void addFunction(View view) {
        EditText firstNum = findViewById(R.id.firstNumber);
        String firstString = firstNum.getText().toString();
        int firstNumber = Integer.parseInt(firstString);

        EditText secondNum = findViewById(R.id.secondNumber);
        String secondString = secondNum.getText().toString();
        int secondNumber = Integer.parseInt(secondString);

        int result = firstNumber + secondNumber;
        String resultStr = Integer.toString(result);

        goToActivity2(resultStr);
    }

    public void subtractFunction(View view) {
        EditText firstNum = findViewById(R.id.firstNumber);
        String firstString = firstNum.getText().toString();
        int firstNumber = Integer.parseInt(firstString);

        EditText secondNum = findViewById(R.id.secondNumber);
        String secondString = secondNum.getText().toString();
        int secondNumber = Integer.parseInt(secondString);

        int result = firstNumber - secondNumber;
        String resultStr = Integer.toString(result);

        goToActivity2(resultStr);
    }

    public void multiplyFunction(View view) {
        EditText firstNum = findViewById(R.id.firstNumber);
        String firstString = firstNum.getText().toString();
        int firstNumber = Integer.parseInt(firstString);

        EditText secondNum = findViewById(R.id.secondNumber);
        String secondString = secondNum.getText().toString();
        int secondNumber = Integer.parseInt(secondString);

        int result = firstNumber * secondNumber;
        String resultStr = Integer.toString(result);

        goToActivity2(resultStr);
    }

    public void divideFunction(View view) {

        EditText firstNum = findViewById(R.id.firstNumber);
        String firstString = firstNum.getText().toString();
        int firstNumber = Integer.parseInt(firstString);

        EditText secondNum = findViewById(R.id.secondNumber);
        String secondString = secondNum.getText().toString();
        int secondNumber = Integer.parseInt(secondString);

        int result = firstNumber / secondNumber;
        String resultStr = Integer.toString(result);

        goToActivity2(resultStr);
    }

    public void goToActivity2(String s) {
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("result", s);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}