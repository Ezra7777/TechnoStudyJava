package Day47.example;

import java.io.Reader;

 interface  ReadFile {
    void connect();
    void getDat();
    void saveData();
    void updateData();

}class DMGfile implements ReadFile{


    @Override
    public void connect() {
        System.out.println("it is connected to readfile");
    }

    @Override
    public void getDat() {
        System.out.println("it is readable text");
    }

    @Override
    public void saveData() {
        System.out.println("it is better save the text");
    }

    @Override
    public void updateData() {
        System.out.println("Update date is added");
    }
}
