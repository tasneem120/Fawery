public class Biscuits extends Products {
 ExpiredProduct expiredProduct=ExpiredProduct.EXPIRED_PRODUCT;
    public ExpiredProduct getExpiredProduct() {
        return expiredProduct;
    }
    public ShippleOrNot getProduct() {
        return ShippleOrNot.Unshippable;
    }

    @Override
    public String getName() {
        return "Biscuits";
    }

    @Override
    double getPrice() {
        return 150;
    }

    @Override
    int getQuantity() {
        return 20;
    }

    @Override
    public double getWeight() {
        return 700;
    }

}
