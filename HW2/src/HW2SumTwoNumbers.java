import java.util.Scanner; // импортируем библиотеку util в которой содержиться класс scanner

public class HW2SumTwoNumbers {
    public static void main(String[] args){
            Scanner scan1 = new Scanner(System.in); // обьявляем о создании нового сканера
            System.out.println("Введите два числа"); // предлогаем пользователю ввести два числа
            double num1 = scan1.nextDouble(); // получаем число 1
            double num2 = scan1.nextDouble(); // получаем число 2
            double res = (num1+num2)/2; // высчитываем среднее арифметическое
            System.out.println("Среднее арифметическое равно " + res); // Выводим результат в консоль
        }
    }