public class ProductManager { // every Class should have only one task ..products managing class

    public void add(Products product) {
        //code for adding the product to the data base
        System.out.println("Product added successfully: " + product.getName());
    }

    public void update(Products product) {
        //code for adding the product to the data base
        System.out.println("Product updated successfully: " + product.getName());
    }
}
