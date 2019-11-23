package November;

public class OtherAdd {
    public int addAB(int A, int B) {
        // write code here
        if(B==0){
            return A;
        }
        int add = A^B;
        int jing = (A&B)<<1;
        return addAB(add,jing );
    }
}
