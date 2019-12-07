package Day41.Task;

public class Animal {
    public String name;
    public int speed;
    public String toString() {
        return ("Name of the animal is " + name
                + "\n"
                + "and age is  " + speed);
    }



    public Animal(int speed,String name){

        this.speed=speed;
        this.name=name;

        }

    }

