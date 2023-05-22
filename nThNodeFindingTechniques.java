class nThNodeFindingTechniques{
    public static class Node{
        int data;
        Node next;
 
        Node(int data)
        {
            this.data=data;
        }
    }
    public static Node nthnode(Node head,int val)
    {
          int size=0;
          Node temp=head;

          while((temp!=null))
          {
            size++;
            temp=temp.next;
          }
          int m=size-val+1;
          temp=head;
          for(int i=0;i<=m-1;i++)
          {
            temp=temp.next;
          }
          return temp;
    }
    public static void main(String[] args) {
        Node a=new Node(13);
        Node  b=new Node(12);
        Node c=new Node(2);
        Node d=new Node(44);
        Node e=new Node(55);
        Node f=new Node(100);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        Node q=nthnode(a,1);
        System.out.println(q.data);
    }
} 
