package example.overriding;

public class Fox extends Animal {
    @Override
    public void sound() {
        System.out.println(("Fox say meoW"));
    }
    public static void hide(){
        System.out.println(("Hiding"));
    }
}


