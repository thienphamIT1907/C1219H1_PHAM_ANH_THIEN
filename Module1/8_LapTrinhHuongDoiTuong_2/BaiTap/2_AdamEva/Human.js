class Human {
    constructor(ten, gioiTinh, canNang) {
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.canNang = canNang;
    }
    getInfo() {
        console.log('Tên: ' + this.ten + '\n' + 'Giới tính: ' + this.gioiTinh + '\n' + 'Cân nặng: ' + this.canNang + '\n');
        // console.log(this);
    }
    noi = (string) => {
        console.log(`${this.ten} say "${string}"`);
    };
    an = (food) => {
            this.canNang++;
            food.khoiLuong--;
            console.log('Đã ăn 1,còn lại: '+ food.khoiLuong +'. Cân nặng: ' + this.canNang);
    };
    kiemTra = (food) => {
        if(food.checkApple() === 0) {
            console.log('Hết đồ ăn rồi !');
        } else if(food.checkApple() > 0) {
            console.log('Vẫn còn đồ ăn !');
        }
    }
}
