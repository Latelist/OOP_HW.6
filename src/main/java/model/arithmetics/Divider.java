package model.arithmetics;

public class Divider extends Operator{
    private Multiplicator multiplicator1;
    private Multiplicator multiplicator2;
    public Divider() {
        super();
        multiplicator1 = new Multiplicator();
        multiplicator2 = new Multiplicator();
    }

    public void divide() {
        double[] conjugate = new double[]{complex2[0], -complex2[1]};

        multiplicator1.setComplex1(complex1);
        multiplicator1.setComplex2(conjugate);
        multiplicator1.multiply();
        complex1 = multiplicator1.getResult();

        multiplicator2.setComplex1(complex2);
        multiplicator2.setComplex2(conjugate);
        multiplicator2.multiply();
        complex2 = multiplicator2.getResult();

        double denominator = complex2[0];

        result[0] = complex1[0] / denominator;
        result[1] = complex1[1] / denominator;
    }
}
