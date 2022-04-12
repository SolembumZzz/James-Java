package codegym;

public class Orange extends Fruit implements Edible {
    public Orange() {
    }

    public Orange(String name) {
        super(name);
    }

    @Override
    public String howToEat() {
        return getName() + " can be peeled.";
    }
}
