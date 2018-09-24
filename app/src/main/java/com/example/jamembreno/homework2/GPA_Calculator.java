package com.example.jamembreno.homework2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;

public class GPA_Calculator extends AppCompatActivity {

    //mTv1 connects to the text "5 Classes"
    TextView mTv1;
    //mTv4 will show after the user clicks the "compute GPA" button
    TextView mTv4;
    //The EditText is where the user will input the credit and grade that they got for the semester
    EditText mEt1, mEt2, mEt3, mEt4, mEt5, mEt6, mEt7, mEt8, mEt9, mEt10;
    //For the "Compute GPA" button
    Button submit;
    //Clear all text
    Button clear;
    //Allows the background to change colors
    ScrollView backgroundColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpa__calculator);
        mTv1 = findViewById(R.id.tv1);
        mTv4 = findViewById(R.id.tv4);
        mEt1 = findViewById(R.id.ed1);
        mEt2 = findViewById(R.id.ed2);
        mEt3 = findViewById(R.id.ed3);
        mEt4 = findViewById(R.id.ed4);
        mEt5 = findViewById(R.id.ed5);
        mEt6 = findViewById(R.id.ed6);
        mEt7 = findViewById(R.id.ed7);
        mEt8 = findViewById(R.id.ed8);
        mEt9 = findViewById(R.id.ed9);
        mEt10 = findViewById(R.id.ed10);
        backgroundColor = findViewById(R.id.scrollView1);
        submit = findViewById(R.id.btn_submit);
        clear = findViewById(R.id.clear);


        submit.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                //Below until the last else if statement, if a user forgets to put a credit or grade
                //The program will tell the user to try again
                //Program will only run when there is no empty fields
                if (mEt1.length() == 0) {
                    mEt1.setError("Try Again");
                } else if (mEt2.length() == 0) {
                    mEt2.setError("Try Again");
                } else if (mEt3.length() == 0) {
                    mEt3.setError("Try Again");
                } else if (mEt4.length() == 0) {
                    mEt4.setError("Try Again");
                } else if (mEt5.length() == 0) {
                    mEt5.setError("Try Again");
                } else if (mEt6.length() == 0) {
                    mEt6.setError("Try Again");
                } else if (mEt7.length() == 0) {
                    mEt7.setError("Try Again");
                } else if (mEt8.length() == 0) {
                    mEt8.setError("Try Again");
                } else if (mEt9.length() == 0) {
                    mEt9.setError("Try Again");
                } else if (mEt10.length() == 0) {
                    mEt10.setError("Try Again");
                }

                //Once user inserts all the numbers
                //The program will begin to the math to get the gpa
                //The formula to find the gpa is: (credit*grade)/credits = gpa
                else {
                    int credit1 = new Integer(mEt1.getText().toString());
                    int credit2 = new Integer(mEt2.getText().toString());
                    int credit3 = new Integer(mEt3.getText().toString());
                    int credit4 = new Integer(mEt4.getText().toString());
                    int credit5 = new Integer(mEt5.getText().toString());
                    int grade1 = new Integer(mEt6.getText().toString());
                    int grade2 = new Integer(mEt7.getText().toString());
                    int grade3 = new Integer(mEt8.getText().toString());
                    int grade4 = new Integer(mEt9.getText().toString());
                    int grade5 = new Integer(mEt10.getText().toString());
                    int sum1 = (credit1 * grade1); //Perform Maths operation
                    int sum2 = (credit2 * grade2); //Perform Maths operation
                    int sum3 = (credit3 * grade3); //Perform Maths operation
                    int sum4 = (credit4 * grade4); //Perform Maths operation
                    int sum5 = (credit5 * grade5); //Perform Maths operation
                    int creditTotal = credit1 + credit2 + credit3 + credit4 + credit5;
                    //Final answer for the total of the user's GPA
                    int finalGPA = (sum1 + sum2 + sum3 + sum4 + sum5) / creditTotal;

                    //Finally, depending what the gpa of the user is, the background will change colors
                    mTv4.setText("" + finalGPA);//print answer
                    if (finalGPA >= 80) {
                        backgroundColor.setBackgroundColor(Color.GREEN);
                    } else if (finalGPA >= 61 && finalGPA <= 79) {
                        backgroundColor.setBackgroundColor(Color.YELLOW);
                    } else
                        backgroundColor.setBackgroundColor(Color.RED);
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                mEt1.setText("");
                mEt2.setText("");
                mEt3.setText("");
                mEt4.setText("");
                mEt5.setText("");
                mEt6.setText("");
                mEt7.setText("");
                mEt8.setText("");
                mEt9.setText("");
                mEt10.setText("");
            }

        });
    }
}