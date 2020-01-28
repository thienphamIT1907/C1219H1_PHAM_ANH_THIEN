let arr = [];
//let tempArr = [1,2,3,4,5,6,7,8,9,10];
for (let i = 0; i < 10; i++) {
    let item  = parseInt(window.prompt(`Nhập phần tử thứ ${i}:`));
    arr.push(item);
}
document.write('Mảng vừa nhập: Arr = [' + arr + ']' + '<br>');

let searchElement = parseInt(prompt('Nhập phần tử số nguyên muốn tìm: '));

if(arr.includes(searchElement)) {
   let check = confirm('Số nguyên ' + searchElement + ' có trong mảng. Xoá? ');
   if(check) {
       console.log('before: ' + arr);
       for(let i = 0; i < arr.length; i++) {
           if(searchElement === arr[i]) {
               for(let j = i; j < arr.length; j++) {
                   arr[j] = arr[j+1];
               }
               arr[arr.length - 1] = 0;
           }
       }
        document.write('Mảng sau khi xoá: Arr = [' + arr + ']' + '<br>');
   } else alert('Exit!');
} else document.write('Số nguyên ' + searchElement + ' không có trong mảng');
