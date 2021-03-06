package lesson.two;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;


/**
 * Created by adrie on 13.03.2018.
 */
public class Point extends Geometry {
    private int x;
    private int y;
    private static final long serialVersionUID = 1L;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public Point(int x){
        this(x, 0);
    }
    public Point(){
        super();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
