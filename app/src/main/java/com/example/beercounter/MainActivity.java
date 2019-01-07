
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

public class MainActivity extends AppCompatActivity {

    int mSmallBeerCount; // total amount of small beers
    int mLargeBeerCount; // total amount of large beers
    int mLongDrinkCount; // total amount of long drinks
    int mSmallCiderCount; // total amount of small ciders
    int mShotsCount; // total amount of shots

   // public static final String PREFS_NAME = "myPrefsFile";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      main();

    }

    void main()
    {
        SharedPreferences settings = getSharedPreferences("myPrefsFile", 0);

        mSmallBeerCount = settings.getInt("smallBeers", mSmallBeerCount); // on startup get saved amount of small beers
        mLargeBeerCount = settings.getInt("largeBeers", mLargeBeerCount); // on startup get saved amount of large beers
        mLongDrinkCount = settings.getInt("longDrinks", mLongDrinkCount); // on startup get saved amount of long drinks
        mSmallCiderCount = settings.getInt("smallCiders", mSmallCiderCount); // on startup get saved amount of small ciders
        mShotsCount = settings.getInt("shots", mShotsCount); // on startup get saved amount of shots

        displaySmallBeer(mSmallBeerCount); // execute function
        displayLargeBeer(mLargeBeerCount); // execute function
        displayLongDrink(mLongDrinkCount); // execute function
        displaySmallCider(mSmallCiderCount); // execute function
        displayShots(mShotsCount); // execute function


    }


//--------------------------------------------------------------------------------------------------
    // Start of Small Beers

    // Plus button function
    public void increaseSmallBeer(View view) {  // if + button is pressed run code

        mSmallBeerCount = increaseInteger(mSmallBeerCount); // function increases integer by 1 and assings value to mSmallBeerCount
        // Next 4 lines of code save the value
        SharedPreferences settings = getSharedPreferences("myPrefsFile", 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putInt("smallBeers", mSmallBeerCount);
        editor.commit();

        displaySmallBeer(mSmallBeerCount); // execute function
    }

    // Minus button function
    public void decreaseSmallBeer(View view) { // if - button is pressed run code

        mSmallBeerCount = decreaseInteger(mSmallBeerCount); // function decreases integer by 1 and assings value to mSmallBeerCount
        // Next 4 lines of code save the value
        SharedPreferences settings = getSharedPreferences("myPrefsFile", 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putInt("smallBeers", mSmallBeerCount);
        editor.commit();

        displaySmallBeer(mSmallBeerCount); // execute function
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
    public void increaseLargeBeer(View view) {  // if + button is pressed run code

        mLargeBeerCount = increaseInteger(mLargeBeerCount); // function increases integer by 1 and assings value to mLargeBeerCount

        // Next 4 lines of code save the value
        SharedPreferences settings = getSharedPreferences("myPrefsFile", 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putInt("largeBeers", mLargeBeerCount);
        editor.commit();

        displayLargeBeer(mLargeBeerCount);  // execute function
    }

    // Minus button function
    public void decreaseLargeBeer(View view) { // if - button is pressed run code

        mLargeBeerCount = decreaseInteger(mLargeBeerCount); // function decreases integer by 1 and assings value to mLargeBeerCount

        // Next 4 lines of code save the value
        SharedPreferences settings = getSharedPreferences("myPrefsFile", 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putInt("largeBeers", mLargeBeerCount);
        editor.commit();

        displayLargeBeer(mLargeBeerCount);  // execute function
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
    public void increaseLongDrink(View view) {  // if + button is pressed run code

        mLongDrinkCount = increaseInteger(mLongDrinkCount); // function increases integer by 1 and assings value to mLongDrinkCount

        // Next 4 lines of code save the value
        SharedPreferences settings = getSharedPreferences("myPrefsFile", 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putInt("longDrinks", mLongDrinkCount);
        editor.commit();

        displayLongDrink(mLongDrinkCount);  // execute function
    }

    // Minus button function
    public void decreaseLongDrink(View view) { // if - button is pressed run code

        mLongDrinkCount = decreaseInteger(mLongDrinkCount); // function decreases integer by 1 and assings value to mLargeBeerCount

        // Next 4 lines of code save the value
        SharedPreferences settings = getSharedPreferences("myPrefsFile", 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putInt("longDrinks", mLongDrinkCount);
        editor.commit();

        displayLongDrink(mLongDrinkCount);  // execute function
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
    public void increaseSmallCider(View view) {  // if + button is pressed run code

        mSmallCiderCount = increaseInteger(mSmallCiderCount); // function increases integer by 1 and assings value to mSmallCiderCount

        // Next 4 lines of code save the value
        SharedPreferences settings = getSharedPreferences("myPrefsFile", 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putInt("smallCiders", mSmallCiderCount);
        editor.commit();

        displaySmallCider(mSmallCiderCount);  // execute function
    }

    // Minus button function
    public void decreaseSmallCider(View view) { // if - button is pressed run code

        mSmallCiderCount = decreaseInteger(mSmallCiderCount); // function decreases integer by 1 and assings value to mLargeBeerCount

        // Next 4 lines of code save the value
        SharedPreferences settings = getSharedPreferences("myPrefsFile", 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putInt("smallCiders", mSmallCiderCount);
        editor.commit();

        displaySmallCider(mSmallCiderCount);  // execute function
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
    public void increaseShots(View view) {  // if + button is pressed run code

        mShotsCount = increaseInteger(mShotsCount); // function increases integer by 1 and assings value to mShotsCount

        // Next 4 lines of code save the value
        SharedPreferences settings = getSharedPreferences("myPrefsFile", 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putInt("shots", mShotsCount);
        editor.commit();

        displayShots(mShotsCount);  // execute function
    }


    // Minus button function
    public void decreaseShots(View view) { // if - button is pressed run code

        mShotsCount = decreaseInteger(mShotsCount); // function decreases integer by 1 and assings value to mShotsCount

        // Next 4 lines of code save the value
        SharedPreferences settings = getSharedPreferences("myPrefsFile", 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putInt("shots", mShotsCount);
        editor.commit();

        displayShots(mShotsCount);  // execute function
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
