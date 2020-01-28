let dienSuDung = parseFloat(window.prompt('Nhập số điện sử dụng (kWh):'));
let giaDien = parseFloat(window.prompt('Nhập giá điện hiện thời: '));

let giaTien = dienSuDung * giaDien;

if( giaTien < 0) {
    alert('Số liệu nhập vào không hợp lệ !');
} else {
    alert(`Tiền điện phải trả: ${giaTien}đ`);
}

