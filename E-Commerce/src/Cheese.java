public class Cheese extends Products {
    ExpiredProduct expiredProduct=ExpiredProduct.EXPIRED_PRODUCT;


    public ExpiredProduct getExpiredProduct() {
        return expiredProduct;
    }     public ShippleOrNot getProduct() {
        return ShippleOrNot.shippable;
    }

    @Override
    public String getName() {
        return "Cheese";
    }

    @Override
    double getPrice() {
        return 100;
    }

    @Override
    int getQuantity() {
        return 80;
    }

    @Override
    public double getWeight() {
        return 200;
    }

}
