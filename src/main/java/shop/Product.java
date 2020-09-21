package shop;

import java.math.BigDecimal;
import java.util.Objects;

public class Product {

    private String productName;
    private BigDecimal cost;

    public Product(String productName, BigDecimal cost) {
        this.productName = productName;
        this.cost = cost;
    }

    public static Product createNewProduct(String productName, double cost) {
        return new Product(productName, BigDecimal.valueOf(cost));
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(productName, product.productName) &&
                Objects.equals(cost, product.cost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, cost);
    }

    @Override
    public String toString() {
        return "Наименование товара: " + productName + ", стоимость=" + cost;
    }
}
