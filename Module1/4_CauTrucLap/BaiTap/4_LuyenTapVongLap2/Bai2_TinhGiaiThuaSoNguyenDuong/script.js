let num = parseInt(window.prompt('Nhập số nguyên dương:'));
let result = 1;

if(num < 0) {
    alert('Số không hợp lệ!');
} else if(num === 0 || num === 1) {
   alert(1);
} else {
    for(let i = 1 ; i <= num; i++) {
         result =  result * i;
    }
    alert(result);
}