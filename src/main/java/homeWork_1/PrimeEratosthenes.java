package homeWork_1;

public class PrimeEratosthenes {
    public static void main(String[] args) {
        int[] allNumbers = new int[99]; //массив с числами от 2 до 100
        //инициализация массива - задание значение от 2 до 100
        int j = 2;
        for (int i = 0; i < 99; i++) {
            allNumbers[i] = j;
            j++;
        }
       //алгоритм поиска постых чисел - Решето Эратосфена (вольная интерпретация )
        int p=2; //первое простое число в последовательности [2;100]
        for (int ii = 0; ii < 99; ii++) {
            if (allNumbers[ii] != 0) {
                p = allNumbers[ii];  //последовательно присваиваем простые числа из [2;100]: p=2, p=3, p=5;
                for (int i = ii + 2; i < 99; i++) {
                    if (allNumbers[i] % p == 0) { //если в [2;100] находится кратное p число - заменяем на ноль
                        allNumbers[i] = 0;
                    }
                }
            }
        }
        //вывод в консоль простых чисел из [2; 100]
        System.out.println("Простые числа из [2; 100]:");
        for (int i = 0; i < 99; i++) {
            if(allNumbers[i] != 0){
                System.out.print(allNumbers[i] + "  ");
            }
        }
        System.out.println();
       //вывод в консоль Решето Эратосфена
        System.out.println("Решето Эратосфена:");
        for (j = 0; j < 10; j++) {
            for (int i = 10 * j; i < 10 * j + 10; i++) {
                System.out.print(allNumbers[i] + "  ");
            }
            System.out.println();
        }
    }
}
