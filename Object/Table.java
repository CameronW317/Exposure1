package Object;

/*
 * Since this is European furniture, it is measured in cm and kg
 *
 */

public class Table {
    // Attributes - Variables
    double height;
    double width;
    double length;
    double weight;
    double price;


    // Default Constructor - Special Method
    public Table(){
        height = 0;
        width = 0;
        weight = 0;
        price = 0;
        length = 0;
    }

    // Getters/Accessors
    public double getHeight() {
        return height;
    }
    public double getWidth() {
        return width;
    }
    public double getLength() {
        return length;
    }
    public double getWeight() {
        return weight;
    }
    public double getPrice() {
        return price;
    }
}
