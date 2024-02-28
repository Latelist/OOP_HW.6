package controller;

import logger.Logger;
import model.calculator.Calculator;
import model.decoder.Decoder;
import model.parser.ComplexNumberParser;
import model.parser.OperationParser;
import model.parser.StringScanner;
import model.states.States;
import view.Texts;

import java.io.IOException;

public class Controller {
    public Calculator calculator;
    private String line;
    private ComplexNumberParser complexNumberParser1;
    private ComplexNumberParser complexNumberParser2;
    private OperationParser operationParser;
    private StringScanner stringScanner;
    private States states;
    private Texts texts;
    private Decoder decoder;
    private Logger logger;

    public Controller() throws IOException {
        calculator = new Calculator();
        stringScanner = new StringScanner();
        decoder = new Decoder();
        texts = new Texts();
        states = States.ON;
        complexNumberParser1 = new ComplexNumberParser(" ");
        complexNumberParser2 = new ComplexNumberParser(" ");
        operationParser = new OperationParser(" ");
        logger = new Logger();
        logger.writeString(logger.loggerTexts.startMessageLog());
        texts.startMessage();
    }

    public void calculatorCycle() throws IOException {
        while (states.equals(States.ON)) {
            texts.input1Message();
            line = stringScanner.scanUsersLine();
            logger.writeString(logger.loggerTexts.inputLog(line));
            complexNumberParser1.setLine(line);
            while (!complexNumberParser1.isValid()) {
                line = stringScanner.scanUsersLine();
                logger.writeString(logger.loggerTexts.inputLog(line));
                complexNumberParser1.setLine(line);
            }
            calculator.setFirstComplex(complexNumberParser1.getPartsOfComplex());


            texts.inputOperationMessage();
            line = stringScanner.scanUsersLine();
            logger.writeString(logger.loggerTexts.inputLog(line));
            operationParser.setOperation(line);
            while (!operationParser.isValid()) {
                line = stringScanner.scanUsersLine();
                logger.writeString(logger.loggerTexts.inputLog(line));
                operationParser.setOperation(line);
            }
            calculator.setOperation(operationParser.getOperation());

            texts.input2Message();
            line = stringScanner.scanUsersLine();
            logger.writeString(logger.loggerTexts.inputLog(line));
            complexNumberParser2.setLine(line);
            while (!complexNumberParser2.isValid()) {
                line = stringScanner.scanUsersLine();
                logger.writeString(logger.loggerTexts.inputLog(line));
                complexNumberParser2.setLine(line);
            }
            calculator.setSecondComplex(complexNumberParser2.getPartsOfComplex());

            calculator.calculate();
            decoder.setResult(calculator.getResult());
            logger.writeString(logger.loggerTexts.resultLog(decoder.getResultToUser()));
            texts.resultMessage(decoder.getResultToUser());

            texts.continueMessage();
            line = stringScanner.scanUsersLine();
            if (line.equals("N")) {
                states = States.OFF;
            }
        }
        texts.goodByeMessage();
        logger.writeString(logger.loggerTexts.finishLog());
    }
}
