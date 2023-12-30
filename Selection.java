import java.util.*;

public class Selection {

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
        selectionSort(array,size);
}

    public static void selectionSort (int[] array, int size) {

        for (int i = 0; i < size - 1; i++) {
            int firstIndex = i;
            for (int j = i + 1; j < size ; j++) {
                  if (array[j] < array[firstIndex]) {
                      firstIndex = j;
                  }
            }
            int temp = array[i];
            array[i] = array[firstIndex];
            array[firstIndex] = temp;
        }

        System.out.println ("after sorting: "+Arrays.toString(array));
    }
}