package Bai6_CauTrucDuLieuVaGiaiThuatCoBan.BaiTap.TrienKhaiPhuongThucLinkedListTheoThuVien;

public class Test {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>(3);
        myLinkedList.addFirst("A");
        myLinkedList.addFirst("Z");
        myLinkedList.addFirst("V");
        myLinkedList.printList();

        System.out.println(myLinkedList.contains("A"));
        System.out.println(myLinkedList.IndexOf("C"));
        System.out.println(myLinkedList.size());

        myLinkedList.remove(2);
        myLinkedList.clone();
    }
}
