package model.decoder;

public class Decoder {
    private double[] result;
    private String resultToUser;
    public Decoder() {
        result = new double[2];
        resultToUser = "";
    }

    public void setResult(double[] result) {
        this.result = result;
        decode();
    }

    public void decode() {
        if (result[1] < 0) {
            resultToUser = result[0] + " – " + -result[1] + "i";
        } else {
            resultToUser = result[0] + " + " + result[1] + "i";
        }
    }

    public String getResultToUser() {
        return resultToUser;
    }
}
