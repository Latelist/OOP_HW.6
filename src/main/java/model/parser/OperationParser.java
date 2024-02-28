package model.parser;

public class OperationParser extends Parser implements ParserService {

    private char operation;

    public OperationParser(String line) {
        super(line);
        operation = ' ';
    }

    public void setOperation(String line) {
        this.line = line;
        parse();
    }

    @Override
    public void parse() {
        operation = line.charAt(0);
        if (operation != '*' && operation != '-' && operation != '+' && operation != '/') {
            texts.invalidOperationMessage();
            valid = false;
        } else {
            valid = true;
        }
    }

    public char getOperation() {
        return operation;
    }
}
