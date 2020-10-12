public class Main {

    public static void main(String[] args) {
    //a class contain all methods
    //a class contain all methods that are related to the same topic exp: clientManager
	// from project src > new > Java class

    CustomerManager customer1 = new CustomerManager(); // make new object from type CustomerManager
        //reference type
    CustomerManager customer2 = new CustomerManager();
    customer1 = customer2;
    customer1.addCustomer();
    customer1.removeCustomer();
    customer1.updateCustomer();

    }
}
