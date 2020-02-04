package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.view.Menu;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView Display=null;
    boolean dotexists=false;
    float num1=0.0f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Display=(TextView) findViewById(R.id.edis);



    }

    public void Numberfield(View view) {

        Button clicked=(Button)view;
        Display.append(clicked.getText());

    }

    public void Reset(View view) {
        Display.setText("");
        dotexists=false;
    }

    public void dotfn(View view) {

        if(dotexists==false)
        {
            if(Display.getText().length()==0)Display.append("0");
            Display.append(".");
            dotexists=true;
        }

    }

    public void operatorclick(View view) {

        num1=Float.parseFloat(Display.getText().toString());
        Display.setHint(Display.getText().toString());
        Display.setText(null);
    }
}
