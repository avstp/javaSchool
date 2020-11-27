package main.java.homeWork_1;

public class BubbleSortForTest {
    public static void main(String[] args){
        //инициализация массива натуральных чисел
        int[] mas = {18, 20, 9, 63, 8, 46, 7, 4, 15, 99, 52, 1, 89, 3, 6};
        //алгоритм сортировки - пузырек
        mas = sort(mas);
        //вывод в консоль отсортированног массива
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + "  ");
        }
    }

    public static int[] sort(int[] mas) {
        int t;
        for(int j = 0; j < mas.length; j++){
            for(int i = 0; i < mas.length - 1; i++){
                if(mas[i] < mas[i+1]){
                    t = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = t;
                }
            }
        }
        return mas;
    }
}
