package shop;

import java.util.ArrayList;
import java.util.List;

public class MenuAction {

    public static void worker() {
        Product p1 = Product.createNewProduct("Картофель", 12.50);
        Product p2 = Product.createNewProduct("Морковь", 7.34);
        Product p3 = Product.createNewProduct("Лук", 5.12);
        Product p4 = Product.createNewProduct("Апельсин", 5.79);
        Product p5 = Product.createNewProduct("Банан", 2.56);
        Product p6 = Product.createNewProduct("Арбуз", 1.05);
        Product p7 = Product.createNewProduct("Помидор", 3.36);
        Product p8 = Product.createNewProduct("Огурец", 2.80);

        List<Product> shop = new ArrayList<>();

        Shop.addProduct(shop, p1);
        Shop.addProduct(shop, p2);
        Shop.addProduct(shop, p3);
        Shop.addProduct(shop, p4);
        Shop.addProduct(shop, p5);
        Shop.addProduct(shop, p6);
        Shop.addProduct(shop, p7);
        Shop.addProduct(shop, p8);

        boolean mainLoop = true;
        while (mainLoop) {
            MenuText.mainMenu();
            int menuChoice = CommandReader.readNumber("Введите номер необходимого действия: ");
            switch (menuChoice) {
                case 1:
                    Shop.showShop(shop);
                    break;
                case 2:
                    Shop.showShop(shop);
                    String productName = CommandReader.readString("Введите наименование товара: ");
                    Shop.findByProductName(shop, productName);
                    break;
                case 3:
                    double minRange = CommandReader.readDouble("Введите нижнюю границу стоимости: ");
                    double maxRange = CommandReader.readDouble("Введите верхнюю границу стоимости: ");
                    Shop.findProductInCostRange(shop, minRange, maxRange);
                    break;
                case 4:
                    String newProduct = CommandReader.readString("Введите название товара: ");
                    double newCost = CommandReader.readDouble("Введите его стоимость: ");
                    Product product = Product.createNewProduct(newProduct, newCost);
                    Shop.addProduct(shop, product);
                    Shop.showShop(shop);
                    break;
                case 5:
                    Shop.showShop(shop);
                    int index = CommandReader.readNumber("Введите номер товара, которые надо удалить: ");
                    Shop.deleteProduct(shop, index);
                    Shop.showShop(shop);
                    break;
                case 6:
                    mainLoop = false;
                    break;
                default:
                    System.out.println("Такого номера нет, повторите Ваш выбор: ");
            }
        }
    }
}
