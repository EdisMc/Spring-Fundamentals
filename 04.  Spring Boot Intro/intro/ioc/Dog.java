package bg.softuni.intro.ioc;

public class Dog implements Animal {

    private final boolean superDog;

    public Dog() {
        this(false);
    }
    public Dog(boolean superDog) {
        this.superDog = superDog;
    }

    @Override
    public void makeNoise() {
        if (superDog) {
            System.out.println("Super Bark Super Bark");
        } else {
            System.out.println("Bark Bark");
        }
    }

}
