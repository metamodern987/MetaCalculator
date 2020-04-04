package com.dia.igor.metacalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.dia.igor.metacalculator.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onButtonClick (View v) {

        EditText num1 = (EditText)findViewById(R.id.num1);
        EditText num2 = (EditText)findViewById(R.id.num2);

        TextView ResText = (TextView)findViewById(R.id.Result);


         double el1 = Double.parseDouble(num1.getText().toString());
         double el2 = Double.parseDouble(num2.getText().toString());
         double ResSum = el1 + el2;
         ResText.setText(Double.toString(ResSum));





    }
    public void onButton (View v) {

        EditText num1 = (EditText)findViewById(R.id.num1);
        EditText num2 = (EditText)findViewById(R.id.num2);

        TextView ResText = (TextView)findViewById(R.id.Result);


         double el1 = Double.parseDouble(num1.getText().toString());
         double el2 = Double.parseDouble(num2.getText().toString());
         double ResSu = el1 - el2;
        ResText.setText(Double.toString(ResSu));

    }

    public void onButton2 (View v) {

        EditText num1 = (EditText)findViewById(R.id.num1);
        EditText num2 = (EditText)findViewById(R.id.num2);

        TextView ResText = (TextView)findViewById(R.id.Result);


        double el1 = Double.parseDouble(num1.getText().toString());
        double el2 = Double.parseDouble(num2.getText().toString());
        double ResSu = el1 * el2;
        ResText.setText(Double.toString(ResSu));

    }

    public void onButton3 (View v) {

        EditText num1 = (EditText)findViewById(R.id.num1);
        EditText num2 = (EditText)findViewById(R.id.num2);

        TextView ResText = (TextView)findViewById(R.id.Result);


        double el1 = Double.parseDouble(num1.getText().toString());
        double el2 = Double.parseDouble(num2.getText().toString());

              if (el2 == 0) {
                  double ResSu = el1 + 0;
                  ResText.setText(Double.toString(ResSu));
              }
              else {
                  double ResSu = el1 / el2;
                  ResText.setText(Double.toString(ResSu));
              }
        double ResSu = el1 / el2;
        ResText.setText(Double.toString(ResSu));

    }

}
