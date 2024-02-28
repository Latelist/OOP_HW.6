package logger;

public class LoggerTexts {

    public String startMessageLog() {
        return "Калькулятор запустился.\n";
    }

    public String inputLog(String line) {
        return "Пользователь ввел: " + line + "\n";
    }

    public String resultLog(String line) {
        return "Результат вычислений: " + line + "\n \n";
    }

    public String finishLog() {
        return "Калькулятор завершил работу. \n \n";
    }

}
