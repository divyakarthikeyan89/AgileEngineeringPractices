package edu.berkeley.ischool.aep;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by divyakarthikeyan on 1/24/14.
 */
public class RectangleTest {
    @Test
    public void shouldReturnAreaOfZeroForZeroByZeroRectangle(){
        Rectangle rectangle = new Rectangle();
        assertEquals(0,rectangle.area());
    }
    @Test
    public void shouldReturnAreaOfTenForFiveByTwoRectangle(){
        Rectangle rectangle = new Rectangle(5,2);
        assertEquals(10,rectangle.area());
        Rectangle rectangle1 = new Rectangle(2,5);
        assertEquals(10,rectangle1.area());
    }

    @Test
    public void checkIfCanCreateSquare(){
        assertEquals(25 ,Rectangle.createSquare(5));
    }



}
