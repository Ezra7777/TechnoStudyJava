package Day37;
class Car {
    public String name;
    public String model;
}

class Driver {
    public String fullName;
    public boolean hasLicense;
    public Car car;

    public Driver(String fn, boolean hl, String carName, String carModel) {
        fullName = fn;
        hasLicense = hl;

        car = new Car();
        car.name = carName;
        car.model = carModel;
    }

    public String toString() {
        String result = "";
        result += "fullName: " + fullName + "\n";
        result += "hasLicense: " + hasLicense + "\n";
        result += "car model: " + car.model + "\n";
        result += "car name: " + car.name + "\n";

        return result;
    }

}