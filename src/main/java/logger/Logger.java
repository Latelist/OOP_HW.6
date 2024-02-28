package logger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private String stringToLog;
    private String path;
    private File file;
    private FileWriter fileWriter;
    private LocalDateTime now;
    private DateTimeFormatter dateTimeFormatter;
    private String formattedDateTime;
    public LoggerTexts loggerTexts;
    public Logger() throws IOException {
        stringToLog = "";
        path = "CalculatorLog.txt";
        file = new File(path);
        fileWriter = new FileWriter(file, true);
        now = LocalDateTime.now();
        dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        formattedDateTime = now.format(dateTimeFormatter);
        loggerTexts = new LoggerTexts();
    }

    public void writeString(String line) throws IOException {
        stringToLog = line;
        now = LocalDateTime.now();
        formattedDateTime = now.format(dateTimeFormatter);
        fileWriter.write(formattedDateTime + " " + stringToLog);
        fileWriter.flush();
    }
}
