public  class ProductValidator { // outer classes cant be static
    // if a method is static u can call it directly from the class. ex: ProductValidator.isValid
    static { //this block will work whenever this class is used
        System.out.println("this block will work whenever this class is used");
    }
    public static boolean isValid(Product product){

        if(product.price>0 && !product.name.isEmpty() ){
            return true;

        }else {
            return false;
        }
    }
    public void method(){ // you can call it directly using class name  ProductValidator.method is wrong

    }

    public static class newClass{ // inner class can be static
        public static void delete(){} // static methods force inner classes to be static
    }
}
