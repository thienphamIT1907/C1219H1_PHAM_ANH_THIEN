let a = parseFloat(window.prompt('Nhập cạnh kề a: '));
let b = parseFloat(window.prompt('Nhập cạnh kề b: '));

let dienTich = (a * b) / 2;
if(dienTich <= 0) {
    alert('Số liệu không hợp lệ => Không có kết quả');
} else {
    alert(`Diện tích tam giác là: ${dienTich}`);
}

