package codegym;

public class Apple extends Fruit implements Edible {
    public Apple() {
    }

    public Apple(String name) {
        super(name);
    }

    @Override
    public String howToEat() {
        return getName() + " can be sliced.";
    }
}
