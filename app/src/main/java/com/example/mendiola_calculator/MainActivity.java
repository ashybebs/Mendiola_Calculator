package com.example.mendiola_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnPlus, btnMinus, btnMultiply, btnDivide, btnModulo;
    Double variable_one, variable_two;
    TextView Result;
    EditText rcv1, rcv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPlus = findViewById(R.id.buttonPlus);
        btnMinus = findViewById(R.id.buttonMinus);
        btnMultiply = findViewById(R.id.buttonMultiply);
        btnDivide = findViewById(R.id.buttonDivide);
        btnModulo = findViewById(R.id.buttonModulo);
        Result = findViewById(R.id.result);
        rcv1 = findViewById(R.id.blankOne);
        rcv2 = findViewById(R.id.blankTwo);

        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnModulo.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        variable_one = Double.parseDouble(rcv1.getText().toString());
        variable_two = Double.parseDouble(rcv2.getText().toString());

        switch (view.getId()){
            case R.id.buttonPlus:
                Result.setText(String.valueOf(add(variable_one,variable_two)));
                break;
            case R.id.buttonMinus:
                Result.setText(String.valueOf(minus(variable_one,variable_two)));
                break;
            case R.id.buttonMultiply:
                Result.setText(String.valueOf(times(variable_one,variable_two)));
                break;
            case R.id.buttonDivide:
                Result.setText(String.valueOf(divide(variable_one,variable_two)));
                break;
            case R.id.buttonModulo:
                Result.setText(String.valueOf(modulo(variable_one,variable_two)));
                break;
        }
    }

    private Double modulo(Double variable_one, Double variable_two) {
        double answer;
        answer = variable_one % variable_two;
        return answer;
    }

    private Double divide(Double variable_one, Double variable_two) {
        double answer;
        answer = variable_one / variable_two;
        return answer;
    }

    private Double times(Double variable_one, Double variable_two) {
        double answer;
        answer = variable_one * variable_two;
        return answer;
    }

    private Double minus(Double variable_one, Double variable_two) {
        double answer;
        answer = variable_one - variable_two;
        return answer;
    }

    private Double add(Double variable_one, Double variable_two) {
        double answer;
        answer = variable_one + variable_two;
        return answer;
    }
}