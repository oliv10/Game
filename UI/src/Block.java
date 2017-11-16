import javax.swing.*;
import java.awt.*;

public abstract class Block extends Canvas {

    public Block(int x, int y){

        this.setLocation(x*80,y*80);
        this.setSize(80,80);

        this.setBackground(Color.BLACK);

        this.setName("Block");

        customBlock();
    }

    public abstract void customBlock();

    @Override
    public void paint(Graphics g){

        if (this.getClass().getName() == "Ground"){
            try {
                java.net.URL imgUrl = getClass().getResource("Grass.png");
                ImageIcon ii = new ImageIcon(imgUrl);
                Image image = ii.getImage();

                g.drawImage(image, 0, 0, this);
            }
            catch (Exception e){

            }
        }
        else{
            try {
                java.net.URL imgUrl = getClass().getResource("80x80.png");
                ImageIcon ii = new ImageIcon(imgUrl);
                Image image = ii.getImage();

                g.drawImage(image, 0, 0, this);
            }
            catch (Exception e){

            }
        }

    }

    @Override
    public String toString(){
        return "Block[" + getClass().getName() + "]";
    }

}
