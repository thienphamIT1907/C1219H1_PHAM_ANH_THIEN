package Workspace_Praticing.linhtinh;

//Ở class Apple, bởi vì không có constructor nào được viết tường minh, lớp Apple sẽ ngầm định có một constructor không có tham số. constructor đó ngầm định gọi tới constructor không có tham số của lớp cha là lớp Fruit, nhưng bởi vì Fruit có tường minh một constructor có tham số, vậy nên Fruit không có constructor không có tham số nào, điều này sẽ gây ra lỗi khi compile. Chương trình này thậm chí còn không thể build được.
class MyClass {
    public class Configs {

        // Loại nhân viên
        public static final int NHAN_VIEN_SEP = 1;
        public static final int NHAN_VIEN_LINH = 2;

        // Lương nhân viên
        public static final long LUONG_NHAN_VIEN_FULL_TIME_SEP = 20000000; // Lương tháng của sếp
        public static final long LUONG_NHAN_VIEN_FULL_TIME_LINH = 10000000; // Lương tháng của lình
        public static final long LUONG_LAM_THEM_MOI_NGAY = 800000; // Làm thêm mỗi ngày của nhân viên toàn thời gian được 800 k
        public static final long LUONG_NHAN_VIEN_PART_TIME_MOI_GIO = 100000; // Lương nhân viên thời vụ mỗi giờ 100 k
    }

    public abstract class NhanVien {

        protected String ten;
        protected long luong;

        public NhanVien() {
        }

        public NhanVien(String ten) {
            this.ten = ten;
        }

        // Lớp con phải override để lo vụ loại nhân viên này
        protected abstract String loaiNhanVien();

        // Lớp con phải override để lo vụ tính lương này
        public abstract void tinhLuong();

        public void xuatThongTin() {
            System.out.println("===== Nhân viên: " + ten + " =====");
            System.out.println("- Loại nhân viên: " + loaiNhanVien());
            System.out.println("- Lương: " + luong + " VND");
        }
    }

    public class NhanVienFullTime extends NhanVien {

        private int ngayLamThem; // Ngày làm thêm của nhân viên
        private int loaiChucVu; // Chức vụ là lính hay sếp

        public NhanVienFullTime(String ten, int ngayLamThem, int loaiChucVu) {
            super(ten);
            this.ngayLamThem = ngayLamThem;
            this.loaiChucVu = loaiChucVu;
        }

        @Override
        public String loaiNhanVien() {
            if (loaiChucVu == Configs.NHAN_VIEN_LINH) {
                return "Lính toàn thời gian" + (ngayLamThem > 0 ? " (có làm thêm ngày)":"");
            } else {
                return "Sếp toàn thời gian" + (ngayLamThem > 0 ? " (có làm thêm ngày)":"");
            }
        }

        @Override
        public void tinhLuong() {
            if (loaiChucVu == Configs.NHAN_VIEN_LINH) {
                luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_LINH + ngayLamThem * Configs.LUONG_LAM_THEM_MOI_NGAY;
            } else if (loaiChucVu == Configs.NHAN_VIEN_SEP) {
                luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_SEP + ngayLamThem * Configs.LUONG_LAM_THEM_MOI_NGAY;
            }
        }
    }



}
