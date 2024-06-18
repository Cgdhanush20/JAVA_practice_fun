class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}

public class LinkedListEx 
{
    Node head;
    public void insertAtBeginning(int data)
    {
        Node n=new Node(data);
        n.next=head;
        head=n;
    }
    public void insertAtEnd(int data)
    {
        Node n=new Node(data);
        if(head==null)
        {
            head=n;
        }
        else
        {
            Node curr=head;
            while(curr.next!=null)
            {
                curr=curr.next;
            }
            curr.next=n;
        }
    }
    public void insertAtPosition(int data,int pos)
    {
        Node n=new Node(data);
        if(pos==0)
        {
            insertAtBeginning(data);
            return;
        }
        Node curr=head;
        int count=0;
        for(int i=0;i<pos-1 && curr!=null;i++)
        {
            curr=curr.next;
        }
        if(curr==null)
        {
            System.out.println("Index out of bound");
        }
        else
        {
            n.next=curr.next;
            curr.next=n;
        }
    }
    public void deleteAtBeginning()
    {
        if(head!=null)
        {
            head=head.next;
        }
        else
        {
            System.out.println("List is empty");
        }
    }
    public void deleteAtEnd()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        Node curr=head;
        while(curr.next!=null)
        {
            curr=curr.next;
        }
        curr.next=null;
    }
    public void deleteAtPosition(int pos)
    {
        if(pos==0)
        {
            deleteAtBeginning();
            return;
        }
        Node curr=head;
        for(int i=0;i<pos-1 && curr!=null;i++)
        {
            curr=curr.next;
        }
        if(curr==null)
        {
            System.out.println("Index out of bound");
        }
        else
        {
            curr.next=curr.next.next;
        }
    }
    public void display()
    {
        Node curr=head;
        while(curr!=null)
        {
            System.out.print(curr.data+"-->");
            curr=curr.next;
        }
        System.out.println("null");
    }
    public static void main(String args[])
    {
        LinkedListEx l=new LinkedListEx();
        l.insertAtBeginning(1);
        l.insertAtEnd(2);
        l.insertAtEnd(3);
        l.insertAtPosition(8,2);
        l.display();
        l.deleteAtBeginning();
        l.deleteAtEnd();
        l.deleteAtPosition(2);
        l.display();
    }
}