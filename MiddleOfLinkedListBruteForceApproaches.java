public class MiddleOfLinkedListBruteForceApproaches{
    // In one traversal...........M

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
        Node temp=head;
int size=0;
        while(temp!=null)
        {
            size++;
            temp=temp.next;
        }
        temp=head;
      for(int i=0;i<=size/2-1;i++)
       {
         temp=temp.next;
       }
        return temp;
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