package edu.berkeley.ischool.aep;

/**
 * Understands relationship between various units of measurements
 */
public class Units {
    private final double measure;
    private final String unit;

    @Override
    public boolean equals(Object other) {
        if (other == this) return true;
        if (!(other instanceof Units)) return false;
        return measure == ((Units) other).measure;

    }

    @Override
    public int hashCode(){
        long longBits = Double.doubleToLongBits(measure);
        return (int) (longBits ^ (longBits >>> 32));
    }


    public Units(double measure, String unit ){
        this.measure = measure;
        this.unit = unit;
    }

    public static Units inchesFeet(double quantity, String inputUnit){

        inputUnit = inputUnit.toLowerCase();
        //System.out.println(size);
        if(inputUnit.equals("inches") || inputUnit.equals("in")){
            return new Units(quantity/12, "ft");
        }
        else if(inputUnit.equals("feet") || inputUnit.equals("ft")){
            return new Units(quantity*12,"inches");
        }
        else {
            return new Units(-1, "Invalid Unit");

        }
    }

    public static Units feetYard(double quantity, String inputUnit) {

        inputUnit = inputUnit.toLowerCase();
        //System.out.println(size);
        if(inputUnit.equals("feet") || inputUnit.equals("ft")){
            return new Units(quantity/3, "yard");
        }
        else if(inputUnit.equals("yard") || inputUnit.equals("yrd")){
            return new Units(quantity*3,"ft");
        }
        else {
            return new Units(-1, "Invalid Unit");
        }
    }

    public static Units yardMile(double quantity, String inputUnit)  {

        inputUnit = inputUnit.toLowerCase();
        //System.out.println(size);
        if(inputUnit.equals("yard") || inputUnit.equals("yrd")){
            return new Units(quantity/1760, "mile");
        }
        else if(inputUnit.equals("mile")){
            return new Units(quantity*1760,"yard");
        }
        else {
            return new Units(-1, "Invalid Unit");
        }
    }

    public static Units tbspTsp(double quantity, String inputUnit)  {

        inputUnit = inputUnit.toLowerCase();
        //System.out.println(size);
        if(inputUnit.equals("tbsp") || inputUnit.equals("tablespoon")){
            return new Units(quantity*3,"tsp");
        }
        else if(inputUnit.equals("tsp") || inputUnit.equals("teaspoon")){
            return new Units(quantity/3,"tbsp");
        }
        else {
            return new Units(-1, "Invalid Unit");
        }
    }

    public static Units ozTbsp(double quantity, String inputUnit)  {

        inputUnit = inputUnit.toLowerCase();
        //System.out.println(size);
        if(inputUnit.equals("oz") || inputUnit.equals("ounce")){
            return new Units(quantity*2,"tbsp");
        }
        else if(inputUnit.equals("tbsp") || inputUnit.equals("tablespoon")){
            return new Units(quantity/2,"oz");
        }
        else {
            return new Units(-1, "Invalid Unit");
        }
    }

    public static Units ozCup(double quantity, String inputUnit)  {

        inputUnit = inputUnit.toLowerCase();
        //System.out.println(size);
        if(inputUnit.equals("oz") || inputUnit.equals("ounce")){
            return new Units(quantity/8, "cup");
        }
        else if(inputUnit.equals("cup")){
            return new Units(quantity*8,"oz");
        }
        else {
            return new Units(-1, "Invalid Unit");
        }
    }

}
