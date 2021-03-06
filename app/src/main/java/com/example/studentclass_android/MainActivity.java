package com.example.studentclass_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //버튼 정의
    Button addBtn;
    Button minusBtn;
    Button multiplicationBtn;
    Button divisionBtn;

    //텍스트뷰 정의
    TextView resultValue;

    //Edit텍스트 정의
    EditText firstValue;
    EditText secondValue;

    //계산을 하기위해 edittext의 값을 저장시킬 변수
    public float firstEditValue;
    public float secondEditValue;

    public Calculator calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //xml의 버튼과 액티비티 연결
        addBtn = findViewById(R.id.add_btn);
        minusBtn = findViewById(R.id.minus_btn);
        multiplicationBtn = findViewById(R.id.multiplication_btn);
        divisionBtn = findViewById(R.id.division_btn);

        //xml의 텍스트뷰와 액티비티 연결
        resultValue = findViewById(R.id.result_value);

        //xml의 Edit텍스트와 액티비티 연결
        firstValue = findViewById(R.id.first_value);
        secondValue = findViewById(R.id.second_value);

        calculator = new Calculator();

        //버튼 클릭이벤트
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(TextUtils.isEmpty(firstValue.getText()) || TextUtils.isEmpty(secondValue.getText())) {
                    Toast.makeText(getApplicationContext(), "아무 값도 입력 되지 않았습니다.", Toast.LENGTH_LONG).show();
                }else {
                    //Edit텍스트값 가져오기
                    firstEditValue = Float.parseFloat(firstValue.getText().toString());
                    secondEditValue = Float.parseFloat(secondValue.getText().toString());
                    //result_value.setText(""+(edit1_value+edit2_value));
                    resultValue.setText(Float.toString(calculator.add(firstEditValue, secondEditValue)));
                    Toast.makeText(getApplicationContext(), "덧셈", Toast.LENGTH_LONG).show();
                }
            }
        });

        minusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(TextUtils.isEmpty(firstValue.getText()) || TextUtils.isEmpty(secondValue.getText())) {
                    Toast.makeText(getApplicationContext(), "아무 값도 입력 되지 않았습니다.", Toast.LENGTH_LONG).show();
                }else{
                    firstEditValue = Float.parseFloat(firstValue.getText().toString());
                    secondEditValue = Float.parseFloat(secondValue.getText().toString());
                    //result_value.setText(""+(edit1_value+edit2_value));
                    Toast.makeText(getApplicationContext(), "뺄셈", Toast.LENGTH_LONG).show();
                    resultValue.setText(Float.toString(calculator.miuns(firstEditValue, secondEditValue)));
                }
            }
        });

        multiplicationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(TextUtils.isEmpty(firstValue.getText()) || TextUtils.isEmpty(secondValue.getText())) {
                    Toast.makeText(getApplicationContext(), "아무 값도 입력 되지 않았습니다.", Toast.LENGTH_LONG).show();
                }else{
                    firstEditValue = Float.parseFloat(firstValue.getText().toString());
                    secondEditValue = Float.parseFloat(secondValue.getText().toString());
                    //result_value.setText(""+(edit1_value+edit2_value));
                    Toast.makeText(getApplicationContext(), "곱셈", Toast.LENGTH_LONG).show();
                    resultValue.setText(Float.toString(calculator.multiplication(firstEditValue, secondEditValue)));
                }
            }
        });

        divisionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(TextUtils.isEmpty(firstValue.getText()) || TextUtils.isEmpty(secondValue.getText())) {
                    Toast.makeText(getApplicationContext(), "아무 값도 입력 되지 않았습니다.", Toast.LENGTH_LONG).show();
                }else{
                    firstEditValue = Float.parseFloat(firstValue.getText().toString());
                    secondEditValue = Float.parseFloat(secondValue.getText().toString());
                    //result_value.setText(""+(edit1_value+edit2_value));
                    Toast.makeText(getApplicationContext(), "나눗셈", Toast.LENGTH_LONG).show();
                    resultValue.setText(Float.toString(calculator.division(firstEditValue, secondEditValue)));
                }
            }
        });
    }
}