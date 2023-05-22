public class LeftMiddleInEven{
    public static class Node {
        int data;
        Node next;
        Node (int data)
        {
            this.data=data;

        }
    }
    public static Node Middle(Node head)
    {
        Node fast=head;
        Node slow=head;

        while(fast!=null && fast.next.next!=null)
        {
            slow =slow.next;
            fast=fast.next.next;


        }
        return slow;
    }
    

    // private static void  implementation(int val) {
             
    // }
    public static void main(String[] args) {
        
        Node a=new Node(3);
        Node b=new Node(4);
        Node c=new Node(5);
        Node d=new Node(6);
        Node e=new Node(7);
        Node f=new Node(8);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        Node z=Middle(a);
        System.out.println(z.data);
    }

}