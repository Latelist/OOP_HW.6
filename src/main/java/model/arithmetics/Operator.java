package model.arithmetics;

public abstract class Operator {
    protected double[] complex1;
    protected double[] complex2;
    protected double[] result;
    public Operator() {
        complex1 = new double[2];
        complex2 = new double[2];
        result = new double[2];
    }

    public void setComplex1(double[] complex1) {
        this.complex1 = complex1;
    }

    public void setComplex2(double[] complex2) {
        this.complex2 = complex2;
    }

    public double[] getComplex1() {
        return complex1;
    }

    public double[] getComplex2() {
        return complex2;
    }

    public double[] getResult() {
        return result;
    }

}
