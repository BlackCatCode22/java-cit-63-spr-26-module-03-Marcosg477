package myanimals;

public class Animal {
    protected static int numOfAnimals = 0;

    public Animal() {
        numOfAnimals++;
        System.out.println("Total animals: " + numOfAnimals);
    }
}