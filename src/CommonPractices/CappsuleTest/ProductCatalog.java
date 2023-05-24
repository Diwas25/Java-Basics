package CommonPractices.CappsuleTest;

import java.util.HashMap;

public class ProductCatalog {
    private HashMap<String, Integer> productMap;

    // Constructor to initialize the product map
    public ProductCatalog() {
        productMap = new HashMap<String, Integer>();
        productMap.put("ProductA", 1001);
        productMap.put("ProductB", 1002);
        productMap.put("ProductC", 1003);
        // Add more products and their IDs here
    }

    // Method to get product ID by name
    public int getProductId(String productName) {
        if (productMap.containsKey(productName)) {
            return productMap.get(productName);
        } else {
            throw new IllegalArgumentException("Product not found in catalog.");
        }
    }

    // Example usage
    public static void main(String[] args) {
        ProductCatalog catalog = new ProductCatalog();
        int productId = catalog.getProductId("Product");
        System.out.println("Product ID for ProductA is " + productId);
    }
}

