import java.util.*;

public class Binary {

    public static void main (String args[]) {

        Scanner input = new Scanner (System.in);

        System.out.println ("Enter Array size:");
        int size = input.nextInt();
 
        int array[] = new int[size];

        System.out.println ("enter array Elements");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.println ("entersearch Elements");
        int searchElement = input.nextInt();

        System.out.println ("your Elements: "+Arrays.toString(array));
        int result=binarySearch(array,size,searchElement);
        System.out.println("element is pointing at "+result);
           
        
    }

    public static int binarySearch (int[] array,int size,int searchElement) {
        int low = 0;
        int high = size - 1;
        while (low <= high) {
            int mid = (low + high)/2;
            if (searchElement == array[mid]) {
                return mid;
            }
            else if (searchElement < array[mid]) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return -1;
    }
 }