public class CustomerManager extends BaseLogger {

    private BaseLogger logger;
    public CustomerManager(BaseLogger logger){
        this.logger=logger;
    }
    public void add(){
        //code
        System.out.println("customer added ...");
        this.logger.log("message ..");
    }


}
