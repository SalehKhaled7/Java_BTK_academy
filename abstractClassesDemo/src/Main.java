public class Main {

    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.baseDataBaseManager = new SqlServerDataBaseManager();// new OracleDataBaseManager()
        customerManager.getCustomers();
    }
}
