package edu.berkeley.ischool.aep;

/**
 * Understands a 4 sided figure with sides at right angles
 */
public class Rectangle {


    int length, breath;
    public static Rectangle createSquare(int side){
        return new Rectangle(side,side);
    }

    public Rectangle(){
        length=0;
        breath=0;

    }
    public Rectangle(int l, int b ){
        length=l;
        breath=b;
    }

    public int area(){
        return length*breath;
    }

    public int perimeter(){
        return (2*(length+breath));
    }

}
