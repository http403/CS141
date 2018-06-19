package Day17;

import acm.program.*;
import acm.graphics.*;

import java.awt.*;

public class BlockProgram extends GraphicsProgram {

    private Block b, c, d;

    public void init() {
        b = new Block(50, 50);
        add(b);

        c = new Block(0, 70, 50);
        add(c);

        d = new Block(70, 0, 10);
        add(d);
    }

    public void run() {
        while (true) {
            b.move(2, 1);
            pause(100);
            c.move(0, 2);
            pause(100);
            d.move(2, 0);
            pause(100);
        }
    }

    public static void main(String[] args) {
        new BlockProgram().start(args);
    }
} 