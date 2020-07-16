
import java.util.Random;
public class selectionSort {
    // method to generate ranndom numbers 
    public static int[] randDataset(int size, int end){
        int[] arr = new int[size];
        
        Random rand = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(end);
           
		}
		return arr;

    }

    public static void selectionsort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++){
            int min_index = i;

            for(int j = i+1; j< n; j++){
                if(arr[j] < arr[min_index]){
                     min_index = j;
                }

                int temp = arr[min_index];
                arr[min_index] = arr[i];
                arr[i] = temp;

            }
        }
    }

    public static  void printData(int[] arr){
        int n = arr.length;
        for(int i= 0;i < n; i++){
            System.out.println(arr[i]);
        System.out.println();    
        }

    }
    
    public static void main(String[] args) {
        
        int  size = 20;
        int  end = 100;
        long startTime, endTime;
        int[] dataSet = randDataset(size, end);
        startTime = System.nanoTime();
        selectionsort( dataSet);
        endTime = System.nanoTime();
        System.out.println("It took " + (endTime - startTime) + " nanoseconds to sort.");
        printData(dataSet);

    }
    
}