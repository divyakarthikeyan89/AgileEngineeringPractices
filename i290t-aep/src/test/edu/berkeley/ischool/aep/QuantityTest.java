package edu.berkeley.ischool.aep;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by divyakarthikeyan on 2/14/14.
 */
public class QuantityTest {

//    @Test
//    public void threeFeetShouldEqualOneYard(){
//        assertEquals(new Quantity(Unit.FEET, 3), new Quantity(Unit.YARDS, 1.0));
//    }
//    @Test
//    public void oneMileShouldEqual(){
//        assertEquals(new Quantity(Unit.YARDS, 1760), new Quantity(Unit.MILES,1));
//    }
//
//    @Test
//    public void oneTbspShouldBeEqualToThreeTsp(){
//        assertEquals(new Quantity(Unit.TABLESPOONS, 1), new Quantity(Unit.TEASPOONS,3));
//    }
//
//    @Test
//    public void oneOunceShouldEqualTwoTablespoons(){
//        assertEquals(new Quantity(Unit.TABLESPOONS, 2), new Quantity(Unit.OUNCE,1));
//    }
//
//    @Test
//    public void oneCupShouldEqualEightOunce(){
//        assertEquals(new Quantity(Unit.CUPS, 1), new Quantity(Unit.OUNCE,8));
//    }
//
//    @Test
//    public void twoInchesPlusTwoInchesEqualFourInches(){
//        Quantity quantity1 = new Quantity(Unit.INCHES, 2);
//        Quantity quantity2 = new Quantity(Unit.INCHES, 2);
//        assertEquals(new Quantity(Unit.INCHES,4), quantity1.plus(quantity2));
//    }
//    @Test
//    public void twoTablespoonsPlusOneOunceShouldEqualFourTeaspoons(){
//        Quantity quantity1 = new Quantity(Unit.OUNCE, 1);
//        Quantity quantity2 = new Quantity(Unit.TABLESPOONS, 2);
//        assertEquals(new Quantity(Unit.TABLESPOONS,4), quantity1.plus(quantity2));
//    }
//    @Test(expected = RuntimeException.class)
//    public void testException() throws Exception{
//        Quantity quantity3 = new Quantity(Unit.MILES, 1);
//        Quantity quantity4 = new Quantity(Unit.TABLESPOONS, 2);
//        assertEquals(new Quantity(Unit.OUNCE,2), quantity3.plus(quantity4));
//
//
//    }
//
//    @Test
//    public void twoCelsiusShouldEqualThirtyFiveFahrenheit(){
//        assertEquals(new Quantity(Unit.FAHRENHEIT, 35.6), new Quantity(Unit.CELSIUS, 2));
//
//    }
//
//    @Test
//    public void oneFahrenheitShouldEqualMinusSeventeenCelsius(){
//        assertEquals(new Quantity(Unit.CELSIUS,-17.22), new Quantity(Unit.FAHRENHEIT,1));
//
//    }
//    @Test(expected = RuntimeException.class)
//    public void twoCelsiusPlusTwoFahrenheitShouldThrowException() throws Exception{
//        Quantity quantity5 = new Quantity(Unit.CELSIUS, 2);
//        Quantity quantity6 = new Quantity(Unit.FAHRENHEIT, 2);
//        assertEquals(new Quantity(Unit.FAHRENHEIT,37.6), quantity5.plus(quantity6));
//    }

    @Test
    public void createScalar(){
        Scalar s= new Scalar(Unit.FAHRENHEIT,37.6);
    }

    @Test
    public void createArithmetic(){
        Arithmetic s= new Arithmetic(Unit.INCHES,12);
    }

    @Test
    public void twoTablespoonsPlusOneOunceShouldEqualFourTeaspoons(){
        Arithmetic quantity1 = new Arithmetic(Unit.OUNCE, 1);
        Arithmetic quantity2 = new Arithmetic(Unit.TABLESPOONS, 2);
        assertEquals(new Arithmetic(Unit.TABLESPOONS,4), quantity1.plus(quantity2));
    }

    @Test
    public void isTwoCupsBetterThanOneCup(){
        Quantity quantity7 = new Quantity(Unit.CUPS, 2);
        Quantity quantity8 = new Quantity(Unit.CUPS, 1);

        assertEquals(true, quantity7.isBetterThan(quantity8));
    }

    @Test(expected = RuntimeException.class)
    public void twoCupsBetterThanOneInch() throws RuntimeException {
        Quantity quantity9 = new Quantity(Unit.CUPS, 2);
        Quantity quantity10 = new Quantity(Unit.INCHES, 1);

        assertEquals(true, quantity9.isBetterThan(quantity10));
    }


}

