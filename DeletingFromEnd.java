public class DeletingFromEnd{
   public  static class Node{
    int data;
    Node next;
    Node(int data)
    {
       this.data=data;
    }
   
   }
   public static Node delete(Node head,int val)
   {
    Node fast=head;
    Node slow=head;

    for(int i=1;i<=val;i++)
    {
        fast=fast.next;
    }
    if(fast==null)
    {
        head=head.next;
        return head;
    }
    while(fast.next!=null)
    {
        slow=slow.next;
        fast=fast.next;
    }
    slow.next=slow.next.next;
    return head;
   }
   public static void display(Node head) {
      Node temp=head;
      while(temp!=null)
      {
        System.out.println(temp.data);
        temp=temp.next;
      }  
   }
   public static void main(String[] args) {
    Node a=new Node(1);
    Node b=new Node(2);
    Node c=new Node(3);
    Node d=new Node(4);
    Node e=new Node(5);
    Node f=new Node(6);

    a.next=b;
    b.next=c;
    c.next=d;
    d.next=e;
    e.next=f;
    display(a);
    a=delete(a,6);
    System.out.println("Output after deleting the value");
    display(a);
}
    
}