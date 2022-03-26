
package ecommerce;


public class Order {
    private User ordererUser;
    private Product orderedProduct;
    private CreditCard usedCreditCard;

    public Order() {
    }

    public User getOrdererUser() {
        return ordererUser;
    }

    public void setOrdererUser(User ordererUser) {
        this.ordererUser = ordererUser;
    }

    public Product getOrderedProduct() {
        return orderedProduct;
    }

    public void setOrderedProduct(Product orderedProduct) {
        this.orderedProduct = orderedProduct;
    }

    public CreditCard getUsedCreditCard() {
        return usedCreditCard;
    }

    public void setUsedCreditCard(CreditCard usedCreditCard) {
        this.usedCreditCard = usedCreditCard;
    }
}
