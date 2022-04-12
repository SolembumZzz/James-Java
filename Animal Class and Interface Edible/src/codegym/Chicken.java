package codegym;

public class Chicken extends Animal implements Edible {

    public Chicken(){}

    public Chicken(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return getName() + ": cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return getName() + " could be fried.";
    }
}
