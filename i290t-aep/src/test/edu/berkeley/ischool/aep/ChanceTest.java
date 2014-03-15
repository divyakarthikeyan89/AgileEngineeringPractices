package edu.berkeley.ischool.aep;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
/**
 * Created by divyakarthikeyan on 1/31/14.
 */
public class ChanceTest {

    @Test
    public void oneChanceShouldNotBeEqualToAnother(){
        Chance coinToss = new Chance(0.5);
        Chance dieThrow = new Chance(1/6);
        assertEquals(coinToss, coinToss);
        assertFalse(dieThrow.equals(coinToss));
        assertEquals(new Chance(0.5), coinToss);
        assertEquals(new Chance(1-(1/6)), dieThrow.not());
    }

    @Test
    public void ChanceOfHalfAndHalfShouldBeEqualToOneQuarter(){
        Chance chanceAnd1 = new Chance(0.5);
        assertEquals(new Chance(0.25), chanceAnd1.and(new Chance(0.5)));
    }

    @Test
    public void ChanceOfQuarterAndHalfShouldBeEqualToOneEigth(){
        Chance chanceAnd2 = new Chance(0.25);
        assertEquals(new Chance(0.125), chanceAnd2.and(new Chance(0.5)));
    }
    @Test
    public void ChanceOfHalfAndOneTenthShouldBeEqualToOneTwentieth(){
        Chance chanceAnd3 = new Chance(0.1);
        assertEquals(new Chance(0.05), chanceAnd3.and(new Chance(0.5)));
    }

    @Test
    public void ChanceOfHalfAndOneTenthShouldBeEqualToOneTwentieth2(){
        Chance chanceAnd4 = new Chance();
        assertEquals(new Chance(0.05), chanceAnd4.and(new Chance(0.5),new Chance(0.1)));
    }


    @Test
    public void ChanceOfHalfOrHalfShouldBeEqualToOne(){
        Chance chanceOr1 = new Chance(0.5);
        assertEquals(new Chance(0.75), chanceOr1.or(new Chance(0.5)));
    }


}
