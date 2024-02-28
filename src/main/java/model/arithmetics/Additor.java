package model.arithmetics;

public class Additor extends Operator{
    public Additor() {
        super();
    }
    public void add() {
        result[0] = complex1[0] + complex2[0];
        result[1] = complex1[1] + complex2[1];
    }
}
