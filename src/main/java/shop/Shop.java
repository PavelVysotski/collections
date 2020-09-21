package shop;

import java.math.BigDecimal;
import java.util.List;

public class Shop {

    public static void addProduct(List<Product> shop, Product product) {
        shop.add(product);
    }

    public static void deleteProduct(List<Product> shop, int index) {
        shop.remove(index - 1);
    }

    public static void findByProductName(List<Product> shop, String productName) {
        for (Product list : shop) {
            if (list.getProductName().equalsIgnoreCase(productName)) {
                System.out.println(list);
            }
        }
        System.out.println("-----------------------------");
    }

    public static void findProductInCostRange(List<Product> shop, double minPriceRange, double maxPriceRange) {
        System.out.println("-----------------------------");
        System.out.println("Товары в заданном ценовом диапазаоне.");
        for (Product list : shop) {
            if (list.getCost().compareTo(BigDecimal.valueOf(minPriceRange)) >= 0 &&
                    list.getCost().compareTo(BigDecimal.valueOf(maxPriceRange)) <= 0) {
                System.out.println(list);
            }
        }
    }

    public static void showShop(List<Product> shop) {
        int i = 1;
        for (Product product : shop) {
            System.out.println(i + ". " + product);
            i++;
        }
        System.out.println("-----------------------------");
    }
}
