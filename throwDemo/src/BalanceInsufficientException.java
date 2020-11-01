public class BalanceInsufficientException extends Exception{//make out own exceptions

    String message ;
    public BalanceInsufficientException(String message){
        this.message=message;
    }
    @Override
    public String getMessage() {
        return this.message;
    }
}
