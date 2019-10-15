package Sorting;
//j : current index
//key : the small value
// i : iterator
public class InserSort {
    static int h;
    static int key;
    final static int [] A = {7,3,10,5,8};

    public static void sort(){
        for(h = 1; h <= A.length-1; h++){ //Outer loop
                key = A[h]; // Store value to insert
            int j = h;


            //Find the correct position for key
            while (j > 0 && key < A[j-1]){
                A[j] = A[j-1]; // A[j-1] Move ths space to the left , A[j] to the right
                j = j - 1;
            }
            A[j] = key; //Insert key into space
        }
    }

    public static void main(String[] args) {
        sort();
        for (int i=0; i < A.length; i ++){
            System.out.println(A[i]);
        }
    }
}
