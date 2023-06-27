//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
// и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов
// в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class dz1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        System.out.println("Введите размерность первого массива: ");
        int size1 = input.nextInt();
        int[] arr1 = new int[size1];
        arr1 = createArr(size1, random);
        System.out.println(Arrays.toString(arr1));

        System.out.println("Введите размерность второго массива: ");
        int size2 = input.nextInt();
        int[] arr2 = new int[size2];
        arr2 = createArr(size2, random);
        System.out.println(Arrays.toString(arr2));
        printCodExeption(array(arr1, arr2),arr1, arr2);
    }

    public static int array(int[] arr1, int[] arr2){
        boolean flag = false;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == 0) {
                flag=true;
            }
        }
        if (arr1==null) {
            return -1;
        }
        if (arr2==null) {
            return -2;
        }
        if (arr1.length!=arr2.length){
            return -3;
        }
        if (flag==true){
            return -4;
        }
        return 0;
    }


    private static int[] createArr(int size, Random random) {
        int upperBound = 100;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(upperBound);
        }
        return arr;
    }


    private static void printCodExeption(int cod, int[] arr1, int[] arr2){
        if (cod==-1){
            System.out.println("Вместо первого массива пришёл null");
        } else if (cod==-2) {
            System.out.println("Вместо второго массива пришёл null");
        } else if (cod==-3) {
            System.out.println("Массивы имеют разную размерность");
        } else if (cod==-4) {
            System.out.println("Ошибка: деление на ноль");
            System.out.println("Массив, элементы которого равны разности соответсвующих элементов: ");
            System.out.println(Arrays.toString(newDifferenceArr(arr1, arr2)));
        }
        else if (cod==0){
            System.out.println("Массив, элементы которого равны разности соответсвующих элементов: ");
            System.out.println(Arrays.toString(newDifferenceArr(arr1, arr2)));
            System.out.println("Массив, элементы которого равны частному соответсвующих элементов: ");
            System.out.println(Arrays.toString(newDivArr(arr1, arr2)));
            }
        }

    public static int[] newDifferenceArr (int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i] - arr2[i];
        }
        return arr3;
    }
        public static int[] newDivArr (int[] arr1, int[] arr2){
            int[] arr3 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr3[i] = arr1[i]/arr2[i];
            }
            return arr3;
        }


}