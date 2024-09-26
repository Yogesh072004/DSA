class DLL{
    Node head;
    class Node{
             int data;
            Node prev;
            Node next;

            Node(int data){
                this.data=data;
                this.prev=null;
                this.next=null;
            }
            
    }
    void addFirst(int data){
        Node newNode =new Node(data);
        if(head==null){
            newNode.next=head;
            head=newNode;
        }else{
            newNode.next=head;
            head.prev=newNode;
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
            newNode.prev=temp;
        }

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
        newNode.prev=temp;
        temp.next.prev=newNode;
        temp.next=newNode;


    }
    void display(){
        Node temp=head;
        if (head==null) {
            System.out.println("List is Empty");
            return;
        }
        System.out.println();
        while (temp!=null) {
            System.out.print(temp.data+"<=>");
            temp=temp.next;
        }
        System.out.print("NULL");

    }
}
public class DLLop {
    public static void main(String[] args) {
        DLL list=new DLL();
        list.addFirst(54);
        list.addFirst(87);
        list.addFirst(984);
        list.display();
        list.addPos(2, 2);
        list.addPos(9, 4);
        list.addLast(963);
        list.display();
    }
}
