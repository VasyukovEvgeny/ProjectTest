import java.lang.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("1. Ввести пример.");
        System.out.println("2. Продолжить работать с предыдущим ответом.");
        System.out.println("3. Выход");
        String second_number = "";
        int first_number_int=0;
        int second_number_int=0;
        int i=0;
        int scr_int = 0;
        while (scr_int < 3){
            Scanner scr = new Scanner(System.in);
            scr_int = scr.nextInt();
            switch (scr_int) {
                case 1:
                    Scanner scr_1 = new Scanner(System.in);
                    String scr_1_string = scr_1.nextLine();
                    String scr_1_string_arr[] = scr_1_string.split(" ");
                    String first_number = scr_1_string_arr[0];
                    first_number_int = Integer.parseInt(first_number);
                    String symbol = scr_1_string_arr[1];
                    if (!symbol.equals("!")) {
                        second_number = scr_1_string_arr[2];
                        second_number_int = Integer.parseInt(second_number);
                        switch(symbol){
                            case "+":
                                System.out.println(Sum(first_number_int,second_number_int));
                                break;
                            case "-":;

                                System.out.println(Diff(first_number_int,second_number_int));
                                break;
                            case "*":;
                                System.out.println(Mult(first_number_int,second_number_int));
                                break;
                            case "/":;
                                System.out.println(Div(first_number_int,second_number_int));
                                break;
                            case "^":
                                System.out.println(Deg(first_number_int,second_number_int));
                                break;
                            case "?":
                                System.out.println(Comp(first_number_int,second_number_int));
                                break;
                            default:;
                        }
                    }
                    else switch(symbol) {
                        case "!":
                            System.out.println(Fact(first_number_int));
                            break;
                        default:;
                    }
                    break;
                case 2:
                    if (first_number_int == 0)
                        System.out.println("Недоступно");
                    else{
                        System.out.println("1. Сложение");
                        System.out.println("2. Вычитание");
                        System.out.println("3. Умножение");
                        System.out.println("4. Деление");
                        System.out.println("5. Факториал");
                        System.out.println("6. Возведение в степень");
                        System.out.println("7. Сравнение");
                        System.out.println("0. Назад");
                    Scanner scr_new = new Scanner(System.in);
                    int scr_int_new = 0;
                    scr_int_new = scr_new.nextInt();
                        if (scr_int_new != 5) {
                            switch(scr_int_new){
                                case 1:
                                    System.out.println(Sum(first_number_int,second_number_int));
                                    break;
                                case 2:
                                    System.out.println(Diff(first_number_int,second_number_int));
                                    break;
                                case 3:
                                    System.out.println(Mult(first_number_int,second_number_int));
                                    break;
                                case 4:
                                    System.out.println(Div(first_number_int,second_number_int));
                                    break;
                                case 6:
                                    System.out.println(Deg(first_number_int,second_number_int));
                                    break;
                                case 7:
                                    System.out.println(Comp(first_number_int,second_number_int));
                                    break;
                                case 0:
                                    System.out.println("1. Ввести пример.");
                                    System.out.println("2. Продолжить работать с предыдущим ответом.");
                                    System.out.println("3. Выход");
                                default:;
                            }
                        }
                        else switch(scr_int_new) {
                            case 5:
                                System.out.println(Fact(first_number_int));
                                break;
                            default:;
                        }}

                    break;
                case 3:
                    break;
                default: ;}
            }
            i++;
        }


    private static int Sum(int first_number, int second_number) {
        return first_number + second_number;
    }
    private static int Diff(int first_number, int second_number) {
        return first_number - second_number;
    }
    private static int Mult(int first_number, int second_number) {
        return first_number * second_number;
    }
    private static int Div(int first_number, int second_number) {
        return first_number / second_number;
    }
    private static int Fact(int first_number) {
        int fact = 1;
        int i = 1;
        for (i = 1; i < first_number; i++) {
            fact = fact * (i + 1);
        }
        return fact;
    }
    private static int Deg(int first_number, int second_number) {
        int deg = 1;
        int i = 1;
        for (i = 1; i <= second_number; i++) {
            deg = deg * first_number;
        }
        return deg;
    }
    private static String Comp(int first_number, int second_number) {
        String Comp = "";
        String Comp_new = "";
        int k = 0;
        if (first_number > second_number)  k = 1;
        if (first_number < second_number)  k = 2;
        if (first_number == second_number)  k = 3;
        switch (k) {
            case 1:
                Comp_new = Comp.format("%d > %d",first_number,second_number);
                break;
            case 2:
                Comp_new = Comp.format("%d < %d",first_number,second_number);
                break;
            case 3:
                Comp_new = Comp.format("%d = %d",first_number,second_number);;
            default: ;
        };
        return Comp_new;
    };
}
