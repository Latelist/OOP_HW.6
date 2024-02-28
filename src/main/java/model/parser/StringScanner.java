package model.parser;

import java.io.InputStream;
import java.util.Scanner;

public class StringScanner {
    public Scanner sc;

    public StringScanner() {
        this.sc = new Scanner(System.in);
    }

    public String scanUsersLine() {
        String result = sc.nextLine();
        return result;
    }
}
