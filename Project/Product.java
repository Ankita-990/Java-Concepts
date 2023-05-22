package Project;

public class Product{

    String name;
    String type;
    String location;
    Integer warranty;

    public Product(){
        System.out.println("Product is ready");
    }

    public Product(String name, String type, String location, Integer warranty){
        this.name = name;
        this.type = type;
        this.location = location;
        this.warranty = warranty;
    }

}