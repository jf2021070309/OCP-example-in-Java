public class Store {
    public double calculateFinalPrice(double price, Discount discount) {
        return discount.applyDiscount(price);
    }
}
