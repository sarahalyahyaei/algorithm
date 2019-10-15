package Sorting;

public class QuickSort {
    final static int [] A = {20,8,7,4,100,10,0,1032,95};

    public static void quicksort(int arr[], int l , int r){

        if( r > l ){
            int p = partition(arr,l,r);
            quicksort(arr, l, p-1); //  the elements before pivot on the left
            quicksort(arr, p+1, l); // the elements after the pivot on the right side
        }
    }

    static int partition(int arr[], int l , int r){
        int pivot = arr[r];
        int i = (l-1); // index of smaller element

        //Searching for the the smallest values
        for(int j = l; j < r; j++)
        {
            if(arr[j] < pivot) {
                i++;
                //Sawp arr[i] and arr[j]
                int tem = arr[i];
                arr[i] = arr[j];
                arr[j] = tem;
            }

        }
        //Putting the pivot on its correct position
        int tem = arr[i+1];
        arr[i+1] = arr[r];
        arr[r] = tem;
        return i+1;
    }

    public static void main(String[] args) {
        int n = A.length;
        //n-1 last elements
        quicksort(A,0 , n-1);
        for(int i=0; i < n; i++){
            System.out.println(A[i]);
        }
    }
}
