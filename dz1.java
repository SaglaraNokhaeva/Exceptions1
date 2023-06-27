//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
// и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов
// в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.


public class dz1 {
    public static int[] main(String[] args) {

        if (arr1.length != arr2.length) {
            System.out.println("Введите массивы равной длины: ");
        }

        public static int[] newArr ( int[] arr1, int[] arr2){
            int[] arr3 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr3[i] = arr1[i] - arr2[i];
            }
            return arr3;
        }
    }
}
