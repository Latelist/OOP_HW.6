package model.arithmetics;

public class Multiplicator extends Operator {
    public Multiplicator() {
        super();
    }

    public void multiply() {
        double[] inter = new double[4];
        inter[0] = complex1[0] * complex2[0];
        inter[1] = complex1[0] * complex2[1];
        inter[2] = complex1[1] * complex2[0];
        inter[3] = complex1[1] * complex2[1];

        result[0] = inter[0] + (-inter[3]);
        result[1] = inter[1] + inter[2];
    }
}
