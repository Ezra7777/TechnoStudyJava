package Day47.example;

public class ExelFile implements ReadFile {
    @Override
    public void connect() {
        System.out.println("connect");
    }

    @Override
    public void getDat() {
        System.out.println("");
    }

    @Override
    public void saveData() {

    }

    @Override
    public void updateData() {

    }
}
