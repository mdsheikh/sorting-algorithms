import java.lang.reflect.Array;
import java.util.Random;
/**
 * bubbleSort
 */
public class bubbleSort {
    
    public static int[] randDataset(int size, int end){
        int[] arr = new int[size];
        
        Random rand = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(end);
           
		}
		return arr;

    }
    public static int[] bubbleSortImplementation(int[] arr){
        int n = arr.length;
        for(int i = 0 ;i < n-1;i++){
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;

    }


    public static void main(String[] args) {
        int size = 10;
      
        int end = 100;
        long startTime, endTime;

        int[] arr = randDataset(size, end);
        System.out.println("Before sorting: ");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }        
        System.out.println("After sorting: ");
        startTime = System.nanoTime();
        int array[] = bubbleSortImplementation(arr);
        endTime = System.nanoTime();

        for(int j =0; j<array.length;j++){
            System.out.println(array[j]);
        }
        System.out.println("It took " + (endTime-startTime) + " nanoseconds");
    }

    
}