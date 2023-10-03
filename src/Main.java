
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();
        System.out.print("Ввод: " + year + " ");

        if (isLeapYear(year)) {
            System.out.print("Вывод 12.09." + year );
        }else{
            System.out.print("Вывод 13.09." + year );
        }
    }


    public static boolean isLeapYear(int year) {
        if(year % 4 == 0) {
            if (year % 400 == 0) {
            }return true;


        }else{
            return false;
        }
    }
}