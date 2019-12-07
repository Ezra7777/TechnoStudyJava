package Day43;

import example.overriding.JuniorTesterSalary;
import example.overriding.SeniorTesterSalary;
import example.overriding.TesterBaseSalary;

public class JavaInstanceOf {

        public static void main(String[] args) {
            TesterBaseSalary[] employees = {
                    new JuniorTesterSalary(),
                    new JuniorTesterSalary(),
                    new JuniorTesterSalary(),
                    new SeniorTesterSalary()
            };

            for (TesterBaseSalary emp : employees) {
                if (emp instanceof JuniorTesterSalary) {
                    System.out.println("Junior's salary is: " + emp.getSalary());
                } else if (emp instanceof SeniorTesterSalary) {
                    System.out.println("Senior's salary is: " + emp.getSalary());
                }
            }

//        Junior 50000
//        Junior 50000
//        Junior 50000
//        Senior 200000
        }
    }


