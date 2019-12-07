package Day42;

public class EncapsulationEx {

    //read only -accesible to get/read attributes/field
    // write only-modify attributes/field,cannot read


    public void carGallery() {

        Car ford = new Car("Ford");
        // ford.name;
        String n=ford.getName();
        //Car.("ford");

    }

}
