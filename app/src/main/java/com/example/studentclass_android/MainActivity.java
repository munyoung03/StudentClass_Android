package com.example.studentclass_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //버튼 정의
    Button add_btn;
    Button minus_btn;
    Button multiplication_btn;
    Button division_btn;

    //텍스트뷰 정의
    TextView result_value;

    //Edit텍스트 정의
    EditText first_value;
    EditText second_value;

    //계산을 하기위해 edittext의 값을 int형으로 저장시킬 변수
    private float edit1_value;
    private float edit2_value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //xml의 버튼과 액티비티 연결
        add_btn = findViewById(R.id.add_btn);
        minus_btn = findViewById(R.id.minus_btn);
        multiplication_btn = findViewById(R.id.multiplication_btn);
        division_btn = findViewById(R.id.division_btn);

        //xml의 텍스트뷰와 액티비티 연결
        result_value = findViewById(R.id.result_value);

        //xml의 Edit텍스트와 액티비티 연결
        first_value = findViewById(R.id.first_value);
        second_value = findViewById(R.id.second_value);

        //버튼 클릭이벤트
        add_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Edit텍스트값 가져오기)
                edit1_value = Float.parseFloat(first_value.getText().toString());
                edit2_value = Float.parseFloat(second_value.getText().toString());
                //result_value.setText(""+(edit1_value+edit2_value));
                result_value.setText(Float.toString(edit1_value+edit2_value));
            }
        });

        minus_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1_value = Float.parseFloat(first_value.getText().toString());
                edit2_value = Float.parseFloat(second_value.getText().toString());
                //result_value.setText(""+(edit1_value-edit2_value));
                result_value.setText(Float.toString(edit1_value-edit2_value));
            }
        });

        multiplication_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1_value = Float.parseFloat(first_value.getText().toString());
                edit2_value = Float.parseFloat(second_value.getText().toString());
                //result_value.setText(""+(edit1_value*edit2_value));
                result_value.setText(Float.toString(edit1_value*edit2_value));
            }
        });

        division_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1_value = Float.parseFloat(first_value.getText().toString());
                edit2_value = Float.parseFloat(second_value.getText().toString());
                //result_value.setText(""+(edit1_value/edit2_value));
                result_value.setText(Float.toString(edit1_value/edit2_value));
            }
        });
    }
}