import java.util.*;

public class Insertion {

    public static void main (String args[]) {

        Scanner input = new Scanner (System.in);

        System.out.println ("Enter Array size:");
        int size = input.nextInt();
 
        int array[] = new int[size];

        System.out.println ("enter array Elements");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        System.out.println ("your Elements: "+Arrays.toString(array));
        insertionSort(array,size);
    }

    public static void insertionSort (int[] array, int size) {

        for (int i = 1; i < size; i++) {
            int value = array[i];
            int hole = i;
            while (hole > 0 && array[hole - 1] > value) {
                array[hole] = array[hole - 1];
                hole = hole - 1;
            }
            array[hole] = value;
        }
        System.out.println ("after sorting: "+Arrays.toString(array));
    }
}