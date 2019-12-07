package example.overriding;

public class Overriding2 {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.sound();
        ((Cat) animal).sleep();
        Animal animals = new Cat();
        animals.sound();
        ((Cat) animal).speed();
        Animal animal1=new Fox();
         animal.sound();
        ((Fox) animal).hide();
         Animal animal2=new Dog();
         animal .sound();
        ((Dog) animal2).barking();
    }

}
