package com.example.npatel.calculator;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dis = (EditText) findViewById(R.id.ed);
        dis1 = (EditText) findViewById(R.id.ed1);
        dis.setShowSoftInputOnFocus(false);
    }

    EditText dis;
    EditText dis1;

    public void one(View view) {
        dis.setText(dis.getText() + String.valueOf(1));
    }

    public void two(View view) {
        dis.setText(dis.getText() + String.valueOf(2));
    }

    public void three(View view) {
        dis.setText(dis.getText() + String.valueOf(3));

    }

    public void four(View view) {
        dis.setText(dis.getText() + String.valueOf(4));
    }

    public void five(View view) {
        dis.setText(dis.getText() + String.valueOf(5));
    }

    public void six(View view) {
        dis.setText(dis.getText() + String.valueOf(6));
    }

    public void seven(View view) {
        dis.setText(dis.getText() + String.valueOf(7));
    }

    public void eight(View view) {
        dis.setText(dis.getText() + String.valueOf(8));
    }

    public void nine(View view) {
        dis.setText(dis.getText() + String.valueOf(9));
    }

    public void plus(View view) {

        String val = dis.getText().toString();
        String val2 = dis1.getText().toString();
        if (val.length()==1)
        {
            if(val=="+" || val=="/" ||val=="-" ||val=="/"  )
            {
                dis.setText(String.valueOf("+"));
            }
        }
        else if(val.length()==0)
        {

        }
        else if (val2.equals("")) {
            dis1.setText(val);
            dis.setText("+");
        }
        else{
            char op = val.charAt(0);


            String sval = val.substring(1, val.length());

            int num1 = Integer.parseInt(val2);
            int num2 = Integer.parseInt(sval);
            calc(view, num1, num2, op);

        }



                dis.setText(String.valueOf("+"));


    }

    public void minus(View view) {
        String val = dis.getText().toString();
        String val2 = dis1.getText().toString();

        if (val.length()==1)
        {
            if(val=="+" || val=="/" ||val=="-" ||val=="/"  )
            {
                dis.setText(String.valueOf("-"));
            }
        }
        else if(val.length()==0)
        {

        }
        else if (val2.equals("")) {
            dis1.setText(val);
            dis.setText("-");
        }
        else {
            char op = val.charAt(0);


            String sval = val.substring(1, val.length());

            int num1 = Integer.parseInt(val2);
            int num2 = Integer.parseInt(sval);
            calc(view, num1, num2, op);

        }





                dis.setText(String.valueOf("-"));


    }

    public void multiplication(View view) {
        String val = dis.getText().toString();
        String val2 = dis1.getText().toString();
        if (val.length()==1)
        {
            if(val=="+" || val=="/" ||val=="-" ||val=="/"  )
            {
                dis.setText(String.valueOf("*"));
            }
        }
        else if(val.length()==0)
        {

        }
        else if (val2.equals("")) {
            dis1.setText(val);
            dis.setText("*");
        }
        else{
            char op = val.charAt(0);


            String sval = val.substring(1, val.length());

            int num1 = Integer.parseInt(val2);
            int num2 = Integer.parseInt(sval);
            calc(view, num1, num2, op);

        }




        dis.setText(String.valueOf("*"));


    }

    public void division(View view) {
        String val = dis.getText().toString();
        String val2 = dis1.getText().toString();
        if (val.length()==1)
        {
            if(val=="+" || val=="/" ||val=="-" ||val=="/"  )
            {
                dis.setText(String.valueOf("/"));
            }
        }
        else if(val.length()==0)
        {

        }
        else if (val2.equals("")) {
            dis1.setText(val);
            dis.setText("/");
        }
        else{
            char op = val.charAt(0);


            String sval = val.substring(1, val.length());

            int num1 = Integer.parseInt(val2);
            int num2 = Integer.parseInt(sval);
            calc(view, num1, num2, op);

        }



        dis.setText(String.valueOf("/"));



    }

    public void clear(View view) {
        dis.setText(null);
        dis1.setText(null);
    }
    public void clear_one(View view) {

        String val = dis.getText().toString();
        if(val.length()<=2) {
            dis.setText(val.substring(0, val.length() - 1));
        }
    }
    public void zero(View view)
    {
        String val = dis.getText().toString();

            dis.setText(val+String.valueOf(0));

    }

    public void equal(View view) {

        String val = dis.getText().toString();
        String val2 = dis1.getText().toString();

        if (val.length()==1)
        {
            if(val=="+" || val=="/" ||val=="-" ||val=="/"  )
            {
                dis.setText(String.valueOf(""));
            }
        }
        else if(val.length()==0)
        {

        }
        else if (val2.equals("")) {

        }
        else {
            char op = val.charAt(0);


            String sval = val.substring(1, val.length());

            int num1 = Integer.parseInt(val2);
            int num2 = Integer.parseInt(sval);
            calc(view, num1, num2, op);

        }

        dis.setText(String.valueOf(""));
    }

    public void calc(View view, int num1, int num2, char op) {
        int ans = 0;
        String sans;

        if (op == '+') {
            ans = num1 + num2;

        }
        if (op == '-') {
            ans = num1 - num2;

        }
        if (op == '*') {
            ans = num1 * num2;
        }
        if (op == '/') {
            ans = num1 / num2;
                    }
          dis1.setText(String.valueOf(ans));

    }
    public void dot(View v)
    {

    }
}
