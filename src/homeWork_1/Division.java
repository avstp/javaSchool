package homeWork_1;

import java.util.Scanner;

public class Division {
    public static void main(String[] args){
        int a, b;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите натуральное число - делимое: ");
        a = in.nextInt();
        System.out.print("Введите натуральное число - делитель: ");
        b = in.nextInt();
        in.close();

        int intPart=a/b; //целая честь от деления a/b
        int mod = a%b; // остаток от деления a/b

        System.out.println(a+"/"+b+" = "+intPart+" и "+mod+" в остатке");
    }
}
