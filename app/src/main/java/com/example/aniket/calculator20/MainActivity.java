package com.example.aniket.calculator20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button zero;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button dot;
    private Button equal;
    private Button devide;
    private Button multiply;
    private Button subtract;
    private Button add;
    private Button del;
    private TextView expr;
    private TextView res;
    private float val1 = Float.NaN;
    private float val2;
    private char ACTION;
    private final char ADDITION = '+';
    private final char SUBTRACTION = '-';
    private final char MULTIPLICATION = '*';
    private final char DIVISION = '/';
    private final char EQUALS = '0';

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // initialising the buttons and their properties
        initialise();

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expr.setText(expr.getText().toString() + "0");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expr.setText(expr.getText().toString() + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expr.setText(expr.getText().toString() + "2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expr.setText(expr.getText().toString() + "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expr.setText(expr.getText().toString() + "4");
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText("hey you clicked result.");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expr.setText(expr.getText().toString() + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expr.setText(expr.getText().toString() + "6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expr.setText(expr.getText().toString() + "7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expr.setText(expr.getText().toString() + "8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expr.setText(expr.getText().toString() + "9");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expr.setText(expr.getText().toString() + "+");
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expr.setText(expr.getText().toString() + "-");
            }
        });

        devide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expr.setText(expr.getText().toString() + "/");
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expr.setText(expr.getText().toString() + "*");
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expr.setText(expr.getText().toString() + ".");
            }
        });

        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    expr.setText(expr.getText().toString().subSequence(0, expr.getText().toString().length() - 1));
                } catch (Exception e) {
                    //res.setText("" + e);
                }

            }
        });

        /*equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val1 =
            }
        });*/

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION = ADDITION;
                res.setText(String.valueOf(val1) + "+");
                expr.setText(null);
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION = SUBTRACTION;
                res.setText(String.valueOf(val1) + "-");
                expr.setText(null);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION = MULTIPLICATION;
                res.setText(String.valueOf(val1) + "*");
                expr.setText(null);
            }
        });

        devide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION = DIVISION;
                res.setText(String.valueOf(val1) + "/");
                expr.setText(null);
            }
        });

        del.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                expr.setText('0');
                res.setText('0');
                return true;
            }
        });

        /*equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION = EQUALS;
                res.setText((res.getText().toString() + String.valueOf(val2) + ));
            }
        });*/
    }

    private void initialise(){
        zero = (Button)findViewById(R.id.btn0);
        one = (Button)findViewById(R.id.btn1);
        two = (Button)findViewById(R.id.btn2);
        three = (Button)findViewById(R.id.btn3);
        four = (Button)findViewById(R.id.btn4);
        five = (Button)findViewById(R.id.btn5);
        six = (Button)findViewById(R.id.btn6);
        seven = (Button)findViewById(R.id.btn7);
        eight = (Button)findViewById(R.id.btn8);
        nine = (Button)findViewById(R.id.btn9);
        dot = (Button)findViewById(R.id.btnDecimal);
        equal = (Button)findViewById(R.id.btnEqual);
        devide = (Button)findViewById(R.id.btnDevide);
        multiply = (Button)findViewById(R.id.btnMultiply);
        add = (Button)findViewById(R.id.btnAdd);
        subtract = (Button)findViewById(R.id.btnSubtract);
        del = (Button)findViewById(R.id.btnDel);
        expr = (TextView)findViewById(R.id.Expression);
        res = (TextView)findViewById(R.id.Result);
        equal = (Button)findViewById(R.id.btnEqual);
    }

    private void compute(){
        if(!Float.isNaN(val1)){
            val2 = Float.parseFloat(expr.getText().toString());

            switch(ACTION){
                case ADDITION:
                    val1 = val1 + val2;
                    break;
                case SUBTRACTION:
                    val1 = val1 - val2;
                    break;
                case MULTIPLICATION:
                    val1 = val1 * val2;
                    break;
                case DIVISION:
                    val1 = val1 / val2;
                    break;
                case EQUALS:
                    break;
            }
        }else{
            val1 = Float.parseFloat(expr.getText().toString());
        }
    }
}

