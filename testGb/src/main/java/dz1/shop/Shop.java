package dz1.shop;


import java.util.List;

public class Shop {
    private List<Product> products;

    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    // Метод должен вернуть отсортированный по возрастанию по цене список продуктов
    public List<Product> sortProductsByPrice() {
        if (products == null){
            throw new RuntimeException("products пуст");
        }
        for (int i = 0; i < products.size(); i++) {
            for (int j = 0; j < products.size(); j++) {
                Product product1 = products.get(i);
                Product product2 = products.get(j);
                if (product1.getCost() > product2.getCost()){
                    products.set(i, product2);
                    products.set(j, product1);
                }
            }
        }
        return products;
    }

    // Метод должен вернуть самый дорогой продукт
    public Product getMostExpensiveProduct() {
       return sortProductsByPrice().get(0);
    }

}