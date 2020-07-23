import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        MyPanel myPanel= new MyPanel();

        JFrame app=new JFrame();
        app.setSize(400 ,400);
        app.add(new MyPanel());

    }
}
