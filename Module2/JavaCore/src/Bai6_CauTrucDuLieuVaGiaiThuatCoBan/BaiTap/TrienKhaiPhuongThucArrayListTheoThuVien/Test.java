package Bai6_CauTrucDuLieuVaGiaiThuatCoBan.BaiTap.TrienKhaiPhuongThucArrayListTheoThuVien;

public class Test {
    public static void main(String[] args) {
        MyArrayList<String> myArrayList = new MyArrayList<>(3);
        myArrayList.add("A");
        myArrayList.add("Z");
        myArrayList.add("V");

        System.out.println(myArrayList.contains("A"));
        System.out.println(myArrayList.size());

        myArrayList.remove(2);
        myArrayList.clone();
    }
}
