import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void calc(String input) throws Exception {
        String[] values = input.split(" ");
        if (values.length != 3) throw new Exception("//т.к. неверный формат ввода");
        int numSystem = checkNumSystem(values);
        int num1 = toInt(values[0], numSystem);
        int num2 = toInt(values[2], numSystem);
        int result = operation(values[1], num1, num2);
        if ((result < 0) && (numSystem == 1)) throw new Exception("//т.к. в римской системе нет отрицательных чисел");
        System.out.println(toString1(result, numSystem));
    }

    public static int checkNumSystem(String[] values) throws Exception {
        Numeral[] R = Numeral.values();
        int numSystem1 = 0, numSystem2 = 0;
        for (Numeral numeral : R) {
            if (Objects.equals(values[0], numeral.getNumeral())) numSystem1 = 1;
            if (Objects.equals(values[2], numeral.getNumeral())) numSystem2 = 1;
        }
        if (numSystem1 == numSystem2) return numSystem1;
        else throw new Exception("//т.к. используются одновременно разные системы счисления");
    }

    public static int operation(String operator, int a, int b) throws Exception {
        return switch (operator) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> throw new Exception("/т.к. нет такой операции");
        };
    }

    public static int toInt(String string, int numSystem) {
        if (numSystem == 1) {
            Numeral[] R = Numeral.values();
            for (int i = 0; i < R.length; i++) {
                if (Objects.equals(string.toUpperCase(), R[i].getNumeral())) {
                    return i + 1;
                }
            }
        }
        return Integer.parseInt(string);
    }

    public static String toString1(int a, int numSystem) {
        if (numSystem == 0) return Integer.toString(a);
        Numeral[] R = Numeral.values();
        return R[a - 1].getNumeral();
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        calc(input);
    }
}