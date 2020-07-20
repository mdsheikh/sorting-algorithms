/**
 * bogoSort
 */

public class bogoSort {

    public void bogo_sort(int[] array){
        while(is_sorted(array) == false){
            shuffle(array);
        }

    }
    public void shuffle(int[] array){
        for(int i = 0; i < array.length; i++){
            swap(array, i , (int) Math.random()*i);
        }

    }
    public void swap(int[] array, int x, int y){
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
    public boolean is_sorted(int[] array){
     
        for (int i=1; i<array.length; i++) 
            if (array[i] > array[i+1]) 
                return false; 
        return true; 
    } 
    public void printArray(int[] array){
        for(int i = 0; i< array.length; i++){
            System.out.print(array[i] + " ");
        System.out.println();    
        }
    }


    public static void main(String[] args) {
        bogoSort bs = new bogoSort();
        int[] array = {12,3,56,8,34,45};
        bs.bogo_sort(array);
        bs.printArray(array);

    }
}