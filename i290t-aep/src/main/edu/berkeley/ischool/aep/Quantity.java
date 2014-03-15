package edu.berkeley.ischool.aep;

/**
 * Created by divyakarthikeyan on 2/14/14.
 */
public class Quantity {

    protected final Unit unit;
    protected final double value;

  public Quantity(Unit unit, double value){
      this.unit = unit;
      this.value = value;
  }



    @Override
    public boolean equals(Object other) {

        if (other == this) return true;
        if (!(other instanceof Quantity)) return false;
        Quantity otherQuantity =  (Quantity) other;
        if (this.unit.isConvertibleTo(otherQuantity.unit)) {
        double otherValue = otherQuantity.unit.convertTo(otherQuantity.value, this.unit);
        return Math.abs(this.value - otherValue) < 0.01;
        }
        else return false;
    }

    @Override
    public String toString(){
        return value +" "+ unit;
    }

    @Override
    public int hashCode(){
        long longBits = Double.doubleToLongBits(value);
        return (int) (longBits ^ (longBits >>> 32));
    }


    public boolean isBetterThan(Quantity other) throws RuntimeException {
        if (!(other instanceof Quantity)) return false;
        Quantity otherQuantity =  (Quantity) other;
        if (this.unit.isConvertibleTo(otherQuantity.unit)) {
            double otherValue = otherQuantity.unit.convertTo(otherQuantity.value, this.unit);
            return this.value > otherValue;
        }

        else{
            throw new RuntimeException("units are incomparable");
        }
    }
}
