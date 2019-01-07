package com.example.beercounter;

import android.content.Intent;
import android.content.ContentValues;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;

import java.text.DecimalFormat;
import java.util.Locale;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.SharedPreferences;


public class StatsActivity extends AppCompatActivity {

    int mSmallBeerCount; // total amount of small beers
    int mLargeBeerCount; // total amount of large beers
    int mLongDrinkCount; // total amount of long drinks
    int mSmallCiderCount; // total amount of small ciders
    int mShotsCount; // total amount of shots

    String smallBeerPrice;
    String largeBeerPrice;
    String longDrinkPrice;
    String smallCiderPrice;
    String shotsPrice;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats);

        main();

    }


    void main(){

        SharedPreferences prices = getSharedPreferences("prices", 0);

        smallBeerPrice = prices.getString("smallBeer", smallBeerPrice);
        largeBeerPrice = prices.getString("largeBeer", largeBeerPrice);
        longDrinkPrice = prices.getString("longDrink", longDrinkPrice);
        smallCiderPrice = prices.getString("smallCider", smallCiderPrice);
        shotsPrice = prices.getString("shots", shotsPrice);

        smallBeerPrice = checkNull(smallBeerPrice);
        largeBeerPrice = checkNull(largeBeerPrice);
        longDrinkPrice = checkNull(longDrinkPrice);
        smallCiderPrice = checkNull(smallCiderPrice);
        shotsPrice = checkNull(shotsPrice);


        SharedPreferences settings = getSharedPreferences("myPrefsFile", 0);

        mSmallBeerCount = settings.getInt("smallBeers", mSmallBeerCount); // on startup get saved amount of small beers
        mLargeBeerCount = settings.getInt("largeBeers", mLargeBeerCount);
        mLongDrinkCount = settings.getInt("longDrinks", mLongDrinkCount);
        mSmallCiderCount = settings.getInt("smallCiders", mSmallCiderCount);
        mShotsCount = settings.getInt("shots", mShotsCount);


        Double hintasBeer = Double.parseDouble(smallBeerPrice);
        Double hintalBeer = Double.parseDouble(largeBeerPrice);
        Double hintaLongD = Double.parseDouble(longDrinkPrice);
        Double hintaScider = Double.parseDouble(smallCiderPrice);
        Double hintaShots = Double.parseDouble(shotsPrice);

        priceCounter(hintasBeer, mSmallBeerCount);
        priceCounter2(hintalBeer, mLargeBeerCount);
        priceCounter3(hintaLongD, mLongDrinkCount);
        priceCounter4(hintaScider, mSmallCiderCount);
        priceCounter5(hintaShots, mShotsCount);

    }

    public String checkNull (String test){
        if (TextUtils.isEmpty(test)){
            test = "0";
            return test;
        }else{
            return test;
        }
    }

    public void priceCounter(double i, int u){

        double cost = i*u;
        String test;

        test = String.format(Locale.CANADA,"%.2f", cost);

        TextView displayInteger = findViewById(
                R.id.beerSmall_cost);
        displayInteger.setText("" + test +" €");

    }

    public void priceCounter2(double i, int u){

        double cost = i*u;
        String test;

        test = String.format(Locale.CANADA,"%.2f", cost);

        TextView displayInteger = findViewById(
                R.id.beerLarge_cost);

        displayInteger.setText("" + test +" €");

    }

    public void priceCounter3(double i, int u){

        double cost = i*u;
        String test;

        test = String.format(Locale.CANADA,"%.2f", cost);

        TextView displayInteger = findViewById(
                R.id.longDrink_cost);

        displayInteger.setText("" + test +" €");

    }

    public void priceCounter4(double i, int u){

        double cost = i*u;
        String test;

        test = String.format(Locale.CANADA,"%.2f", cost);

        TextView displayInteger = findViewById(
                R.id.smallCider_cost);

        displayInteger.setText("" + test +" €");

    }

    public void priceCounter5(double i, int u){

        double cost = i*u;
        String test;

        test = String.format(Locale.CANADA,"%.2f", cost);

        TextView displayInteger = findViewById(
                R.id.shots_cost);

        displayInteger.setText("" + test +" €");

    }


}