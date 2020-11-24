package homeWork_2;
import java.util.Scanner;

public class Shell {
    public static void shell( Command[] mas){
        Scanner in = new Scanner(System.in);
        String str;

        boolean exit = false; //переменная для окончания работы программы
        boolean newCommand = false; //переменная для остановки перебора команд в массиве (если введенная строка равна наименованию одной из команд)
        while (!exit) {
            System.out.println("=============================================");
            System.out.println("Введите одну из трех команд: Time, Date, Exit");
            str = in.nextLine();
            newCommand = false;
            for (int i = 0; i < mas.length && !newCommand; i++) {
                if (str.equalsIgnoreCase(mas[i].getName())) { //проверка соответствий наименования команд независимой от регистра
                    newCommand = true;
                    System.out.print("Команда " + mas[i].getName() + ": ");
                    mas[i].execute();
                    if (str.equalsIgnoreCase("Exit")) { //если с консоли ввели команду "Exit", то останавливаем Shell
                        exit = true;
                    }
                }
            }
        }

    }
    public static void main(String[] args) {
        Command[] mas = {new DateCommand(), new TimeCommand(), new ExitCommand()}; // инициализация массива
        shell(mas);
    }

}
