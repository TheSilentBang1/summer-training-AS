public class ll {
    public static void main(String [] args){
        // int size = (int)1e10;
        // int [] arr = new int[size]
        Node n1 = new Node(15);
        Node n2 = new Node(16);
        Node n3 = new Node(17);
        n1.next = n2;
        n2.next = n3;
        Node temp = n2;
        temp = n3;
        System.out.println(temp.data);
        System.out.println(n1.data);
        

    }
}
