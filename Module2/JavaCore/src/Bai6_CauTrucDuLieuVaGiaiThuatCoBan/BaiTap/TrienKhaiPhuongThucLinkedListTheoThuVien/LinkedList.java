package Bai6_CauTrucDuLieuVaGiaiThuatCoBan.BaiTap.TrienKhaiPhuongThucLinkedListTheoThuVien;

public class LinkedList<E> {
    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    private Node head;//first element
    private int numNodes = 0; //mo ta so luong node trong list

    public LinkedList() {}

    public void addFirst(E element) {
        Node temp = head; //khai bao bien temp -> Tham chieu den gia tri cua head
        head = new Node(element); //head nhan gia tri la 1 Node moi
        head.next = temp; //head.next -> temp
        numNodes++;
    }

    public void addLast(E element) {
        Node temp = head;//khai bao bien temp tro den head
        while (temp.next != null) {//con tro tro den phan tu cuoi cung
            temp = temp.next;
        }
        temp.next = new Node(element);
        numNodes++;
    }

    public void add(int index, E element) {
        Node temp = head;//khai bao temp tro den head
        Node holder;//Khai bao node holder
        for(int i = 0; i < index - 1 && temp.next != null; i++) {//cho con tro chay den vi tri index-1
            temp = temp.next;
        }
        holder = temp.next;//cho holder tham chieu den vi tri index
        temp.next = new Node(element);//node tai vi tri index-1 tro den node moi
        //node moi se tro den holder
        temp.next.next = holder;
        numNodes++;

    }
}
