package example.overriding;

public class Cat extends Animal {
    @Override
    public void sound(){
        System.out.println(("Cat say meoW"));

    }
    public void sleep() {
        System.out.println("Cat sleep");
    }

    public static void speed(){
        System.out.println(("Cat speed"));
    }
}

