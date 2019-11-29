package November;


class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Partition {
    public ListNode partition(ListNode pHead, int x) {
        if(pHead==null||pHead.next==null){
            return pHead;
        }
        ListNode cur = pHead;
        ListNode sNode = new ListNode(-1);
        ListNode bNode = new ListNode(-1);
        ListNode sCur = sNode;
        ListNode bCur = bNode;
        while (cur!=null){
            if(cur.val<x){
                sCur.next = new ListNode(cur.val);
                sCur = sCur.next;
            }else {
                bCur.next = new ListNode(cur.val);
                bCur = bCur.next;
            }
            cur = cur.next;
        }
        cur = sNode;
        while (cur.next!=null){
            cur=cur.next;
        }
        cur.next = bNode.next;
        return sNode.next;
    }
}