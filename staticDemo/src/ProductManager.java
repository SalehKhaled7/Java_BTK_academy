public class ProductManager {
    public void add(Product product){


        if(ProductValidator.isValid(product)){
            System.out.println("product added: "+product.name);
        }else{
            System.out.println("invalid product data");
        }
    }
}
