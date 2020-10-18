public class CustomerManager {
    private ICustomerDal costumerDal ;
    public CustomerManager(ICustomerDal costumerDal){
        this.costumerDal= costumerDal;
    }
    public void add(){
        costumerDal.add();
        //code
    }
}
