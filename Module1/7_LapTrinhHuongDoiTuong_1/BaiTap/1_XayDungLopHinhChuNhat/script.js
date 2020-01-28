let ctx = document.getElementById("myCanvas").getContext("2d");
class Rectangle {
    constructor(chieuDai, chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    set setChieuDai(chieuDai) {
        this.chieuDai = chieuDai;
    }

    set setChieuRong(chieuRong) {
        this.chieuRong = chieuRong;
    }

    // get getChieuDai() {
    //     return this.chieuDai;
    // }
    //
    // get getChieuRong() {
    //     return this.chieuRong;
    // }

    get getChuvi() {
        return (this.chieuDai + this.chieuRong) * 2;
    }

    get getDientich() {
        return this.chieuDai * this.chieuRong;
    }

    veHinh(ctx) {
        ctx.fillStyle = 'lightblue';
        ctx.fillRect(50,50, this.chieuDai,this.chieuRong);
    }
}

let rectangle = new Rectangle();
rectangle.setChieuDai = parseInt(window.prompt('Nhập chiều dài:'));
rectangle.setChieuRong = parseInt(window.prompt('Nhập chiều rộng:'));

rectangle.veHinh(ctx);

let dienTich = rectangle.getDientich;
let chuVi = rectangle.getChuvi;

alert(`Diện tích: ${dienTich} | Chu vi: ${chuVi} `);

