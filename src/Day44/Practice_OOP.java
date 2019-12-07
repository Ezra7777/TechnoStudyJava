package Day44;

public class Practice_OOP {
    public static void main(String[] args) {
        Parent p;
            p = new Parent();
            p.print();


            p=new SubClass2();
            p.print();
        }
    }
     class Parent {
    void print() {
        System.out.println("ParentClass");
    }
}

     class SubClass1 extends Parent {
       void print() {
        System.out.println("Sub Class 1");
      }
    }

      class SubClass2 extends Parent {
         void print() {
         System.out.println("Sub Class 2");
    }
}