package example.overriding;
public class MiddleTesterSalary extends TesterBaseSalary {

    @Override
    public int getSalary() {
        return super.getSalary() + 10_000;
    }
}