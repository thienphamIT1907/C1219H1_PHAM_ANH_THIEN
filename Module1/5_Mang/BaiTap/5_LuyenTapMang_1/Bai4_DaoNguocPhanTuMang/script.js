let arr = [];
let limit = parseInt(window.prompt('Số phần tử muốn nhập vào mảng: '));
for (let i = 0; i < limit; i++) {
    let item  = parseInt(window.prompt(`Nhập phần tử thứ ${i}:`));
    arr.push(item);
}
document.write('Mảng vừa nhập: Arr = [' + arr + ']' + '<br>');


document.write('Mảng đảo ngược: Arr = [' + arr.reverse() + ']' + '<br>');

