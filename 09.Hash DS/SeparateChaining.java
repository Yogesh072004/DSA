class HasNode{
    int size;
    Node1 a[];
    class Node1{
        int value;
        Node1 next;
        Node1 (int value,Node1 next){
            this.value=value;
            this.next=next;
        }

    }
    HasNode( int size){
        this.size=size;
        a=new Node1[this.size];
        for(int i=0;i<this.size;i++){
            a[i]=null;
        }
    }
    void print(){
        System.out.println("content of hash table");
        for(int i=0;i<size;i++){
            Node1 head=a[i];
            while (head!=null) {
                System.out.print(head.value+"=>");
                head=head.next;
            }
            System.out.println("null");

        }
    }
    void add(int value){
        int hcode=value%size;
        a[hcode]=new Node1(value, a[hcode]);
    }
     boolean delete (int value){
        int hcode=value%size;
        Node1 nextNode,head=a[hcode];
        if(head!=null && head.value==value){
            a[hcode]=head.next;
            return true;
        }
        while (head!=null) {
            nextNode=head.next;
            if(nextNode!=null && nextNode.value==value){
                head.next=nextNode.next;
                return true;
            }else{
                head=nextNode;
            }
        }
        return false;

     }
     boolean Search (int value){
        int hcode=value%size;
        Node1 head=a[hcode];
        while (head!=null) {
            if (head.value==value) {
                return true;
            }
            head=head.next;
        }
        return false;
     }
}
public class SeparateChaining {
    
public static void main(String[] args) {
    HasNode h=new HasNode(10);
    h.add(13);
    h.add(14);
    h.add(15);
    h.add(16);
    h.add(19);
    h.add(23);
    h.add(33);
    h.add(43);
    h.add(333);
    System.out.println(h.Search(333));
    System.out.println(h.Search(999));
    System.out.println(h.Search(333));
    h.print();
    }
}
