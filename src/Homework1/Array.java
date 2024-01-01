package Homework1;
//Описание задания.
//
// 1 уровень сложности: - Инвертировать массив, то есть изменить порядок элементов в массиве на обратный.
//
//
//Поиск третьего по величине числа в массиве

public class Array {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, -1, -2, -3, -4, -5, -6};

        for (int i =0; i < array.length; i++) {
            System.out.print(" "+ array[i]);
        }
        System.out.println();
        for (int i = array.length-1; i >=0 ; i--) {
            System.out.print(" "+ array[i]);
        }
        System.out.println();
    //Поиск третьего по величине числа в массиве

        int index=0;
        for (int i=0; i<array.length;i++){
            if(array[i]==4){
                index=i;
            }
        }
        System.out.println("The third value of array:  "+index);
    }
}





