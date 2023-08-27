package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.renderscript.Sampler;
import android.util.Log;
import android.view.ContextMenu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Script;
import org.mozilla.javascript.Scriptable;


public class MainActivity extends AppCompatActivity {

    TextView input;
    TextView output;
    Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9;
    Button button_add,button_mul,button_sub,button_div;
    Button button_cl,button_eq;
    String data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = findViewById(R.id.input);
        output = findViewById(R.id.output);

         button0 = findViewById(R.id.button0);
         button1 = findViewById(R.id.button1);
         button2 = findViewById(R.id.button2);
         button3 = findViewById(R.id.button3);
         button4 = findViewById(R.id.button4);
         button5 = findViewById(R.id.button5);
         button6 = findViewById(R.id.button6);
         button7 = findViewById(R.id.button7);
         button8 = findViewById(R.id.button8);
         button9 = findViewById(R.id.button9);

         button_add = findViewById(R.id.button_add);
         button_mul = findViewById(R.id.button_mul);
         button_sub = findViewById(R.id.button_sub);
         button_div = findViewById(R.id.button_div);

         button_cl = findViewById(R.id.button_cl);
         button_eq = findViewById(R.id.button_eq);


        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data =input.getText().toString();
                input.setText(data+"0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=input.getText().toString();
                input.setText(data+"1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data =input.getText().toString();
                input.setText(data+"2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data =input.getText().toString();
                input.setText(data+"3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data =input.getText().toString();
                input.setText(data+"4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data =input.getText().toString();
                input.setText(data+"5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data =input.getText().toString();
                input.setText(data+"6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data =input.getText().toString();
                input.setText(data+"7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data =input.getText().toString();
                input.setText(data+"8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data =input.getText().toString();
                input.setText(data+"9");
            }
        });

        button_cl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               input.setText("");
               output.setText("");
            }
        });

        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data =input.getText().toString();
                input.setText(data+"+");
            }

        });

        button_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data =input.getText().toString();
                input.setText(data+"x");
            }
        });

        button_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data =input.getText().toString();
                input.setText(data+"-");
            }
        });

        button_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data =input.getText().toString();
                input.setText(data+"/");

            }
        });

        button_eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data =input.getText().toString();
                data=data.replaceAll("x","*");

                Context rhino = Context.enter();
                rhino.setOptimizationLevel(-1);


                String finalResult = "";
                Scriptable scriptable = rhino.initStandardObjects();
                finalResult=rhino.evaluateString(scriptable,data,"javascript",1,null).toString();
                output.setText(finalResult);





            }

        });

        }

    }