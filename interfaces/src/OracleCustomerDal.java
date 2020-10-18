public class OracleCustomerDal implements ICustomerDal ,IRepository {
    @Override
    public void add() {
        System.out.println("Customer added Oracle db successfully ..");
    }
}
