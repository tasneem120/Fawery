public class Mobile extends Products{
    ExpiredProduct expiredProduct=ExpiredProduct.UNEXPIRED_PRODUCT;
    ShippleOrNot shippleOrNot=ShippleOrNot.Unshippable;
    public ExpiredProduct getExpiredProduct() {
        return expiredProduct;
    }


    public ShippleOrNot getProduct() {
        return ShippleOrNot.Unshippable;
    }

    @Override
    public String getName() {
        return "Mobile";
    }

    @Override
    double getPrice() {
        return 10000;
    }

    @Override
    int getQuantity() {
        return 60;
    }

    @Override
    public double getWeight() {
        return 30.5;
    }


}
