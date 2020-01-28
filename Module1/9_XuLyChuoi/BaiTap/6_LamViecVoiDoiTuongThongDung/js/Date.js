let myDate = new Date(1996,7,19,19,15,30,0);
let currenDate = new Date();

let tuoi = currenDate.getFullYear() - myDate.getFullYear();
document.write(`Tôi đã sống ${tuoi} năm <br/>`);

let thang = 0;
let ngay= 0;
let gio = 0;
let phut= 0;
let giay= 0;

let namSinh = myDate.getFullYear();
let namHienTai = currenDate.getFullYear();

while(namSinh < namHienTai) {
    thang += 12;
    ngay += 360;
    gio += 8640;
    phut += 518400;
    giay += 31104000;
    namSinh++;
}

document.write(`Tôi đã sống ${thang} tháng <br/>`);
document.write(`Tôi đã sống ${ngay} ngày <br/>`);
document.write(`Tôi đã sống ${gio} giờ <br/>`);
document.write(`Tôi đã sống ${phut} phút <br/>`);
document.write(`Tôi đã sống ${giay} giây <br/>`);
