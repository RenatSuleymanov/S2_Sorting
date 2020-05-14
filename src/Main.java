import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Введите массив:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        //Сортировка вставками
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while(j >= 0 && current < array[j]) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
        System.out.println ("Вывод отсортированного массива:");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + array[i]);
        }
    }
}