package Workspace_Praticing.linhtinh;

public class Test {
    public class NhanVien {
        public String hoTen;
        protected double luong;

        public NhanVien(String hoTen, double luong) {
        }

        public NhanVien() {

        }

        void xuat() {
        }

        private double getThuNhap() {
            return 0;
        }
    }


    public class TruongPhong extends NhanVien {
        public double trachNhiem;

        public TruongPhong(String hoTen, double luong, double trachNhiem) {
            super();
        }

        public void xuat() {
            super.hoTen = "Tuấn";
            super.luong = 500;
            super.xuat();
            double thuNhap = super.getThuNhap();
        }
    }
}
