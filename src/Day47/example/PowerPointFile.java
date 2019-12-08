package Day47.example;

import jdk.swing.interop.SwingInterOpUtils;

public class PowerPointFile implements ReadFile {
    @Override
    public void connect() {
        System.out.println("it comes from ReadFile");
    }

    @Override
    public void getDat() {
        System.out.println(" it is readable PPT");
    }

    @Override
    public void saveData() {
        System.out.println("it is not saved");
    }

    @Override
    public void updateData() {
        System.out.println("update");

    }
}
