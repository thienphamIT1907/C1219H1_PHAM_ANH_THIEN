//Số tiền lãi = Số tiền gửi x lãi suất (%/năm) x số ngày thực gửi/360
let tienGui = parseInt(window.prompt('Nhập số tiền gửi: '));
let soNgayGui = parseInt(window.prompt('Nhập số ngày gửi: '));
let laiSuat = parseInt(window.prompt('Nhập lãi suất tháng: '));

let result = tienGui * laiSuat/100 * soNgayGui/360;
if(result < 0) {
    alert('Số liệu không hợp lệ !');
} else alert(`Tiền lãi: ${result}đ`);