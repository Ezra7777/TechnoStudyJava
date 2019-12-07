package example.overriding;


public class SeniorTesterSalary extends TesterBaseSalary {

    @Override
    public int getSalary() {
        return super.getSalary() + 100_000;
    }
}