class HocSinh {
    constructor(stt, hoTen, ngaySinh, dtb) {
        this.stt = stt;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.dtb = dtb;
    }

    getStt() {
        return this.stt;
    }

    setStt(stt) {
        this.stt = stt;
    }

    getHoTen() {
        return this.hoTen;
    }

    setHoTen(hoTen) {
        this.hoTen = hoTen;
    }

    getNgaySinh() {
        return this.ngaySinh;
    }

    setNgaySinh(ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    getDtb() {
        return this.dtb;
    }

    setDtb(dtb) {
        this.dtb = dtb;
    }

    showInfo() {
        alert('===========  THÔNG TIN HỌC SINH  ===========' + '\n' +
            'Số thứ tự: ' + this.getStt() + '\n' +
            'Họ và tên: ' + this.getHoTen() + '\n' +
            'Ngày sinh: ' + this.getNgaySinh() + '\n' +
            'Điểm trung bình: ' + this.getDtb())
    }

    xepLoai() {
        let diem = this.getDtb();
        if(diem > 8) {
            alert(`Học sinh ${this.getHoTen()} xếp loại : GIỎI`);
        } else if(diem >= 6.5) {
            alert(`Học sinh ${this.getHoTen()} xếp loại : KHÁ`);
        } else if(diem >= 5) {
            alert(`Học sinh ${this.getHoTen()} xếp loại : TRUNG BÌNH`);
        } else if(diem >= 3.5) {
            alert(`Học sinh ${this.getHoTen()} xếp loại : YẾU`);
        } else alert(`Học sinh ${this.getHoTen()} xếp loại : KÉM`);
    }
}