// package linkedlist;

class implementation{
    public static class Node {
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
        }

    }
    public static class LinkedListEx{
        Node head=null;
        Node tail=null;
// Insert at end of list.....
        void Insert(int val) {
            Node temp=new Node(val);
            if(head==null)
            {
                head=temp;
            }
            else{
                tail.next=temp;
            }
            tail=temp;

            
        }
        // Insert at begining of list
        void InsertAtBegin(int val)
        {

            Node temp=new Node(val);

            if(head==null)
            {
                head=tail=temp;
            }
            else{
                temp.next=head;
                head=temp;
            }

        }
        // Insert At any index
        void InsertAtIndex(int index,int val)
        {

            Node t=new Node(val);
            Node  temp=head;
            if(index==size())
            {
                Insert(val);
                return;
            }
            else if(index==0)
            {
                InsertAtBegin(val);
                return;
            }
            else if(index>size() || index<0)
            {
                System.out.println("Wrong Index....");
                return;
            }
            for(int i=0;i<=index-1;i++)
            {
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
        
        }
        void display() {
            Node temp=head;

            while(temp!=null)
            {
                System.out.print(temp.data+" -> ");
                temp=temp.next;
            }
        }
        // Getting the value of index
        int getAt(int index)
        {
            Node temp=head;
            for(int i=0;i<=index;i++)
            {
                temp=temp.next;
            }
            return temp.data;
        }
        int size()
        {
            Node temp=head;
            int count=0;
            while(temp!=null)
            {
                count++;
                temp=temp.next;
            }
            System.out.println("Size="+count);
            return count;
        }
        void deleting(int index)
        {
            Node temp=head;
            for(int i=0;i<=index-1;i++)
            {
                temp=temp.next;
            }
            temp.next=temp.next.next;
            tail=temp;
        }
    }
    public static void main(String[] args) {
        LinkedListEx l1=new LinkedListEx();
        // Insert at end or common insertion
        l1.Insert(1);
        l1.Insert(2);
        l1.Insert(3);
        l1.Insert(4);
        // Insert at Begining
        l1.InsertAtBegin(100);
         l1.display();
         System.out.println(l1.size());
        // Insertion at any point.....Any index
        System.out.println("Insertion at given index");
        l1.InsertAtIndex(2,200);
        l1.display();
        System.out.println("Insertion at given index");
        l1.InsertAtIndex(3,250);
        l1.display();
        System.out.println("Insertint at index 0");
        l1.InsertAtIndex(0,250);
        l1.display();
        System.out.println("Insertint at index last");
        l1.InsertAtIndex(7,250);
        l1.display();
        System.out.println("Insertint at index Unknown place");
        l1.InsertAtIndex(10,250);
        l1.display();
        System.out.println("Insertint at negative index Unknown place");
        l1.InsertAtIndex(10,250);
        //Getting  the value of index
        System.out.println("Getting the element");
        System.out.println(l1.getAt(4));
        // Deleting from the index....
        System.out.println("After deleting the elemet from the LInkedlist");
        l1.deleting(4);
        l1.display();
        System.out.println("Tail data");
        System.out.println(l1.tail.data);
    }
}