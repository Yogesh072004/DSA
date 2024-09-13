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
    void deleteElement(int data){
        Node temp=head;
        if(temp==null){
            System.out.println("List is empty");
            return;
        }
        if(temp.data==data){
            head=head.next;
            size--;
            return;
        }
        while (temp.next!=null) {
            if(temp.next.data==data){
                temp.next=temp.next.next;
                size--;
                return;
            }
            temp=temp.next;
        }
        
    }
    void deleteElements(int data){
        Node temp=head;
        if(temp==null){
            System.out.println("List is empty");
            return;
        }
        if(temp.data==data){
            head=head.next;
            size--;
            
        }
        while (temp.next!=null) {
            if(temp.next.data==data){
                temp.next=temp.next.next;
                size--;
            }
            if(temp.next!=null) temp=temp.next;
        }
        
    }
    boolean search(int data){
        Node temp=head;
        while(temp!=null){
            if(temp.data==data){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    void RemoveDuplicates(){
        sorting();
        Node temp=head;
        while (temp!=null) {
            if(temp.next!=null && temp.data==temp.next.data){
                temp.next=temp.next.next;
            }else{
                temp=temp.next;
            }
        }
    }
    void sorting(){
        int t;
        Node temp1;
        Node temp2;
        for(temp1=head;temp1!=null;temp1=temp1.next){
            for(temp2=head;temp2!=null;temp2=temp2.next){
                if( temp2.next!=null && temp2.data > temp2.next.data){
                    t=temp2.data;
                    temp2.data=temp2.next.data;
                    temp2.next.data=t;

                }
            }
        }

    }
    int nthNodebeg(int index){
        if(index>getSize()||index<1) return -1;
        int count=0;
        Node temp=head;
        while (temp!=null && count<index-1) {
            count++;
            temp=temp.next;
        }
        if(temp==null) return -1;
        return temp.data;
    }
    int nthNodeend(int index){
        int size=getSize();
        int sindex;
        if(size!=0 && size>=index){
            sindex=size-index+1;
        }else{
            return -1;
        }
        
    int result=nthNodebeg(sindex);
    if(result==-1){
        return -1;
    }
    return result;
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
        list.addFirst(24);
        System.out.println("Before Reversing..");
        list.display();
        System.out.println();
        list.reverse();
        System.out.println("After Reversing..");
        list.display();
        list.deleteElement(5);
        System.out.println();
        list.display();
        list.deleteElement(24);
        System.out.println();
        list.display();
        boolean s=list.search(1);
        if(s==true){
            System.out.println();
            System.out.println("Found...");
        }else{
            System.out.println("Not found...");
        }
        list.sortedInsert(98);
        list.sortedInsert(118);
        list.sortedInsert(98);
        list.addFirst(855);
        list.addLast(855);
        list.display();
        list.RemoveDuplicates(); //sorted insertion
        System.out.println();
        list.display();
        System.out.println();
        System.out.println(list.nthNodebeg(2));
        System.out.println(list.nthNodeend(6));

    }
    
}

