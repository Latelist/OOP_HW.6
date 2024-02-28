package model.arithmetics;

public class Substractor extends Operator {
    public Substractor() {
        super();
    }

    public void substract() {
        result[0] = complex1[0] - complex2[0];
        result[1] = complex1[1] - complex2[1];
    }
}
