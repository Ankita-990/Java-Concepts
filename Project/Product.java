
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

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getWarranty() {
        return warranty;
    }

    public void setWarranty(Integer warranty) {
        this.warranty = warranty;
    }

    public String toString(){
        return "Product {Name: " + getName() + ", Type: " + getType() + ", Location: " + getLocation() + ", Warranty: " + getWarranty() + "}";
    }

}