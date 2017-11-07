import javax.swing.*;
import java.awt.*;

public abstract class Entity extends Canvas {

    private int moveSpeed;

    public Entity(int x, int y, int moveSpeed){

        this.setLocation((x*80)+20, (y*80)+20);
        this.setSize(40, 40);

        this.setBackground(Color.BLACK);

        this.setName("Entity");

        this.moveSpeed = moveSpeed;

        customEntity();
    }

    public abstract void customEntity();

    @Override
    public void paint(Graphics g){

        if (this.getClass().getName() == "Player"){
            java.net.URL imgUrl = getClass().getResource("Player.png");
            ImageIcon ii = new ImageIcon(imgUrl);
            Image image = ii.getImage();

            g.drawImage(image,0,0,this);
        }
        else{
            java.net.URL imgUrl = getClass().getResource("40x40.png");
            ImageIcon ii = new ImageIcon(imgUrl);
            Image image = ii.getImage();

            g.drawImage(image,0,0,this);
        }

    }

    public void moveUp(){
        this.setLocation(getX(),getY()-moveSpeed);
    }

    public void moveDown(){
        this.setLocation(getX(),getY()+moveSpeed);
    }

    public void moveRight(){
        this.setLocation(getX()+moveSpeed,getY());
    }

    public void moveLeft(){
        this.setLocation(getX()-moveSpeed,getY());
    }

    @Override
    public String toString(){
        return "Entity[" + getClass().getName() + "]";
    }

}
