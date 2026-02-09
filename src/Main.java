//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    final double TAX_RATE = 0.05;
    int price = 18;
    double finalSale = 0.0;
    double salesTax = 0.0;

    salesTax = price * TAX_RATE;
    finalSale = salesTax + price;
    System.out.println("The price of your sale was " + price + " dollars, and the tax for this sale is " + salesTax + " dollars. Your final total is " + finalSale + " dollars");



    }
}