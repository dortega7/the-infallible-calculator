package com.example.theinfalliblecalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonSin, buttonCos, buttonMult, button10, buttonC, buttonEqual, buttonExp, buttonPow;
    EditText textField;

    double valueOne;
    double valueTwo;

    boolean addition, subtract, multiplication, division, power;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        buttonAdd = (Button) findViewById(R.id.buttonadd);
        buttonSub = (Button) findViewById(R.id.buttonsub);
        buttonMult = (Button) findViewById(R.id.buttonmult);
        buttonDivision = (Button) findViewById(R.id.buttondiv);
        buttonSin = (Button) findViewById(R.id.buttonsin);
        buttonCos = (Button) findViewById(R.id.buttoncos);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonPow = (Button) findViewById(R.id.buttonpow);
        buttonExp = (Button) findViewById(R.id.buttonexp);
        buttonEqual = (Button) findViewById(R.id.buttoneql);
        textField = (EditText) findViewById(R.id.edt1);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textField.setText(textField.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textField.setText(textField.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textField.setText(textField.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textField.setText(textField.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textField.setText(textField.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textField.setText(textField.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textField.setText(textField.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textField.setText(textField.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textField.setText(textField.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textField.setText(textField.getText() + "0");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueOne = Double.parseDouble(textField.getText() + "");
                addition = true;
                textField.setText(null);
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueOne = Double.parseDouble(textField.getText() + "");
                subtract = true;
                textField.setText(null);
            }
        });

        buttonMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueOne = Double.parseDouble(textField.getText() + "");
                multiplication = true;
                textField.setText(null);
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueOne = Double.parseDouble(textField.getText() + "");
                division = true;
                textField.setText(null);
            }
        });

        buttonSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueOne = Double.parseDouble(textField.getText() + "");
                textField.setText(Math.sin(valueOne) + "");
            }
        });

        buttonCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueOne = Double.parseDouble(textField.getText() + "");
                textField.setText(Math.cos(valueOne) + "");
            }
        });

        buttonExp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueOne = Double.parseDouble(textField.getText() + "");
                textField.setText(Math.exp(valueOne) + "");
            }
        });

        buttonPow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueOne = Double.parseDouble(textField.getText() + "");
                textField.setText(null);
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueTwo = Double.parseDouble(textField.getText() + "");

                if (addition == true) {
                    textField.setText(valueOne + valueTwo + "");
                    addition = false;

                }

                if (subtract == true) {
                    textField.setText(valueOne - valueTwo + "");
                    subtract = false;
                }

                if (multiplication == true) {
                    textField.setText(valueOne * valueTwo + "");
                    multiplication = false;
                }

                if (division == true) {
                    textField.setText(valueOne / valueTwo + "");
                    division = false;
                }

                if(power == true) {
                    textField.setText(Math.pow(valueOne,valueTwo) + "");
                }
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textField.setText("");
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textField.setText(textField.getText() + ".");
            }
        });
    }
}