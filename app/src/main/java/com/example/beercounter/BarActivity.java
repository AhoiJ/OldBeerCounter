
package com.example.beercounter;

import android.content.ContentValues;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.SharedPreferences;

import com.example.beercounter.R;

import java.io.File;

public class BarActivity extends AppCompatActivity {

    int mSmallBeerBarCount; // total amount of small beers
    int mLargeBeerBarCount; // total amount of large beers
    int mLongDrinkBarCount; // total amount of long drinks
    int mSmallCiderBarCount; // total amount of small ciders
    int mShotsBarCount; // total amount of shots

    // public static final String PREFS_NAME = "myPrefsFile";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar);

        main();

    }

    void main()
    {
        SharedPreferences settingsBar = getSharedPreferences("myPrefsFile", 0);

        mSmallBeerBarCount = settingsBar.getInt("smallBeersBar", mSmallBeerBarCount); // on startup get saved amount of small beers
        mLargeBeerBarCount = settingsBar.getInt("largeBeersBar", mLargeBeerBarCount); // on startup get saved amount of large beers
        mLongDrinkBarCount = settingsBar.getInt("longDrinksBar", mLongDrinkBarCount); // on startup get saved amount of long drinks
        mSmallCiderBarCount = settingsBar.getInt("smallCidersBar", mSmallCiderBarCount); // on startup get saved amount of small ciders
        mShotsBarCount = settingsBar.getInt("shotsBar", mShotsBarCount); // on startup get saved amount of shots

        displaySmallBeer(mSmallBeerBarCount); // execute function
        displayLargeBeer(mLargeBeerBarCount); // execute function
        displayLongDrink(mLongDrinkBarCount); // execute function
        displaySmallCider(mSmallCiderBarCount); // execute function
        displayShots(mShotsBarCount); // execute function


    }


//--------------------------------------------------------------------------------------------------
    // Start of Small Beers

    // Plus button function
    public void increaseSmallBeerBar(View view) {  // if + button is pressed run code

        mSmallBeerBarCount = increaseInteger(mSmallBeerBarCount); // function increases integer by 1 and assings value to mSmallBeerBarCount
        // Next 4 lines of code save the value
        SharedPreferences settingsBar = getSharedPreferences("myPrefsFile", 0);
        SharedPreferences.Editor editor = settingsBar.edit();
        editor.putInt("smallBeersBar", mSmallBeerBarCount);
        editor.commit();

        displaySmallBeer(mSmallBeerBarCount); // execute function
    }

    // Minus button function
    public void decreaseSmallBeerBar(View view) { // if - button is pressed run code

        mSmallBeerBarCount = decreaseInteger(mSmallBeerBarCount); // function decreases integer by 1 and assings value to mSmallBeerBarCount
        // Next 4 lines of code save the value
        SharedPreferences settingsBar = getSharedPreferences("myPrefsFile", 0);
        SharedPreferences.Editor editor = settingsBar.edit();
        editor.putInt("smallBeersBar", mSmallBeerBarCount);
        editor.commit();

        displaySmallBeer(mSmallBeerBarCount); // execute function
    }

    public void displaySmallBeer(int number) { // displays the smallBeer value on beerSmall_number
        TextView displayInteger = findViewById(
                R.id.beerSmall_number);

        displayInteger.setText("" + number);
    }

    // End of Small Beers
//--------------------------------------------------------------------------------------------------
    //Start of Large Beers

    // Plus button function
    public void increaseLargeBeerBar(View view) {  // if + button is pressed run code

        mLargeBeerBarCount = increaseInteger(mLargeBeerBarCount); // function increases integer by 1 and assings value to mLargeBeerBarCount

        // Next 4 lines of code save the value
        SharedPreferences settingsBar = getSharedPreferences("myPrefsFile", 0);
        SharedPreferences.Editor editor = settingsBar.edit();
        editor.putInt("largeBeersBar", mLargeBeerBarCount);
        editor.commit();

        displayLargeBeer(mLargeBeerBarCount);  // execute function
    }

    // Minus button function
    public void decreaseLargeBeerBar(View view) { // if - button is pressed run code

        mLargeBeerBarCount = decreaseInteger(mLargeBeerBarCount); // function decreases integer by 1 and assings value to mLargeBeerBarCount

        // Next 4 lines of code save the value
        SharedPreferences settingsBar = getSharedPreferences("myPrefsFile", 0);
        SharedPreferences.Editor editor = settingsBar.edit();
        editor.putInt("largeBeersBar", mLargeBeerBarCount);
        editor.commit();

        displayLargeBeer(mLargeBeerBarCount);  // execute function
    }

    public void displayLargeBeer(int number) { // displays the largeBeer value on beerLarge_number
        TextView displayInteger = findViewById(
                R.id.beerLarge_number);

        displayInteger.setText("" + number);
    }

    // End of Large Beers

