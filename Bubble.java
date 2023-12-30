import java.util.*;

public class Bubble {

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
        bubbleSort(array,size);
    }

    public  static void bubbleSort (int[] array, int size) {
        for (int i = 1; i < size ; i++) {
            int flag = 0;
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                    flag = 1;
                }
            }
            if (flag == 0) {
                break;
            }
        }
        System.out.println ("after sorting: "+Arrays.toString(array));
    }
}