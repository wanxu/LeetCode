/**
 * @Author: Json Wan
 * Created at: 2019/3/14.
 * Description:
 * 23. Merge k Sorted Lists
Hard
Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.
Example:
Input:
[
1->4->5,
1->3->4,
2->6
]
Output: 1->1->2->3->4->4->5->6
 ˼·��
 1.��򵥵�������k·�鲢��
 2.����ռ�ö���ռ䣬�͵غϲ����ο���·���㷨�����ƣ�
 3.�����Ż��ĵط��ǿ��Թ���һ��С���ѣ�ÿ�α���k��ͷ����ҳ���С��һ����������ǿ����ظ����õģ������Ӷ�Ϊk�ı���תΪlogk�Ķѵ��������ո��Ӷ�Ϊnlogk��
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}
public class wanxu_pursue_0023 {

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode pHead=new ListNode(0);
        ListNode pHeadBak=pHead;
        //todo:

        return pHeadBak.next;
    }

    public void printList(ListNode root){
        while(root!=null){
            System.out.print(root.val);
            root=root.next;
            if(root!=null){
                System.out.print("-->");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode root11=new ListNode(1);
        ListNode root12=new ListNode(2);
        ListNode root13=new ListNode(4);
        root11.next=root12;
        root12.next=root13;
        ListNode root21=new ListNode(1);
        ListNode root22=new ListNode(3);
        ListNode root23=new ListNode(4);
        root21.next=root22;
        root22.next=root23;
        wanxu_pursue_0023 instance=new wanxu_pursue_0023();
        instance.printList(root11);
        instance.printList(root21);
        instance.printList(instance.mergeKLists(new ListNode[]{null,root21}));
        instance.printList(instance.mergeKLists(new ListNode[]{root11,null}));
        instance.printList(instance.mergeKLists(new ListNode[]{root11,root21}));
    }
}
