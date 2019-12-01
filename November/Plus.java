package November;

class ListNode1 {
    int val;
    ListNode1 next = null;

    ListNode1(int val) {
        this.val = val;
    }
}
public class Plus {
    public static ListNode1 plusAB(ListNode1 a, ListNode1 b) {
        if (a == null || b == null) return null;
        ListNode1 cur = a;
        int temp = 0;
        while (cur != null) {
            if (b == null) break;//b链表结束
            temp += cur.val + b.val;//当前位累加
            cur.val = temp % 10;//a链表存储和
            temp = temp / 10;//取进位
            if (cur.next == null && b.next != null) cur.next = new ListNode1(0);//a长度没b长就增加长度
            if (cur.next == null && b.next == null && temp != 0) cur.next = new ListNode1(temp);//加到末尾，如果有进位，就增加进位节点
            cur = cur.next;
            b = b.next;
        }
        return a;
    }
    public static void main(String args[]){
            ListNode1 node1 = new ListNode1(5);
            ListNode1 node2 = new ListNode1(6);
            ListNode1 node3 = new ListNode1(7);
            ListNode1 node4 = new ListNode1(7);
            ListNode1 node5 = new ListNode1(6);
            ListNode1 node6 = new ListNode1(5);
            node1.next = node2;
            node2.next = node3;
            node4.next = node5;
            node5.next = node6;
            ListNode1 A = plusAB(node1,node4);
            while (A!=null){
                System.out.println(A.val);
                A = A.next;
            }
    }
}