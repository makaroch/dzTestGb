package dz3;

public class Task1AndTask2 {

    public static boolean evenOddNumber(int num){

        /*Напишите тесты, покрывающие на 100% метод evenOddNumber, который проверяет, является ли переданное число
        четным или нечетным. (код приложен в презентации)*/

        return num % 2 == 0;
    }

    public static boolean numberInInterval(int num){
        /*Разработайте и протестируйте метод numberInInterval, который проверяет,
        попадает ли переданное число в интервал (25;100).*/
        return num > 25 && num < 100;
    }
}
