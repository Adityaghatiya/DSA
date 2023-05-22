class Deleting_ntNodeFromEnd{
    public static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
    }
    public static void  DeleteFromEnd(Node head,int index)
    {
        Node fast=head;
        Node last=head;

        for(int i=0;i<=index-1;i++)
        {
            fast=fast.next;
           
        }
        while(fast.next!=null)
        {
           fast=fast.next;
           last=last.next;
        }
        last.next=last.next.next;;
    }
    public static void display(Node head) {
        Node temp=head;
        while(temp!=null)
        {   
            System.out.print(temp.data+" -> ");
            temp=temp.next;

        }

    }
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        Node f=new Node(60);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        
       display(a);    
       DeleteFromEnd(a,3);
       System.out.println("After deleting the element");
       display(a); 

    }
}