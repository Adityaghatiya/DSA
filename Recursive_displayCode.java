class Recursive_displayCode{
    public static class Node {
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;

        }
    }
    public static void display(Node head) {
       if(head==null)
       {
        return ;
       }
       System.out.println(head.data);
      display(head.next);
    }
    
    public static void main(String[] args) {
        Node a=new Node(3);
        Node b=new Node(4);
        Node c=new Node(5);
        Node d=new Node(6);
        Node e=new Node(7);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=null;
        
        display(a);
         
    }
}