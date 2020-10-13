public class Main {

    public static void main(String[] args) {
        // 2.Classes are holding objects attributes snf properties exp:color , name , weight ... etc
        Products product1 = new Products(02,"laptop","lenovo legion 5",1200,9);
//        Products product1 = new Products();
//        product1.setId(01);
//        product1.setName("laptop");
//        product1.setDescription("HP omen 15 Gaming laptop");
//        product1.setPrice(900);
//        product1.setStockAmount(8);

        ProductManager productManager = new ProductManager();
        productManager.add(product1);
        System.out.println( "product name: "+product1.getName()+"\ncode:"+product1.getCode());

    }
}
