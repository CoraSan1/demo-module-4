package service;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    public static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1, "bimbim", "https://maydonggoi.pro.vn/wp-content/uploads/2018/11/May-dong-goi-bim-bim-snack-gia-re.png", 5000));

    }

    public static void add(Product product) {
        products.add(product);
    }

    public void delete(int id){
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id){
                products.remove(i);
            }
        }
    }

    public static void update(int index, Product product) {
        products.set(index, product);
    }

    public static Product getProduct(int id) {
        return products.get(findIndexbyId(id));
    }

    public static int findIndexbyId(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }


}

