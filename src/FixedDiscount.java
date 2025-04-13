public class FixedDiscount implements Discount {
    @Override
    public double applyDiscount(double price) {
        return price - 10;
    }
}
