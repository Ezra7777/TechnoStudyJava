package Day44.Example;
//it does not work with data member, cannot override the datamember,
//but can override the method
public class RuntimePolymorphismWithDataMember {
    public static void main(String args[]) {
        Bike obj = new Honda();

        System.out.println(obj.speedlimit);//90
        //here method overriding works on methods
        obj.Print();
    }
}

class Bike {
    int speedlimit = 90;
    void Print(){
        System.out.println("Bike driving");
    }
}

class Honda extends Bike {
    int speedlimit = 150;
    void Print(){
        System.out.println("Honda driving");
        //when you use the abstract you need to put override every class
    }
}