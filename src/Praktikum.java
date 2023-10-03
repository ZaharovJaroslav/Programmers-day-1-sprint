import java.util.Scanner;

public class Praktikum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();
        System.out.print("Ввод: " + year + " ");
        if (year % 4 == 0) {
            System.out.print("Вывод: 12.08." + year);
        }else if(year % 4 != 0){
                System.out.print("Вывод: 13.08" + year);
        }
        }




    }

