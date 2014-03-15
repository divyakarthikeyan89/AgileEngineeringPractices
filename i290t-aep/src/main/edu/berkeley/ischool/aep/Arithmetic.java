package edu.berkeley.ischool.aep;

/**
 * Created by divyakarthikeyan on 2/21/14.
 */
public class Arithmetic extends Quantity {

    public Arithmetic (Unit unit, double value){
        super(unit,value);
    }

    public Quantity plus(Quantity otherQuantity) throws  RuntimeException{
        if ((this.unit.isAddable(otherQuantity.unit)) && this.unit.isConvertibleTo(otherQuantity.unit)) {
            return new Quantity(otherQuantity.unit, this.unit.convertTo(this.value, otherQuantity.unit) + otherQuantity.value);
        }
        else {
            throw new RuntimeException();
        }


    }
}
