let num1 = parseInt(window.prompt('Nhập số a: '));
let num2 = parseInt(window.prompt('Nhập số b: '));

(num1 % num2 === 0 || num2 % num1 === 0)? alert('a chia hết cho b'): alert('a không chia hết cho b');
