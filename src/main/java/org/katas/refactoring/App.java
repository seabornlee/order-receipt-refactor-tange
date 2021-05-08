package org.katas.refactoring;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<LineItem> lineItems = new ArrayList<LineItem>() {{
            add(new LineItem("milk", 10.0, 2));
            add(new LineItem("biscuits", 5.0, 5));
            add(new LineItem("chocolate", 20.0, 1));
        }};
        OrderReceipt receipt = new OrderReceipt(new Order(null, null, lineItems));

        String output = receipt.buildReceipt();
        System.out.println(output);
    }
}
