package model.parser;

import view.Texts;

public class ComplexNumberParser extends Parser implements ParserService {

    public String line;
    private double[] partsOfComplex;
    private boolean valid;
    public ComplexNumberParser(String line) {
        super(line);
        partsOfComplex = new double[2];
    }

    // 12 + 23i
    public void parse() {
        StringBuilder strb = new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
            if (Character.isDigit(line.charAt(i))) {
                strb.append(line.charAt(i));
            } else if (line.charAt(i) == '-'){
                strb.append("-");
            } else {
                strb.append(" ");
            }
        }
        for (int i = 0; i < strb.length(); ++i) {
            if (strb.charAt(i) == '-') {
                strb.delete(i+1, i+2);
            }
        }
        String digits = strb.toString();
        String[] separateDigits = digits.split("\\s+");
        try {
            partsOfComplex[0] = Integer.parseInt(separateDigits[0]);
            partsOfComplex[1] = Integer.parseInt(separateDigits[1]);
            valid = true;
        } catch (Exception e) {
            texts.invalidComplexNumberMessage();
            valid = false;
        }
    }


    public String toString(double[] partsOfComplex) {
        StringBuilder strb = new StringBuilder();
        for (int i = 0; i < partsOfComplex.length; ++i) {
            strb.append(partsOfComplex[i]).append(" ");
        }
        return strb.toString();
    }

    public void setLine(String newLine) {
        this.line = newLine;
        parse();
    }

    public double[] getPartsOfComplex() {
        return partsOfComplex;
    }

    public boolean isValid() {
        return valid;
    }
}
