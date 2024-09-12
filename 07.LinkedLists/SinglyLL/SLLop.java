class SLL{
    Node head;
    int size;
    class Node{
           int data;
           Node next;
           Node(int data){
            this.data=data;
            this.next=null;
            size++;
           }
    }

    int getSize(){
        return this.size;
    }
    void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null) head=newNode;
        else {
            newNode.next=head;
            head=newNode;
        }

    }
    void addLast(int data){
        Node newNode=new Node(data);
        Node temp=head;
        if(head==null) head=newNode;
        else {
            while (temp.next!=null) {
                temp=temp.next;
            }
            temp.next=newNode;
        }

    }
    void deleteFirst(){
        if(head==null) return;
        head=head.next;
        size--;

    }
    void deleteLast(){
        Node temp=head;
        Node prev=null;
        if(head==null) return;
        while (temp.next!=null) {
            prev=temp;
            temp=temp.next;
        }
        prev.next=null;
        size--;

    }
    void display(){
        Node temp=head;
        if (head==null) {
            System.out.println("List is Empty");
            return;
        }
        while (temp!=null) {
            System.out.print(temp.data+"=>");
            temp=temp.next;
        }
        System.out.print("NULL");

    }
    void addPos(int data,int pos){
        int i=0;
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while (temp.next!=null && i<pos-2) {
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;

    }
    void deletePos(int pos){
        int i=0;
    
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        while (temp.next!=null && i<pos-2) {
            temp=temp.next;
            i++;
        }
        temp.next=temp.next.next;
        size--;
    
    }
    void sortedInsert(int data){
        Node newNode=new Node(data);
        Node currNode=head;
        if(currNode==null||currNode.data>data){
            newNode.next=head;
            head=newNode;
            return;
        }
        while (currNode.next!=null && currNode.next.data<data) {
            currNode=currNode.next;
        }
        newNode.next=currNode.next;
        currNode.next=newNode;

    }
    void reverse(){
        Node prev=null;
        Node curr=head;
        Node nextnode=head;
        while (nextnode!=null) {
            nextnode=nextnode.next;
            curr.next=prev;
            prev=curr;
            curr=nextnode;
        }
        head=prev;
    }
}
public class SLLop {
    public static void main(String[] args) {
        SLL list=new SLL();
        list.addFirst(20);
        list.addFirst(10);
        list.addFirst(9);
        list.addLast(21);
        list.addLast(22);
        list.deleteFirst();
        list.deleteFirst();
        list.deleteLast();
        list.addFirst(10);
        list.addLast(100);
        list.addPos(23, 3);
        list.addPos(2, 2);
        list.addPos(24,5 );
        list.deletePos(4);
        list.deletePos(0);
        list.sortedInsert(1);
        list.sortedInsert(5);
        list.sortedInsert(7);
        list.sortedInsert(101);
        System.out.println("Before Reversing..");
        list.display();
        System.out.println();
        list.reverse();
        System.out.println("After Reversing..");
        list.display();
    }
    
}
