package January;

public class SortArrayByParity {
    public int[] sortArrayByParity(int[] A) {
       int a[] = new int[A.length];
       int count  = 0;
        for (int i = 0; i <A.length ; i++) {
            if(A[i]%2==0){
                a[count++] = A[i];
            }
        }
        for (int i = 0; i <A.length ; i++) {
            if(A[i]%2==1){
                a[count++] = A[i];
            }
        }
        return a;
    }
}
