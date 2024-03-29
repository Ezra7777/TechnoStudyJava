package Day48;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();


        List<Animal> animals = zoo.populateList();

        // print sounds
        zoo.printAnimalSounds( animals );

        // instanceof: to check if object is class of Fish
        zoo.checkForSpecialAnimalFish( animals );


        Food dogFood = new Food( "Pedigree", 10.90, 700 );
        Food fishFood = new Food( "Algae Wafer", 7.00, 200 );
        Food catFood = new Food( "Whiskas", 5.99, 900 );

        Dog d = new Dog();
        d.setMaxCal( 1000 );
        d.setMinCal( 700 );
        d.feed( dogFood );



    }


    private void checkForSpecialAnimalFish(List<Animal> animals) {
        for(Animal animal : animals) {
            if(animal instanceof Fish) {
                System.out.println( "I've special animal in my Zoo" );
            }
        }
        System.out.println( "----------------------" );
    }

    private void printAnimalSounds(List<Animal> animals) {
        for(Animal animal : animals) {
            animal.sound();
        }
        System.out.println( "----------------------" );
    }

    private List<Animal> populateList() {
        List<Animal> animals = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            animals.add( new Cat() );
        }

        for(int i = 0; i < 4; i++) {
            animals.add( new Dog() );
        }
        animals.add( new Fish() );

        return animals;
    }
}