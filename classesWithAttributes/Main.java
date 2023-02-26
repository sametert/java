package classesWithAttributes;

public class Main {

    public static void main(String[] args) {
        Product product = new Product(5,"Macbook Pro" , "Güzel laptop" , 200, 10);
        Product product2 = new Product();


        // product.setName("Asus");
        // product.setId(8);
        // product.setDescription("Asus Laptop");
        // product.setPrice(200);
        // product.setStockAmount(10);

        // int sonuc = product.getId();
        // System.out.println(sonuc);
        // System.out.println(product.getKod());

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        System.out.println(product.getName());
    }
    
}