//--------------------------------------------------------------------------------------------------

    //Start of Long Drinks

    // Plus button function
    public void increaseLongDrinkBar(View view) {  // if + button is pressed run code

        mLongDrinkBarCount = increaseInteger(mLongDrinkBarCount); // function increases integer by 1 and assings value to mLongDrinkBarCount

        // Next 4 lines of code save the value
        SharedPreferences settingsBar = getSharedPreferences("myPrefsFile", 0);
        SharedPreferences.Editor editor = settingsBar.edit();
        editor.putInt("longDrinksBar", mLongDrinkBarCount);
        editor.commit();

        displayLongDrink(mLongDrinkBarCount);  // execute function
    }

    // Minus button function
    public void decreaseLongDrinkBar(View view) { // if - button is pressed run code

        mLongDrinkBarCount = decreaseInteger(mLongDrinkBarCount); // function decreases integer by 1 and assings value to mLargeBeerBarCount

        // Next 4 lines of code save the value
        SharedPreferences settingsBar = getSharedPreferences("myPrefsFile", 0);
        SharedPreferences.Editor editor = settingsBar.edit();
        editor.putInt("longDrinksBar", mLongDrinkBarCount);
        editor.commit();

        displayLongDrink(mLongDrinkBarCount);  // execute function
    }

    public void displayLongDrink(int number) { // displays the largeBeer value on beerLarge_number
        TextView displayInteger = findViewById(
                R.id.longDrink_number);

        displayInteger.setText("" + number);
    }

    // End of Long Drink

//--------------------------------------------------------------------------------------------------

    // Start of Small Cider

    // Plus button function
    public void increaseSmallCiderBar(View view) {  // if + button is pressed run code

        mSmallCiderBarCount = increaseInteger(mSmallCiderBarCount); // function increases integer by 1 and assings value to mSmallCiderBarCount

        // Next 4 lines of code save the value
        SharedPreferences settingsBar = getSharedPreferences("myPrefsFile", 0);
        SharedPreferences.Editor editor = settingsBar.edit();
        editor.putInt("smallCidersBar", mSmallCiderBarCount);
        editor.commit();

        displaySmallCider(mSmallCiderBarCount);  // execute function
    }

    // Minus button function
    public void decreaseSmallCiderBar(View view) { // if - button is pressed run code

        mSmallCiderBarCount = decreaseInteger(mSmallCiderBarCount); // function decreases integer by 1 and assings value to mLargeBeerBarCount

        // Next 4 lines of code save the value
        SharedPreferences settingsBar = getSharedPreferences("myPrefsFile", 0);
        SharedPreferences.Editor editor = settingsBar.edit();
        editor.putInt("smallCidersBar", mSmallCiderBarCount);
        editor.commit();

        displaySmallCider(mSmallCiderBarCount);  // execute function
    }

    public void displaySmallCider(int number) { // displays the largeBeer value on beerLarge_number
        TextView displayInteger = findViewById(
                R.id.smallCider_number);

        displayInteger.setText("" + number);
    }

    // End of Small Cider

//--------------------------------------------------------------------------------------------------

    // Start of Shots

    // Plus button function
    public void increaseShotsBar(View view) {  // if + button is pressed run code

        mShotsBarCount = increaseInteger(mShotsBarCount); // function increases integer by 1 and assings value to mShotsBarCount

        // Next 4 lines of code save the value
        SharedPreferences settingsBar = getSharedPreferences("myPrefsFile", 0);
        SharedPreferences.Editor editor = settingsBar.edit();
        editor.putInt("shotsBar", mShotsBarCount);
        editor.commit();

        displayShots(mShotsBarCount);  // execute function
    }


    // Minus button function
    public void decreaseShotsBar(View view) { // if - button is pressed run code

        mShotsBarCount = decreaseInteger(mShotsBarCount); // function decreases integer by 1 and assings value to mShotsBarCount

        // Next 4 lines of code save the value
        SharedPreferences settingsBar = getSharedPreferences("myPrefsFile", 0);
        SharedPreferences.Editor editor = settingsBar.edit();
        editor.putInt("shotsBar", mShotsBarCount);
        editor.commit();

        displayShots(mShotsBarCount);  // execute function
    }


    public void displayShots(int number) { // displays the shots value on shots_number
        TextView displayInteger = findViewById(
                R.id.Shots_number);

        displayInteger.setText("" + number);
    }

    // End of Shots

//--------------------------------------------------------------------------------------------------

    // Functions

    // increases integer by 1
    public int increaseInteger(int amount) {
        amount = amount + 1;
        return amount;
    }

    // decreases integer by 1
    public int decreaseInteger(int amount) {
        if (amount > 0)
            amount = amount - 1;
        return amount;
    }

}
