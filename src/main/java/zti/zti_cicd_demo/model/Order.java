package zti.zti_cicd_demo.model;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.RequestScoped;

public class Order {
    private int orderId;
    private String customerEmail;
    private String productName;
    private int quantity;

    public int getOrderId() {
        return this.orderId;
    }

    public String getCustomerEmail() {
        return this.customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private Order() {}
    public Order(String email, String productName, int quantity) {
        this.customerEmail = email;
        this.productName = productName;
        this.quantity = quantity;
    }
}
