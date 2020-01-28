let arr1 = [], arr2 =[], totalArray = [];
let result = [];
for (let i = 0; i < 10; i++) {
    let item  = parseInt(window.prompt(`Mảng 1 -- Nhập phần tử thứ ${i}:`));
    arr1.push(item);
}

for (let i = 0; i < 10; i++) {
    let item  = parseInt(window.prompt(`Mảng 2 -- Nhập phần tử thứ ${i}:`));
    arr2.push(item);
}

let bigArr = totalArray.concat(arr1,arr2);
document.write('Mảng vừa nhập: a = [' + arr1 + ']' + '<br>');
document.write('Mảng vừa nhập: b = [' + arr2 + ']' + '<br>');
document.write('Mảng tổng: c = [' + bigArr + ']' + '<br>');

