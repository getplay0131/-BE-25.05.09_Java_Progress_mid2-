package Progress_250429.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product, Integer> cartMap = new HashMap<>();

    public void add(Product product, Integer integer){
        Integer defaults = cartMap.getOrDefault(product, 0);
        cartMap.put(product, defaults+integer);
    }

    public void minus(Product product, Integer integer){
        Integer defaults = cartMap.getOrDefault(product, 0);
        Integer result = defaults - integer;
        if (result <= 0) {
            cartMap.remove(product);
        } else {
            cartMap.put(product,result);
        }
    }

    public void printAll(){
        System.out.println("==모든 상품 출력==");
        for (Map.Entry<Product, Integer> entry : cartMap.entrySet()) {
            System.out.println(entry.getKey().toString() + " 수량 : " + entry.getValue());
        }
    }
        }

