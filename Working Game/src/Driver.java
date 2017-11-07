public class Driver {
    public static void main(String[] args) {

        Window w = new Window(true);

        w.addEntity(new Player(1,1));

        for (int x = 0; x < 14; x++){
            for (int y = 0; y < 9; y++){
                w.addBlock(new Ground(x,y));
            }
        }
    }
}
