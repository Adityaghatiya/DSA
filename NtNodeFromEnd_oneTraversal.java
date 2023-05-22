class NtNodeFromEnd_oneTraversal{
    private static class Node {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
    }
    public static Node getId(Node head,int id)
    {
        Node fast=head;
        Node slow=head;
        
        for(int i=0;i<=id-1;i++)
        {
            fast=fast.next;

        }
        while(fast!=null)
        {
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        Node a=new Node(100);
        Node b=new Node(30);
        Node c=new Node(60);
        Node d=new Node(40);
        Node e=new Node(50);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        Node t=getId(a,3);
        System.out.println(t.data);
    }
   
}