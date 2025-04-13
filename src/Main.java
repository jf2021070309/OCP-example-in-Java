public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        double price = 100;

        Discount fixed = new FixedDiscount();
        Discount percent = new PercentageDiscount();
        Discount loyalty = new LoyaltyDiscount();

        System.out.println("Fixed Discount: " + store.calculateFinalPrice(price, fixed));
        System.out.println("Percentage Discount: " + store.calculateFinalPrice(price, percent));
        System.out.println("Loyalty Discount: " + store.calculateFinalPrice(price, loyalty));
    }
}
