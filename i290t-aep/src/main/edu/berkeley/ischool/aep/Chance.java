package edu.berkeley.ischool.aep;

/**
 * Created by divyakarthikeyan on 1/31/14.
 */
public class Chance {

    private final double probability;

    public Chance(double probability) {
        this.probability = probability;
    }

    public Chance() {
        this.probability = 0;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) return true;
        if (!(other instanceof Chance)) return false;
        return probability == ((Chance) other).probability;
    }

    @Override
    public int hashCode(){
        long longBits = Double.doubleToLongBits(probability);
        return (int) (longBits ^ (longBits >>> 32));
    }

    public Chance not() {
        return new Chance(1 - this.probability);
    }

    public Chance and(Chance prob) {
        return new Chance(this.probability * prob.probability);
    }

    public Chance and(Chance prob1, Chance prob2) {
        return new Chance(prob1.probability * prob2.probability);
    }

    public Chance or(Chance prob) {

        Chance notA = new Chance(this.probability).not();
        Chance notB = new Chance(prob.probability).not();
        Chance AandB = notA.and(notB);
        return AandB.not();
    }

}


