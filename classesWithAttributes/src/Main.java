public class Main {

    public static void main(String[] args) {
        // 2.Classes are holding objects attributes snf properties exp:color , name , weight ... etc
        Products product1 = new Products();
        product1.id = 01;
        product1.name = "laptop";
        product1.description = "HP omen 15 Gaming laptop";
        product1.price = 900;
        product1.stockAmount = 8;

        ProductManager productManager = new ProductManager();
        productManager.add(product1);

    }
}
