// Bài 3- Viết chương trình khởi tạo mảng số nguyên. Hiển hiện giá trị lớn nhất trong mảng đó. In ra giá trị trung bình của các phần tử trong mảng.
let arr = [];
let limit = parseInt(window.prompt('Số phần tử muốn nhập vào mảng: '));
for (let i = 0; i < limit; i++) {
    let item  = parseInt(window.prompt(`Nhập phần tử thứ ${i}:`));
    arr.push(item);
}
document.write('Mảng vừa nhập: Arr = [' + arr + ']' + '<br>');


let max= arr[0];
for (let i = 0; i < arr.length; i++) {
    if(max < arr[i]) {
        max = arr[i];
    }
}
document.write('Giá trị lớn nhất: ' + max + '<br>');


let total = arr.reduce((sum,num) => (sum + num),0);
let avg = total/arr.length;
document.write('Gía trị trung bình của mảng: ' + avg);


