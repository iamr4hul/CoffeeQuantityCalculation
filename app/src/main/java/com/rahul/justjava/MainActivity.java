package com.rahul.justjava;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void increment(View view) {
        quantity = quantity + 1;
        displayQuantity(quantity);
    }

    public void decrement(View view) {
        quantity = quantity - 1;
        displayQuantity(quantity);
    }

    public void submitOrder(View view) {
        //int price=quantity*5;
        //String priceMessage;
        //String price = "Total: $" + calculatePrice(quantity,10);

        //String priceMessage = "Total: $ " + calculatePrice(quantity, 10) + "\nThank you";
        //int price=calculatePrice();
        String priceMessage = createOrderSummary(calculatePrice());
        orderTextView(priceMessage);
    }
    private int calculatePrice() {
        return quantity * 5;

    }

    private String createOrderSummary(int price){
        String priceMessage = "Name: Kaptain Rahul\n" +"Quantity: "+quantity +  "\nTotal: $ " + price + "\nThank you";
        return priceMessage;
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText(" " + number);

    }
    private void orderTextView(String message){
        TextView priceTextView = (TextView) findViewById(R.id.order_summary_text_view);
        priceTextView.setText(message);
    }
    }

