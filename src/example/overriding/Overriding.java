package example.overriding;

public class Overriding {
    public static void main(String[] args) {
//        Animal a= new Cat();
//        a.sound();
//        Cat c=new Cat();
//        c.sound();
//        Fox f=new Fox();
//        f.sound();
//        Dog d=new Dog();
//        d.sound();

        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal fox = new Fox();
        cat.sound();
        dog.sound();
        fox.sound();
        System.out.println("----------------------------------------");

        Animal[] animals = {new Cat(), new Dog(), new Fox()};
        for (Animal animal : animals) {
            animal.sound();
        }

    }
}


