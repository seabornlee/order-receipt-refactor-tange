package org.katas.refactoring;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class OrderTest {
    @Test
    public void should_get_total_paid_money() {
        List<LineItem> lineItems = new ArrayList<LineItem>();
        lineItems.add(new LineItem("", 9, 1));
        Order order = new Order("", "", lineItems);
        assertEquals(9.9, order.getTotalPaidMoney(), .00001);
    }

    @Test
    public void should_discount_total_paid_money_when_exceed_10() {
        List<LineItem> lineItems = new ArrayList<LineItem>();
        lineItems.add(new LineItem("", 10, 1));
        Order order = new Order("", "", lineItems);
        assertEquals(9.9, order.getTotalPaidMoney(), .00001);
    }
}
