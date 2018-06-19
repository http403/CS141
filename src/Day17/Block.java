package Day17;

import acm.program.*;
import acm.graphics.*;

import java.awt.*;

public class Block extends GObject {

    private int width;

    public Block() {
        this(250, 250);
    }

    public Block(int x, int y) {
        setLocation(x, y);
        setColor(Color.BLACK);
        this.width = 20;
    }

    public Block(int x, int y, int w) {
        this(x, y);
        setColor(Color.BLACK);
        this.width = w;
    }

    public GRectangle getBounds() {
        return new GRectangle(getX(), getY(), this.width, this.width);
    }

    public void paint(Graphics g) {
        g.fillRect((int) getX(), (int) getY(), (int) getWidth(), (int) getHeight());
    }

}