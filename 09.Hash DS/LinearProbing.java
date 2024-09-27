public class LinearProbing {

    int size;
    int a[];
    public LinearProbing(int size){
        this.size=size;
        a=new int[this.size];
        for(int i=0;i<this.size;i++){
            a[i]=-1;
        }
    }
    public int compute(int value){
        return value%size;
    }
    public int compute1(int index){
        return index;
    }
    boolean add(int value){
        int hcode=value%size;
        for(int i=0;i<size;i++){
            if(a[hcode]==-1){
                a[hcode]=value;
                return true;
            }
            hcode=hcode+i;
            hcode=hcode%size;
        }
        return false;
    }
    boolean delete(int value){
        int hcode=value%size;
        for(int i=0;i<size;i++){
            if(a[hcode]!=-1&&a[hcode]==value){
                a[hcode]=-1;
                return true;
            }
            hcode=hcode+i;
            hcode=hcode%size;
        }
        return false;
    }
    boolean Search(int value){
        int hcode=value%size;
        for(int i=0;i<size;i++){
            if(a[hcode]==value){
                
                return true;
            }
            hcode=hcode+i;
            hcode=hcode%size;
        }
        return false;
    }
    public void print(){
        System.out.println("content of hash table:");
        for(int i=0;i<size;i++){
            System.out.println(i+"====>"+a[i]);
        }
    }
    public static void main(String[] args) {
        LinearProbing l=new LinearProbing(10);
        System.out.println();
        System.out.println(l.add(3));
        System.out.println(l.add(13));
        System.out.println(l.add(23));
        System.out.println(l.add(33));
        System.out.println(l.add(43));
        System.out.println(l.add(53));
        System.out.println(l.add(63));
        l.print();
        System.out.println(l.Search(43));
        System.out.println(l.Search(93));
        l.delete(23);
        l.print();
        
    }
}
