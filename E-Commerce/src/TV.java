public class TV extends Products{
    ExpiredProduct expiredProduct=ExpiredProduct.UNEXPIRED_PRODUCT;

    public ExpiredProduct getExpiredProduct() {
        return expiredProduct;
    }
    @Override
    public String getName() {
        return "TV";
    }

    @Override
    double getPrice() {
        return 15900.50;
    }

    @Override
    int getQuantity() {
        return 40;
    }

    @Override
    public double getWeight() {
        return 60;
    }


    @Override
    public ShippleOrNot getProduct() {
        return ShippleOrNot.shippable;
    }
}
