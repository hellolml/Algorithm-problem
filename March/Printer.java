package March;

public class Printer {
    public int[] arrayPrint(int[][] arr, int n) {
        // write code here
         int [] newA = new int[n*n];
         int count = 0;
       for (int j = n-1;j>=0;j--){
           for (int i = 0,x=0,y = j;i<n-j;i++,x++,y++){
               newA[count++] = arr[x][y];
           }
       }
       for (int i = 1;i<n;i++){
           for (int j = 0,x= i,y=0;j<n-i;j++,x++,y++){
               newA[count++] = arr[x][y];
           }
       }
       return newA;
    }
}
