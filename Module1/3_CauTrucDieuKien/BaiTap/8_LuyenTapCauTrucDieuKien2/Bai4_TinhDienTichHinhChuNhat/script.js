let dai = parseFloat(window.prompt('Nhập chiều dài: '));
let rong = parseFloat(window.prompt('Nhập chiều rộng: '));

let dienTich = dai * rong;
if(dienTich <= 0) {
    alert('Số liệu không hợp lệ => Không có kết quả');
} else {
    alert(`Diện tích hình chữ nhật: ${dienTich}`);
}





