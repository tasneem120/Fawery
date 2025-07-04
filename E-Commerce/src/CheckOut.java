import java.util.Map;

public class CheckOut {

    Cart cart;
    Customare customare;

    public CheckOut(Customare customare, Cart cart) {
        this.cart = cart;
        this.customare = customare;
    }

    double subTotal() {
        double total = 0;
        for (Map.Entry<Products, Integer> entry : cart.items.entrySet()) {
            Products p = entry.getKey();
            int quantity = entry.getValue();
            total += quantity * p.getPrice();
        }
        return total;
    }

    void shippingProduct() {
        double totalWeight = 0;
        for (Map.Entry<Products, Integer> entry : cart.items.entrySet()) {
            Products p = entry.getKey();
            int quantity = entry.getValue();

            if (p.getProduct() == ShippleOrNot.shippable) {
                double weight = quantity * p.getWeight();
                totalWeight += weight;
                System.out.println(quantity + "X " + p.getName() + " " + weight + "g");
            } else {
                System.out.println(quantity + "X " + p.getName());
            }
        }
        System.out.println("Total Package Weight: " + totalWeight / 1000 + "Kg");
    }

    void checkOutReceipt() {
        for (Map.Entry<Products, Integer> entry : cart.items.entrySet()) {
            Products p = entry.getKey();
            int quantity = entry.getValue();
            System.out.println(quantity + "X " + p.getName() + " = " + (quantity * p.getPrice()));
        }
    }

    double shippingFees() {
        double totalFees = 0;
        for (Map.Entry<Products, Integer> entry : cart.items.entrySet()) {
            Products p = entry.getKey();
            if (p.getProduct() == ShippleOrNot.shippable) {
                totalFees += p.getPrice(); // You can change this logic later if fees are weight-based
            }
        }
        return totalFees;
    }

    double paidAmount() {
        return subTotal() + shippingFees();
    }

    public void theCheckOut() {
        // Check empty cart
        if (cart.items.isEmpty()) {
            System.out.println("Error: Cart is empty.");
            return;
        }

        // Check expired or out of stock
        for (Map.Entry<Products, Integer> entry : cart.items.entrySet()) {
            Products p = entry.getKey();
            int quantity = entry.getValue();
            if (p.getExpiredProduct() == ExpiredProduct.EXPIRED_PRODUCT) {
                System.out.println("Error: Product " + p.getName() + " is expired.");
                return;
            }
            if (quantity > p.getQuantity()) {
                System.out.println("Error: Quantity of " + p.getName() + " exceeds available stock.");
                return;
            }
        }

        // Check balance
        if (customare.getBalance() < paidAmount()) {
            System.out.println("Error: Insufficient balance.");
            return;
        }

        // Proceed to checkout
        System.out.println("** Shipment notice **");
        shippingProduct();
        System.out.println("** Checkout receipt **");
        checkOutReceipt();
        System.out.println("-----------------------");
        System.out.println("Subtotal: " + subTotal());
        System.out.println("Shipping Fees: " + shippingFees());
        System.out.println("Amount: " + paidAmount());

        // Update customer balance
        customare.setBalance(customare.getBalance() - paidAmount());

        System.out.println("Remaining balance: " + customare.getBalance());
    }
}
