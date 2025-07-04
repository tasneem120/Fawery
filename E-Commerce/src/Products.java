abstract public  class Products implements InterfaceProduct {
   public abstract String getName();
   abstract double getPrice();
   abstract int getQuantity();
   public abstract double getWeight();
    public  abstract ShippleOrNot getProduct() ;
    public abstract ExpiredProduct getExpiredProduct();
}
