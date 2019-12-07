package Day44;

public abstract class BaseClass {
    public abstract void study ();

  }
 class Derived extends BaseClass {

     @Override
     public void study() {
         System.out.println("derived class");
     }

     public static void main(String[] args) {
         Derived d = new Derived();
         d.study();
     }
 }
//you have to create Derived class that inherits from BaseClass
// your BaseClass has to have abstract void method
//Your DerivedClass has to have method called study()
//When you ru the Main method ,you have run the study method.
//Abstract class cannot be  instantiation//interview class
