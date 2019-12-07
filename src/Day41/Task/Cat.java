package Day41.Task;

public class Cat extends Animal{
    public String sound ;
    public String toString() {
        return "I want to return Cat ToString. here is my sound:" + sound;
    }

    public Cat(int speed, String name, String sound) {

            super(speed, name);
            this.sound = sound;
        }
    }
