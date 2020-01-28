let a = parseFloat(window.prompt('Nhập cạnh hình vuông: '));
let result = Math.pow(a,2);

if(result <= 0) {
    alert('Số liệu không hợp lệ => Không có kết quả');
} else {
    alert(`Diện tích hình vuông có cạnh ${a} là: ${result}`);
}



