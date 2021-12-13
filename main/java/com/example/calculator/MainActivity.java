package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ImageButton button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul, button10, buttonC, buttonEqual, buttonAC;
    EditText numbers;
    float ValueOne, ValueTwo;
    boolean Addition, Subtract, Multiplication, Division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
        button10 = findViewById(R.id.button10);
        buttonAdd = findViewById(R.id.buttonadd);
        buttonSub = findViewById(R.id.buttonsub);
        buttonMul = findViewById(R.id.buttonmul);
        buttonDivision = findViewById(R.id.buttondiv);
        buttonC = findViewById(R.id.buttonC);
        buttonEqual = findViewById(R.id.buttoneql);
        numbers= findViewById(R.id.numbers);
        buttonAC= findViewById(R.id.buttonAC);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers.setText(numbers.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers.setText(numbers.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers.setText(numbers.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers.setText(numbers.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers.setText(numbers.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers.setText(numbers.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers.setText(numbers.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers.setText(numbers.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers.setText(numbers.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers.setText(numbers.getText() + "0");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (numbers == null) {
                        numbers.setText("");
                    } else {
                        ValueOne = Float.parseFloat(numbers.getText() + "");
                        Addition = true;
                        numbers.setText(null);
                    }
                }
            });

        buttonSub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ValueOne = Float.parseFloat(numbers.getText() + "");
                    Subtract = true;
                    numbers.setText(null);
                }
            });

        buttonMul.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ValueOne = Float.parseFloat(numbers.getText() + "");
                    Multiplication = true;
                    numbers.setText(null);
                }
            });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ValueOne = Float.parseFloat(numbers.getText() + "");
                    Division = true;
                    numbers.setText(null);
                }
            });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ValueTwo = Float.parseFloat(numbers.getText() + "");

                    if (Addition == true) {
                        numbers.setText(ValueOne + ValueTwo + "");
                        Addition = false;
                    }

                    if (Subtract == true) {
                        numbers.setText(ValueOne - ValueTwo + "");
                        Subtract = false;
                    }

                    if (Multiplication == true) {
                        numbers.setText(ValueOne * ValueTwo + "");
                        Multiplication = false;
                    }

                    if (Division == true) {
                        numbers.setText(ValueOne / ValueTwo + "");
                        Division = false;
                    }
                }
            });

        buttonAC.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    numbers.setText("");
                }
            });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = numbers.getText().toString();
                if(str.length() >= 1) {
                    str = str.substring(0, str.length() - 1);
                    numbers.setText(str);
                } else if (str.length() <= 1) {
                    numbers.setText("0");
                }
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    numbers.setText(numbers.getText() + ".");
                }
            });

    }
}