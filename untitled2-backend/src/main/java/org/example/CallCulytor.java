package org.example;
import java.util.Scanner;
import java.util.StringTokenizer;
public class CallCulytor {
    double div(double a, double b) {
        if (b == 0) {
            System.out.println("На ноль делить нельзя!!!");
        }
        double result = 0;
        System.out.println(result += a / b);
        return result;
    }
    double sum(double a, double b) {
        double result = 0;
        System.out.println(result += a + b);
        return result;
    }
    double pow(double a, double b) {
        double result = 0;
        System.out.println(result += Math.pow(a, b));
        return result;
    }

    double sub(double a, double b) {
        double result = 0;
        System.out.println(result += (a - b));
        return result;
    }

    double mult(double a, double b) {
        double result = 0;
        System.out.println(result += (a * b));
        return result;
    }
    double divRem(double a, double b) {
        double result = 0;
        System.out.println(result += (a % b));
        return result;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String abc = scanner.nextLine();
        StringTokenizer st = new StringTokenizer(abc, " +-*/^%", true);
        double operand1 = Double.parseDouble(st.nextToken().trim());
        String operator = st.nextToken().trim();
        double operand2 = Double.parseDouble(st.nextToken().trim());
        double result = 0;
        CallCulytor callCulytor = new CallCulytor();
        boolean x = true;
        while (x) {
            switch (operator) {
                case "/" -> callCulytor.div(operand1, operand2);
                case "+" -> callCulytor.sum(operand1, operand2);
                case "-" -> callCulytor.sub(operand1, operand2);
                case "*" -> callCulytor.mult(operand1, operand2);
                case "^" -> callCulytor.pow(operand1, operand2);
                case "%" -> callCulytor.divRem(operand1, operand2);
                default -> System.out.println("Неизвестный операто");


            }
            String abc2 = scanner.nextLine();
            if (abc2.equalsIgnoreCase("restart")) { // проверяем, хочет ли пользователь запустить программу заново
                main(null); // вызываем метод main снова
                return; // завершаем текущий вызов main
            }
            if (abc2.equalsIgnoreCase("exit")) {
                System.out.println("Конец програмы");
                x = false;
            }
        }
    }

}





