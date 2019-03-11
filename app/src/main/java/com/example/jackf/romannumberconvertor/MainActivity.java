package com.example.jackf.romannumberconvertor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b_convertToRoman, b_convertToNumber;
    EditText et_number, et_romanInput;
    TextView tv_romanOutput, tv_numberOutput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b_convertToNumber = (Button) findViewById(R.id.b_convertToNumber);
        b_convertToRoman = (Button) findViewById(R.id.b_convertToRoman);
        et_number = (EditText) findViewById(R.id.et_number);
        et_romanInput = (EditText) findViewById(R.id.et_romanInput);
        tv_romanOutput = (TextView) findViewById(R.id.tv_romanOutput);
        tv_numberOutput = (TextView) findViewById(R.id.tv_numberOutput);

        b_convertToRoman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //we need to convert a number to a numeral
                NumberConvertor nc = new NumberConvertor();

                int theNumber; // the input from user
                String theRoman;  // string to send back to user

                theNumber = Integer.parseInt(et_number.getText().toString());
                theRoman = nc.toRoman(theNumber);

                tv_romanOutput.setText(theRoman);
            }
        });

        b_convertToNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //we need to convert a number to a numeral
                NumberConvertor nc = new NumberConvertor();

                String theNumeral; // the input from user
                String theNumber;  // string to send back to user

                theNumeral = et_romanInput.getText().toString().toUpperCase();
                theNumber = Integer.toString(nc.toNumber(theNumeral));

                tv_numberOutput.setText(theNumber);

            }
        });

    }
}
