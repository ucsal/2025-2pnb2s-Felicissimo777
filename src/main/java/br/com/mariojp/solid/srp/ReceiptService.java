package br.com.mariojp.solid.srp;

public class ReceiptService {
	public String generate(Order order) {

		TaxCalculator taxCalculator = new TaxCalculator();

		double subtotal = order.getItems().stream().mapToDouble(i -> i.getUnitPrice() * i.getQuantity()).sum();
		double tax = taxCalculator.calculate(subtotal);
		double total = subtotal + tax;
		
		return String.format("Subtotal: %s, Tax: %s, Total: %s", subtotal, tax, total);
	}
}
