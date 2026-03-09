package com.example.thedemo;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText input1;
    private EditText input2;
    private Button btnAdd;
    private Button btnMinus;
    private Button btnMul;
    private Button btnDiv;
    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        input1 = findViewById(R.id.inputFirstNumber);
        input2 = findViewById(R.id.inputSecondNumber);
        btnAdd = findViewById(R.id.buttonAdd);
        btnMinus = findViewById(R.id.buttonMinus);
        btnMul = findViewById(R.id.buttonMul);
        btnDiv = findViewById(R.id.buttonDiv);
        txtResult = findViewById(R.id.result);

        btnAdd.setOnClickListener(v -> {
            if (input1.getText().toString().isEmpty() || input2.getText().toString().isEmpty()) {
                txtResult.setText("Please enter numbers");
            } else {
                float num1 = Float.parseFloat(input1.getText().toString());
                float num2 = Float.parseFloat(input2.getText().toString());
                float result = num1 + num2;
                txtResult.setText(String.valueOf(result));
            }
        });

        btnMinus.setOnClickListener(v -> {
            if (input1.getText().toString().isEmpty() || input2.getText().toString().isEmpty()) {
                txtResult.setText("Please enter numbers");
            } else {
                float num1 = Float.parseFloat(input1.getText().toString());
                float num2 = Float.parseFloat(input2.getText().toString());
                float result = num1 - num2;
                txtResult.setText(String.valueOf(result));
            }
        });

        btnMul.setOnClickListener(v -> {
            if (input1.getText().toString().isEmpty() || input2.getText().toString().isEmpty()) {
                txtResult.setText("Please enter numbers");
            } else {
                float num1 = Float.parseFloat(input1.getText().toString());
                float num2 = Float.parseFloat(input2.getText().toString());
                float result = num1 * num2;
                txtResult.setText(String.valueOf(result));
            }


        });

        btnDiv.setOnClickListener(v -> {
            if (input1.getText().toString().isEmpty() || input2.getText().toString().isEmpty()) {
                txtResult.setText("Please enter numbers");
            } else {
                float num1 = Float.parseFloat(input1.getText().toString());
                float num2 = Float.parseFloat(input2.getText().toString());
                if (num2 != 0) {
                    float result = num1 / num2;
                    txtResult.setText(String.valueOf(result));
                } else {
                    txtResult.setText("Cannot divide by 0");
                }
            }
        });
    }
}