package model.calculator;

import model.arithmetics.Additor;
import model.arithmetics.Divider;
import model.arithmetics.Multiplicator;
import model.arithmetics.Substractor;

public class Calculator {
    private double[] firstComplex;
    private double[] secondComplex;
    private char operation;
    private double[] result;
    private final Additor additor;
    private final Substractor substractor;
    private final Multiplicator multiplicator;
    private final Divider divider;

    public Calculator() {
        additor = new Additor();
        substractor = new Substractor();
        multiplicator = new Multiplicator();
        divider = new Divider();
    }

    public void calculate() {
        switch (operation) {
            case '+':
                additor.setComplex1(firstComplex);
                additor.setComplex2(secondComplex);
                additor.add();
                result = additor.getResult();
                break;
            case '-':
                substractor.setComplex1(firstComplex);
                substractor.setComplex2(secondComplex);
                substractor.substract();
                result = substractor.getResult();
                break;
            case '*':
                multiplicator.setComplex1(firstComplex);
                multiplicator.setComplex2(secondComplex);
                multiplicator.multiply();
                result = multiplicator.getResult();
                break;
            case '/':
                divider.setComplex1(firstComplex);
                divider.setComplex2(secondComplex);
                divider.divide();
                result = divider.getResult();
        }
    }

    public void setFirstComplex(double[] firstComplex) {
        this.firstComplex = firstComplex;
    }

    public void setSecondComplex(double[] secondComplex) {
        this.secondComplex = secondComplex;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public double[] getResult() {
        return result;
    }
}
