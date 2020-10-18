public class Main {

    public static void main(String[] args) {
	    ProductManager productManager = new ProductManager();
	    productManager.add(new Product(3,"laptop",200));

	    //outer inner classes
        DataBaseHelper.Crud.delete();
        DataBaseHelper.Connect.createConnection();

    }
}
