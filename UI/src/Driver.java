import java.awt.*;

public class Driver {
    public static void main(String[] args) {

        Window w = new Window(true);

        w.addUI(new UI());

        w.addEntity(new Player(1,1));

    }
}