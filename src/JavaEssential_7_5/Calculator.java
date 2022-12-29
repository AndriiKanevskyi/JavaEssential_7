package JavaEssential_7_5;

import java.util.Scanner;

public  class Calculator  {

    public double add(double number1, double number2){
        return number1+number2;
    }
    public double sub(double number1, double number2){
        return number1-number2;
    }
    public double mul(double number1, double number2){
        return number1*number2;
    }
    public double div(double number1, double number2){

        if (number2==0){throw new ArithmeticException("Деление на ноль недопустимо!");}

        return number1/number2;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        double num1;
        double num2;
        char oper;

        System.out.println(" Введите первый операнд ");
        num1=sc.nextDouble();
        System.out.println(" Введите второй операнд ");
        num2=sc.nextDouble();
        System.out.println(" Введите операцию которую нужно выполнить '+' '-' '*' '/' ");
        oper=sc.next().charAt(0);

        switch (oper){
            case '+':
                System.out.println(calculator.add(num1,num2));
                break;
            case '-':
                System.out.println(calculator.sub(num1,num2));
                break;
            case '*':
                System.out.println(calculator.mul(num1,num2));
                break;
            case '/':
                System.out.println(calculator.div(num1,num2));
                break;
            default:
                System.out.println("Неправильная операция");
        }
    }
}
