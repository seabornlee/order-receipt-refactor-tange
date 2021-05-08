package org.katas.refactoring;

import java.util.List;

public class Order {
    String nm;
    String addr;
    List<LineItem> li;

    public Order(String nm, String addr, List<LineItem> li) {
        this.nm = nm;
        this.addr = addr;
        this.li = li;
    }

    public String getCustomerName() {
        return nm;
    }

    public String getCustomerAddress() {
        return addr;
    }

    public List<LineItem> getLineItems() {
        return li;
    }

    double getTotalSalesTax() {
        double totalSalesTax = 0d;
        for (LineItem lineItem : getLineItems()) {
            totalSalesTax += lineItem.getSalesTax();
        }
        return totalSalesTax;
    }

    double getTotalPaidMoney() {
        double totalPaidMoney = 0d;
        for (LineItem lineItem : getLineItems()) {
totalPaidMoney += lineItem.totalAmount() + lineItem.getSalesTax();
        }
        if (totalPaidMoney >= 10) {
            return totalPaidMoney * 0.9;
        }
        return totalPaidMoney;
    }
}
