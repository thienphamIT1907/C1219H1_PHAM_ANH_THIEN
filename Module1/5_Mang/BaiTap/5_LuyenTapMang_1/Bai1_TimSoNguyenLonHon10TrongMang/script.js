// Bài 1- Viết chương trình khởi tạo mảng số nguyên gồm 10 phần tử. Chương trình thực hiện tính và hiển thị xem có bao nhiêu số nguyên lớn hơn hoặc bằng 10.
let arr = [];
for (let i = 0; i < 10; i++) {
    let item  = parseInt(window.prompt(`Nhập phần tử thứ ${i+1}:`));
    arr.push(item);
}
let result=[];
let count = 0;
document.write('Array = [' + arr + ']' + '<br>');
for (let i = 0; i < arr.length; i++) {
    if(arr[i] >= 10) {
        result.push(arr[i]);
        count++;
    }
}
document.write('Số phần tử thoả điểu kiện (>=10): ' + count + '<br>');
document.write('Kết quả: ' + result);

