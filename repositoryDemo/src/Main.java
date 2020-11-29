public class Main {

    public static void main(String[] args) {
        Validator validator = new Validator();
        validator.validate(new  Customer());
        validator.validate(new Product());
        //validator.validate(new ProductDal()); // new ProductDal fives error because of constraining
    }
}
