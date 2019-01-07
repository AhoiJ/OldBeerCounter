package com.example.beercounter;

import android.content.Intent;
import android.content.ContentValues;
import android.graphics.Shader;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.SharedPreferences;


public class SettingsActivity extends AppCompatActivity {

//    int mSmallBeerCount; // total amount of small beers
//   int mLargeBeerCount; // total amount of large beers
//    int mLongDrinkCount; // total amount of long drinks
//    int mSmallCiderCount; // total amount of small ciders
//   int mShotsCount; // total amount of shots


    String smallBeerPrice;
    String largeBeerPrice;
    String longDrinkPrice;
    String smallCiderPrice;
    String shotsPrice;

    EditText sBeerInput;
    EditText lBeerInput;
    EditText longDrinkInput;
    EditText smallCiderInput;
    EditText shotsInput;

    Button submitButton;
/*
    int mSmallBeerBarCount; // total amount of small beers in bar
    int mLargeBeerBarCount; // total amount of large beers in bar
    int mLongDrinkBarCount; // total amount of long drinks in bar
    int mSmallCiderBarCount; // total amount of small ciders in bar
    int mShotsBarCount; // total amount of shots in bar
*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        main();

    }

    void main(){

        SharedPreferences prices = getSharedPreferences("prices", 0);

        smallBeerPrice = prices.getString("smallBeer", smallBeerPrice);
        largeBeerPrice = prices.getString("largeBeer", largeBeerPrice);
        longDrinkPrice = prices.getString("longDrink", longDrinkPrice);
        smallCiderPrice = prices.getString("smallCider", smallCiderPrice);
        shotsPrice = prices.getString("shots", shotsPrice);

        displaySmallBeer(smallBeerPrice);
        displayLargeBeer(largeBeerPrice);
        displayLongDrink(longDrinkPrice);
        displaySmallCider(smallCiderPrice);
        displayShots(shotsPrice);

        sBeerInput = (EditText) findViewById(R.id.costSmallBeer);
        lBeerInput = (EditText) findViewById(R.id.costLargeBeer);
        longDrinkInput = (EditText) findViewById(R.id.costLongDrink);
        smallCiderInput = (EditText) findViewById(R.id.costSmallCider);
        shotsInput = (EditText) findViewById(R.id.costShots);


        submitButton = (Button) findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                smallBeerPrice = sBeerInput.getText().toString();
                largeBeerPrice = lBeerInput.getText().toString();
                longDrinkPrice = longDrinkInput.getText().toString();
                smallCiderPrice = smallCiderInput.getText().toString();
                shotsPrice = shotsInput.getText().toString();


                SharedPreferences prices = getSharedPreferences("prices", 0);
                SharedPreferences.Editor editor = prices.edit();
                editor.putString("smallBeer", smallBeerPrice);
                editor.putString("largeBeer", largeBeerPrice);
                editor.putString("longDrink", longDrinkPrice);
                editor.putString("smallCider", smallCiderPrice);
                editor.putString("shots", shotsPrice);
                editor.commit();

                displaySmallBeer(smallBeerPrice);
                displayLargeBeer(largeBeerPrice);
                displayLongDrink(longDrinkPrice);
                displaySmallCider(smallCiderPrice);
                displayShots(shotsPrice);

            }

        });

    }

    public void displaySmallBeer(String number) {

        TextView displayInteger = findViewById(
                R.id.costOfSbeer);

        displayInteger.setText("" + number +" €");
    }

    public void displayLargeBeer(String number) {

        TextView displayInteger = findViewById(
                R.id.costOfLbeer);

        displayInteger.setText("" + number +" €");
    }
    public void displayLongDrink(String number) {

        TextView displayInteger = findViewById(
                R.id.costOfLdrink);

        displayInteger.setText("" + number +" €");
    }
    public void displaySmallCider(String number) {

        TextView displayInteger = findViewById(
                R.id.costOfSciders);

        displayInteger.setText("" + number +" €");
    }
    public void displayShots(String number) {

        TextView displayInteger = findViewById(
                R.id.costOfShots);

        displayInteger.setText("" + number +" €");
    }

}