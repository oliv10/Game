import java.awt.*;

public class Ground extends Block {

    public Ground(int x, int y){
        super(x,y);
    }

    @Override
    public void customBlock() {
        this.setBackground(new Color(0,130,0));
    }
}
