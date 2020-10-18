public class MySqlCustomerDal implements ICustomerDal,IRepository {
    @Override
    public void add() {
        System.out.println("Customer added Mysql db successfully ..");
    }
}
