package com.example.android.justjava;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends ActionBarActivity {

    int quantity=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        displayMessage("Total Cost: " + "Rs. " + (quantity*5) + "\n\nFucking Pay The Fucking Price And Fucking Leave!! I'm not your Fucking Servant, Fucking Dickhead... -_- \n\nThugLife™");}

    public void increment(View view) {
        quantity++;
        display(quantity);
    }

    public void decrement(View view) {
        quantity--;
        display(quantity);
    }

    public void reset(View view) {
        quantity=0;
        display(quantity);
        displayMessage("Bitch u r damned !! All resetted to their original fucking states :3 ThugLife™ ");
    }


    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + number);}

    /**
      *This method prints the total cost on the screen
     */

    private void displayPrice(int number)
    {
        TextView priceTextview=(TextView)findViewById(R.id.price_text_view);
        priceTextview.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
    }

