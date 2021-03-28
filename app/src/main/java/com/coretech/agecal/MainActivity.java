package com.coretech.agecal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText edittext;
    TextView textView,textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button =findViewById(R.id.button);
        edittext=findViewById(R.id.editText);
        textView=findViewById(R.id.textView);
        textView2=findViewById(R.id.textView2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=edittext.getText().toString();
                int yr= Integer.parseInt(s);
                int age=2021-yr;
                textView2.setText("You are "+age+" Year Old.");
            }
        });
    }
}