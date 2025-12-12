public class OrderSummary {
    private double total;
    private double subtotal;
    private double tax;
    private String[] expensiveItems;

    public OrderSummary(double total, double subtotal, double tax, String[] expensiveItems) {
        this.total = total;
        this.subtotal = subtotal;
        this.tax = tax;
        this.expensiveItems = expensiveItems;
    }

    public double getTotal() {
        return total;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getTax() {
        return tax;
    }

    public String[] getExpensiveItems() {
        return expensiveItems;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public void setExpensiveItems(String[] expensiveItems) {
        this.expensiveItems = expensiveItems;
    }

}
