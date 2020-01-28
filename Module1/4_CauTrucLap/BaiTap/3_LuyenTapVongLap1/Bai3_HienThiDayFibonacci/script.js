let n = parseInt(window.prompt('Số chữ số Fibonacci cần tìm: '));
let f0 = 0,
    f1 = 1,
    fn = 0;
if(n <= 0) {
    alert('Số nhập vào không hợp lệ !');
} else {
    document.write('Dãy số Fibonacci cần tìm là: ' + '<br/>');

    for (let i = 0; i < n; i++) {
        if(i < 2) {
            document.write(i + '<br/>'); // trùng với giá trị của f0, f1
        } else {
            fn = f0 + f1;
            f0 = f1;
            f1 = fn;
            document.write(fn + '<br/>');
        }
    }
}
