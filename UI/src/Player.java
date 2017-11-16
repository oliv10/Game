import java.awt.*;

public class Player extends Entity {

    public Player(int x, int y){
        super(x,y,5);
    }

    public void customEntity(){
        this.setBackground(Color.BLUE);
    }

}
