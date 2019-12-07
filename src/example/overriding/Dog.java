package example.overriding;

public class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog say ...");
    }

    public void barking () {
        System.out.println("barking");
    }
}