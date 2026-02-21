package mystuff;

public class MyStuff {
    private String itemName;
    private String brand;
    private int year;

    public MyStuff(String itemName, String brand, int year) {
        this.itemName = itemName;
        this.brand = brand;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Item: " + itemName);
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}