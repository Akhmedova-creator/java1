package Lessons;

public class Main {
   //задание 1.1.Создание main
    public static void main(String[] args) {
        //Задание 1.2.Создание и инициализация примитивных и ссылочных  переменных
        System.out.println("Задание 1.2");
        byte variablebyte=12;
        short variableshort=333;
        char variablechar='c';
        int variableint=3225;
        long variablelong=5555l;
        float variablefloat=5.5f;
        double variabledouble=33.3333;
        boolean variableboolean=true;
        String variablestring="Ссылочные типы переменных";
        //Вывод на консоль
        System.out.println(variablebyte);
        System.out.println(variableshort);
        System.out.println(variablechar);
        System.out.println(variableint);
        System.out.println(variablelong);
        System.out.println(variablefloat);
        System.out.println(variabledouble);
        System.out.println(variableboolean);
        System.out.println(variablestring);
        System.out.println("");

        //Задание 1.3.Метод для вычисления.
        System.out.println("Задание 1.3");
        double resultCalculation=Calculation(3.0,4.0,5.5,6.5);
        System.out.println("Результат  вычисления метода CalCulation " +resultCalculation);
        System.out.println("");

        //Задание 1.4 Метод для принадлежности  двух чисел отрезку
        System.out.println("Задание 1.4");
        boolean resultfuncIsBeRange=IsBeRange(11,10);
        System.out.println(resultfuncIsBeRange ? "Сумма принадлежит отрезку [10,20]":"Сумма не принадлежит отрезку [10,20]"); //вывод принадлежности суммы 2 х чисел отрезку [10,20]
        System.out.println("");

        //Задание 1.5 Метод для определения знака целого числа
        System.out.println("Задание 1.5");
        SignNumber(-2);
        System.out.println("");

        //Задание 1.6. Метод, определяющий отрицательные числа.
        System.out.println("Задание 1.6");
        System.out.println( IsNegative(-10)? "Отрицательное число":"Не является отрицательным числом");
        System.out.println("");

        //Задание 1.7. Метод, ыводящий строку.
        System.out.println("Задание 1.7");
        ShowMessage("Метод");
        System.out.println("");

        //Задание 1.8.Определение высокостного года
        System.out.println("Задание 1.8");
        ShowLeapYear(2020);
        System.out.println("");



    }

    private static double Calculation(double a,double b, double c, double d){ // Задание 1.3
        double result=0.0;
        result = a * (b + (c / d));
        return result;

    }
    private static boolean IsBeRange(int a, int b){ //Задание 1.4
        boolean result=false;
        if(((a+b)<=20)&&((a+b)>=10)) { //проверка суммы 2 х введенных чисел
            result=true;
        }else
            result=false;
        return result;
    }
    private static void SignNumber(int number){// задание 1.5
        System.out.println(number>=0 ? "Положительное число": "отрицательное число");
    }

    private static boolean IsNegative(int number){//Задание 1.6
    boolean result=false;
    if(number<0)
        result=true;
    else
        result=false;
    return result;
    }
    private static  void ShowMessage(String str ){//Задание 1.7
    System.out.println(str);
    }
    private static void ShowLeapYear(int year){//Задание 1.8
        if(((year%4==0)&&(year%100!=0))||(year%400==0))
            System.out.println(year+"- Высокосный год");
        else
            System.out.println(year+"- Не высокосный год");
        }
    }

