import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class Window extends JFrame implements Runnable {

    private ArrayList<Entity> entityArrayList = new ArrayList<>();
    private ArrayList<Block> blockArrayList = new ArrayList<>();

    private Thread thread = new Thread(this,"Window");

    private UI userInterface;

    private final int BLOCK = 80;

    /**
     * Creates standard frame at size 14x9 BLOCKS
     * @param visible visibility of frame
     */
    public Window(boolean visible){
        this.setSize(14*BLOCK,(9*BLOCK)+20);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(visible);
        this.setResizable(false);
        begin();
    }

    /**
     * Creates standard frame with custom size
     * @param width width of frame
     * @param height height of frame
     * @param visible visibility of frame
     */
    public Window(int width, int height, boolean visible){
        this.setSize(width*BLOCK,(height*BLOCK)+20);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(visible);
        this.setResizable(false);
        begin();
    }

    /**
     * Adds Entity to frame and entityArrayList
     * @param e entity to add
     */
    public void addEntity(Entity e){
        if (e.getName() == "Entity"){
            entityArrayList.add(e);
        }
        this.add(e);
    }

    /**
     * Returns the Entity with the specified name.
     * @param name name of Entity
     * @return Entity
     */
    public Entity getEntity(String name){
        for (Entity e : entityArrayList){
            if (e.getClass().getName() == name){
                return e;
            }
        }
        return null;
    }

    public void addBlock(Block b){
        if (b.getName() == "Block"){
            blockArrayList.add(b);
        }
        this.add(b);
    }

    private void begin(){
        this.addKeyListener(new Key());
        thread.start();
    }

    //Public for Testing//
    public void addUI(UI userInterface){

        this.userInterface = userInterface;
        userInterface.setVisible(false);

        this.add(userInterface);

    }

    @Override
    public void run() {
        repaint();
    }

    /**
     * Checks for KeyBoard input to tell the entity what to do.
     */
    private class Key implements KeyListener {

        @Override
        public void keyPressed(KeyEvent e) {

            int key = e.getKeyCode();

            if (key == KeyEvent.VK_UP){
                getEntity("Player").moveUp();
            }
            if (key == KeyEvent.VK_DOWN){
                getEntity("Player").moveDown();
            }
            if (key == KeyEvent.VK_RIGHT){
                getEntity("Player").moveRight();
            }
            if (key == KeyEvent.VK_LEFT){
                getEntity("Player").moveLeft();
            }
            if (key == KeyEvent.VK_P){
                userInterface.setVisible(!userInterface.isVisible());
            }

        }

        @Override
        public void keyReleased(KeyEvent e) {

        }

        @Override
        public void keyTyped(KeyEvent e) {

        }
    }
}
