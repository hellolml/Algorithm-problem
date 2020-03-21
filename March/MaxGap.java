package March;

public class MaxGap {
    public int findMaxGap(int[] A, int n) {
        // write code here
        int max = 0;
        for (int i = 0; i < A.length; i++) {
            if(A[i]>max){
                max = A[i];
            }
        }
        return Math.max(max-A[0],max-A[n-1] );
    }
}
