class Apple {
    constructor(khoiLuong) {
        this.khoiLuong = khoiLuong;
    }

    getKhoiLuong() {
        return this.khoiLuong;
    }

    tieuHao(khoiLuongTieuHao) {
        this.khoiLuong -= khoiLuongTieuHao;
    }

    checkApple() {
        if (this.getKhoiLuong() === 0) {
            console.log('Đã hết táo !');
        }
    }
}
