import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class UI extends Panel {

    public UI(){

        this.setSize(100,100);
        this.setBackground(Color.BLACK);
        this.setLocation(150,150);

    }

    private class Mouse implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }

}
