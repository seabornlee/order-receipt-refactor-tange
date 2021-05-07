package org.katas.refactoring;

/**
 * OrderReceipt prints the details of order including customer name, address, description, quantity,
 * price and amount. It also calculates the sales tax @ 10% and prints as part
 * of order. It computes the total order amount (amount of individual lineItems +
 * total sales tax) and prints it.
 * 
 */
public class OrderReceipt {
    private Order order;

    public OrderReceipt(Order order) {
        this.order = order;
	}

	public String buildReceipt() {
		StringBuilder output = new StringBuilder();

		output.append(getHeaders());
		output.append(getCustomerInformation());
		output.append(getLineItems());
		output.append(getTotalSalesTax());
		output.append(getTotalPaidMoney());

		return output.toString();
	}

	private String getTotalPaidMoney() {
		return "Total Amount" + '\t' + order.getTotalPaidMoney();
	}

	private String getTotalSalesTax() {
		return "Sales Tax" + '\t' + order.getTotalSalesTax();
	}

	private String getLineItems() {
		StringBuilder stringBuilder = new StringBuilder();
		for (LineItem lineItem : order.getLineItems()) {
			stringBuilder.append(getLineItem(lineItem));
		}

		return stringBuilder.toString();
	}

	private String getLineItem(LineItem lineItem) {
		StringBuilder builder = new StringBuilder();
		builder.append(lineItem.getDescription());
		builder.append('\t');
		builder.append(lineItem.getPrice());
		builder.append('\t');
		builder.append(lineItem.getQuantity());
		builder.append('\t');
		builder.append(lineItem.totalAmount());
		builder.append('\n');
		return builder.toString();
	}

	private String getCustomerInformation() {
		return order.getCustomerName() + order.getCustomerAddress();
	}

	private String getHeaders() {
		return "======Printing Orders======\n";
	}

}