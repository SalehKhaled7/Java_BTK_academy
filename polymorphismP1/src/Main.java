public class Main {

    public static void main(String[] args) {
//        EmailLogger emailLogger = new EmailLogger();
//        emailLogger.log(" log msg\n");
//
//        BaseLogger[] loggers = {new FileLogger(),new DataBaseLogger(),new EmailLogger(),new ConsoleLogger()};
//
//        for(BaseLogger logger:loggers){
//            logger.log("log message ");
//        }
        CustomerManager customerManager = new CustomerManager(new EmailLogger());
        customerManager.add();
    }
}
