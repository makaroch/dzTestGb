package dz1.shop;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class ShopTest {
    /*
       1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов,
            верное содержимое корзины).????
       2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
       3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
   */
    Shop shop = new Shop();
    {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(25, "test1"));
        productList.add(new Product(2124, "test2"));
        productList.add(new Product(21, "test3"));
        productList.add(new Product(66, "test4"));
        shop.setProducts(productList);
    }
    @Test
    public void testGetMostExpensiveProduct(){
        assertThat(shop.getMostExpensiveProduct()).isEqualTo(new Product(2124, "test2"));
    }
    @Test
    public void testSortProductsByPriceNull(){
        shop.setProducts(null);
        assertThatThrownBy(() -> shop.sortProductsByPrice()).isInstanceOf(RuntimeException.class);
    }
    @Test
    public void testSortProductsByPrice(){
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(2124, "test2"));
        productList.add(new Product(66, "test4"));
        productList.add(new Product(25, "test1"));
        productList.add(new Product(21, "test3"));

        assertThat(shop.sortProductsByPrice()).isEqualTo(productList);
    }
}