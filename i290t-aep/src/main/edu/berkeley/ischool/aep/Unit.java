package edu.berkeley.ischool.aep;


/**
 * Created by divyakarthikeyan on 2/14/14.
 */
public class Unit {

    public enum distance {FEET, YARDS, INCHES, MILES}
    public enum volume {TEASPOONS, TABLESPOONS, OUNCE, CUPS}
    public enum temperature{FAHRENHEIT, CELSIUS}
    distance d;
    volume v;
    temperature t;


    public static Unit FEET = new Unit(1, "Feet");
    public static Unit YARDS = new Unit(3, "Yards");
    public static Unit INCHES = new Unit(12, "Inches");
    public static Unit MILES = new Unit(1760 *3, "Miles");
    public static Unit TEASPOONS = new Unit(1, "Teaspoons");
    public static Unit TABLESPOONS = new Unit(3, "Tablespoons");
    public static Unit OUNCE = new Unit(6, "Ounce");
    public static Unit CUPS = new Unit(16*3, "Cups");
    public static Unit FAHRENHEIT = new Unit(1.0, "Fahrenheit");
    public static Unit CELSIUS = new Unit(1.8, "Celsius");


    private final double conversionFactor;
    private final String name;


    @Override
    public String toString() {
        return name;
    }


    public Unit( double conversionFactor, String name) {

        this.conversionFactor = conversionFactor;
        this.name = name;
    }

    public double convertTo(double size, Unit otherUnit){
        if (otherUnit.name.equalsIgnoreCase("FAHRENHEIT")) return (size * (conversionFactor / otherUnit.conversionFactor) +32);
        if (otherUnit.name.equalsIgnoreCase("CELSIUS")) return ((size-32) * conversionFactor / otherUnit.conversionFactor);
        return size * conversionFactor / otherUnit.conversionFactor;
    }

    public boolean isAddable (Unit otherUnit){
        try{
        if ((this.name.equalsIgnoreCase(t.valueOf(this.name.toUpperCase()).toString())) || otherUnit.name.equalsIgnoreCase(d.valueOf(otherUnit.name.toUpperCase()).toString())){
            return false;
        }
        }
        catch (IllegalArgumentException e) {

        }
        return true;
    }

    public boolean isConvertibleTo (Unit otherUnit){
        try{
        if (this.name.equalsIgnoreCase(d.valueOf(this.name.toUpperCase()).toString()))
        {

           return otherUnit.name.equalsIgnoreCase(d.valueOf(otherUnit.name.toUpperCase()).toString());
        }
        }
        catch (IllegalArgumentException e){
            try{

        if ( v.valueOf(this.name.toUpperCase())!=null && this.name.equalsIgnoreCase(v.valueOf(this.name.toUpperCase()).toString()))
        {

            return otherUnit.name.equalsIgnoreCase(v.valueOf(otherUnit.name.toUpperCase()).toString());
        }
            }
            catch (IllegalArgumentException e2){
                try{

                if ( t.valueOf(this.name.toUpperCase())!=null && this.name.equalsIgnoreCase(t.valueOf(this.name.toUpperCase()).toString()))
                {

                    return otherUnit.name.equalsIgnoreCase(t.valueOf(otherUnit.name.toUpperCase()).toString());
                }
                }
                catch (IllegalArgumentException e3) {
                    return false;
                }

            }

    }
        return false;
}
}
