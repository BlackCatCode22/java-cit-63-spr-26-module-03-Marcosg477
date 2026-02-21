package mystuff;

public class Driver {
    public static void main(String[] args) {
        MyStuff laptop = new MyStuff("Laptop", "Dell", 2022);
        MyStuff headphones = new MyStuff("Headphones", "Sony", 2021);

        laptop.displayInfo();
        System.out.println();
        headphones.displayInfo();
    }
}