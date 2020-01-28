let arr = [];
for (let i = 0; i < 10; i++) {
    let item  = parseInt(window.prompt(`Nhập phần tử thứ ${i}:`));
    arr.push(item);
}
document.write('Mảng vừa nhập: Arr = [' + arr + ']' + '<br>');

let searchElement = parseInt(prompt('Nhập phần tử số nguyên muốn tìm: '));

if(arr.includes(searchElement)) {
    document.write('Số nguyên ' + searchElement + ' có trong mảng')
} else document.write('Số nguyên ' + searchElement + ' không có trong mảng');