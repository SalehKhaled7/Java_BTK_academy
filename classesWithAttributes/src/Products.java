public class Products { // every Class should have only one task

    //Constructor
    public Products(int id,String name,String description,double price,int stockAmount){
        this.id=id;
        this.name=name;
        this.description=description;
        this.price=price;
        this.stockAmount=stockAmount;

    }
    public Products(){} //overloading "original constructor"

    //object attributes / fields
    //main class cant reach this cause it's private same for all bellow
    private int id;
    private String name;
    private double price;
    private String description;
    private int stockAmount;
    private String code;

    //Get and Set are used for encapsulation so no one can access the data directly
    public int getId() { // get only means "read only"
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setId(int id) {
        this.id = id;  // this.id means the id in this class also u can name your fields _id ,_name ...etc
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getCode() {
        return this.name.substring(0,1)+id;
    }


}
