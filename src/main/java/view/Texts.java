package view;

public class Texts {
    public void startMessage() {
        System.out.println("Это калькулятор комплексных чисел. Он принимает на вход числа вида: \n" +
                "a + bi\n" +
                "Здесь a — действительное число, а bi — мнимая часть. b — это коэффициент, а i — " +
                "мнимая единица.");
    }

    public void input1Message() {
        System.out.println("Введите первое число: ");
    }

    public void inputOperationMessage() {
        System.out.println("Введите операцию (+, -, *, /): ");
    }

    public void input2Message() {
        System.out.println("Введите второе число: ");
    }

    public void resultMessage(String resultToUser) {
        System.out.println("Результат вычислений: " + resultToUser);
    }

    public void continueMessage() {
        System.out.println("Посчитать еще? (Y/N): ");
    }

    public void goodByeMessage() {
        System.out.println("Спасибо за работу. До свидания. ");
    }

    public void invalidComplexNumberMessage() {
        System.out.println("Введите комплексное число в формате: a + bi. Иначе посчитать не получится.");
    }

    public void invalidOperationMessage() {
        System.out.println("Введите операцию — + , - , * , /. Другие операции не поддерживаются.");
    }
}
