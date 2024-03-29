package Day35;
//create a class
// add at least 3 attributes
// add at least 3 constructors
// add method that return all attributes as one string
// in Task 2 class create at least 4 object on that class
// call method to get attributes and print it
public class Bank{

public int year;
public int serial;
public String name;
public boolean trustworthiness;

public Bank() {
        year = 0;
        serial = 0;
        name = "Unknown bank";
        }

public Bank(boolean t) {
        this(2019, 10, "Bank of America");
        trustworthiness = t;
        }

public Bank(int y, int num, String name) {
        this.year = y;
        this.name = name;

        serial = num;
        }

public Bank(int year, int num, String name, boolean t) {
        this.year = year;
        serial = num;
        this.name = name;
        trustworthiness = t;

        }

public String printOut() {
        String a = "Bank Year:" + year + "\n";
        String b = "Bank Name:" + name + "\n";
        String c = "Serial Number:" + serial + "\n";
        String d = "Trustworthiness:" + trustworthiness;
        return a + b + c + d;
        }

        }