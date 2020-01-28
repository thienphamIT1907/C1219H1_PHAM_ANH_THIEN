let n = parseInt(window.prompt('Số chữ số Fibonacci cần tìm: '));
let f0 = 0,
    f1 = 1,
    fn = 0;
if(n <= 0) {
    alert('Số nhập vào không hợp lệ !');
} else {
    document.write(`Số Fibonacci đầu tiên chia hết cho 5 là:` + '<br>');

    for (let i = 0; i < n; i++) {
        if(i >= 2) {
            fn = f0 + f1;
            f0 = f1;
            f1 = fn;
            if(fn % 5 === 0) {
                document.write(fn + ' '); break;
            }
        }
    }
}
