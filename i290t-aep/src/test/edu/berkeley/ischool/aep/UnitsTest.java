package edu.berkeley.ischool.aep;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by divyakarthikeyan on 2/7/14.
 */
public class UnitsTest {

    @Test
    public void inchesAndFeet() {
        assertEquals(new Units(1,"ft"),Units.inchesFeet(12,"inches"));
        assertEquals(new Units(12,"inches"),Units.inchesFeet(1,"ft"));
        assertEquals(new Units(1,"ft"),Units.inchesFeet(12,"in"));
        assertEquals(new Units(12,"inches"),Units.inchesFeet(1,"feet"));
        assertEquals(new Units(12,"inches"),Units.inchesFeet(1,"FeeT"));
        assertEquals(new Units(12,"inches"),Units.inchesFeet(1,"FT"));
        assertEquals(new Units(-1,"Invalid Units"),Units.inchesFeet(1,"mhgnfmjgh"));
    }
    @Test
    public void yardAndFeet()  {
        assertEquals(new Units(1,"yard"),Units.feetYard(3,"feet"));
        assertEquals(new Units(2,"yard"),Units.feetYard(6,"ft"));
        assertEquals(new Units(3,"ft"),Units.feetYard(1,"yard"));
        assertEquals(new Units(3,"ft"),Units.feetYard(1,"yrd"));
        assertEquals(new Units(2,"yard"),Units.feetYard(6,"FeeT"));
        assertEquals(new Units(2,"yard"),Units.feetYard(6,"FT"));
        assertEquals(new Units(-1,"Invalid Units"),Units.feetYard(1,"mhgnfmjgh"));
    }
    @Test
    public void yardAndMile()  {
        assertEquals(new Units(1,"mile"),Units.yardMile(1760,"yard"));
        assertEquals(new Units(2,"mile"),Units.yardMile(3520,"yrd"));
        assertEquals(new Units(1760,"yard"),Units.yardMile(1,"mile"));
        assertEquals(new Units(1760,"yard"),Units.yardMile(1,"MilE"));
        assertEquals(new Units(-1,"Invalid Units"),Units.yardMile(1,"mhgnfmjgh"));
    }
    @Test
    public void tbspAndTsp() {
        assertEquals(new Units(3,"tsp"),Units.tbspTsp(1,"tbsp"));
        assertEquals(new Units(3,"tsp"),Units.tbspTsp(1,"tablespoon"));
        assertEquals(new Units(4,"tbsp"),Units.tbspTsp(12,"tsp"));
        assertEquals(new Units(10,"tbsp"),Units.tbspTsp(30,"TeaSpOON"));

        assertEquals(new Units(-1,"Invalid Units"),Units.tbspTsp(1,"mhgnfmjgh"));
    }
    @Test
    public void ounceAndTbsp()  {
        assertEquals(new Units(2,"tbsp"),Units.ozTbsp(1,"oz"));
        assertEquals(new Units(2,"tbsp"),Units.ozTbsp(1,"ounce"));
        assertEquals(new Units(1,"oz"),Units.ozTbsp(2,"tbsp"));
        assertEquals(new Units(2,"oz"),Units.ozTbsp(4,"TAblespoon"));

        assertEquals(new Units(-1,"Invalid Units"),Units.ozTbsp(1,"mhgnfmjgh"));
    }
    @Test
    public void ounceAndCup()  {
        assertEquals(new Units(1,"cup"),Units.ozCup(8,"oz"));
        assertEquals(new Units(2,"cup"),Units.ozCup(16,"ounce"));
        assertEquals(new Units(8,"oz"),Units.ozCup(1,"cup"));
        assertEquals(new Units(16,"oz"),Units.ozCup(2,"CUP"));

        assertEquals(new Units(-1,"Invalid Units"),Units.ozCup(1,"mhgnfmjgh"));
    }
}
