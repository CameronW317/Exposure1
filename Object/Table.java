package Object;

/*
 * Since this is European furniture, it is measured in cm and kg
 *
 */

public class Table {
    // Attributes - Variables
    private double height;
    private double width;
    private double weight;
    private double price;
    private double length;

    // Default Constructor - Special Method
    public Table(){
        height = 0;
        width = 0;
        weight = 0;
        price = 0;
        length = 0;
    }

    public Table(double height, double width, double weight, double price, double length){
        this.height = height;
        this.width = width;
        this.weight = weight;
        this.price = price;
        this.length = length;
    }

    // Getters/Accessors
    public double getHeight() {
        return height;
    }
    public double getWidth() {
        return width;
    }
    public double getWeight() {
        return weight;
    }
    public double getPrice() {
        return price;
    }
    public double getLength() {
        return length;
    }

    // Setters/Mutators
    public void setHeight(double height){
        if(weight <= 1000) {
            this.weight = height;
        }
        else{
            this.weight = 1000;
        }
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setLength(double length){
        this.length = length;
    }
}
