let doanhSo = parseInt(window.prompt('Nhập doanh số: '));
TinhHoaHong(doanhSo);



function TinhHoaHong(doanhSo) {
    let hoaHong;
    if (doanhSo === 0) {
        hoaHong = 0;
        alert(`Mức hoa hồng nhận được: ${hoaHong} tương đương 0%`);
    }
    if(doanhSo > 0 && doanhSo <= 50000) {
        hoaHong = doanhSo * 10/100;
        alert(`Mức hoa hồng nhận được: ${hoaHong} tương đương 10%`);
    }
    if(doanhSo >= 50000 && doanhSo <= 100000) {
        hoaHong = doanhSo * 30/100;
        alert(`Mức hoa hồng nhận được: ${hoaHong} tương đương 30%`);
    }
    if(doanhSo >= 100000) {
        hoaHong = doanhSo * 45/100;
        alert(`Mức hoa hồng nhận được: ${hoaHong} tương đương 45%`);
    }
}