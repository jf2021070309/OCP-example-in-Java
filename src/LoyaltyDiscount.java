public class LoyaltyDiscount implements Discount {
    @Override
    public double applyDiscount(double price) {
        return price - 15; 
    }
}
