package codegym;

public class Tiger extends Animal{

    public Tiger(){}

    public Tiger(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return getName() + ": roarrrrr!";
    }
}
