let num1 = parseInt(window.prompt('Nhập số thứ nhất: '));
let num2 = parseInt(window.prompt('Nhập số thứ hai: '));
let num3 = parseInt(window.prompt('Nhập số thứ ba: '));

max = num1;

if (max < num2) {
    max = num2;
}
if(max<num3) {
    max = num3;
}
alert(`Số lớn nhất là: ${max}`);