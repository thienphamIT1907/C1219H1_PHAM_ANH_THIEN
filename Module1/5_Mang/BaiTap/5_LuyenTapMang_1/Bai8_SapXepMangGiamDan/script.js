let arr = [];
// let arr = [23,4, 2, 5, 3, 1,100,25];
let result = [];
let temp;
for (let i = 0; i < 10; i++) {
    let item  = parseInt(window.prompt(`Nhập phần tử thứ ${i}:`));
    arr.push(item);
}
document.write('Mảng vừa nhập: Arr = [' + arr + ']' + '<br>');

for (let i = 0; i < arr.length; i++) {
    for (let j = arr.length; j > i; j--) {
        if (arr[j] > arr[j - 1]) {
            temp = arr[j];
            arr[j] = arr[j - 1];
            arr[j - 1] = temp;
        }
    }
}
document.write('Mảng sắp xếp giảm dần: Arr = [' + arr + ']' + '<br>');

