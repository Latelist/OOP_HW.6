package model.parser;

import view.Texts;

public abstract class Parser {
    protected String line;
    protected boolean valid;
    protected Texts texts;

    public Parser(String line) {
        this.line = line;
        valid = true;
        texts = new Texts();
    }

    public boolean isValid() {
        return valid;
    }
}
