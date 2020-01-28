let f0 = 0,
    f1 = 1,
    fn = 0;
    count = 20;

document.write('Tổng 20 số Fibonacci cần tìm: ');
let total = 0;
for (let i = 0; i < count; i++) {
    if(i < 2) {
        total += i;
    } else {
        fn = f0 + f1;
        f0 = f1;
        f1 = fn;
        total += fn;
    }
}
document.write(total);

