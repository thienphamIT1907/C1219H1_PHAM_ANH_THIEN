// Bài 2- Viết chương trình khởi tạo mảng số nguyên gồm 10 phần tử khác nhau. Chương trình hiển thị ra được phần tử có giá trị lớn nhất trong mảng và vị trí của phần tử đó.
let arr = [];
for (let i = 0; i < 10; i++) {
    let item  = parseInt(window.prompt(`Nhập phần tử thứ ${i+1}:`));
    arr.push(item);
}


let max = arr[0];
let pos = 0;
for (let i = 0; i < arr.length; i++) {
    if(arr[i] > max) {
        max = arr[i];
        pos= i;
    }
}

document.write('Vị trí: ' + pos +'<br>');
document.write(('Giá trị lớn nhất: ' + max));
