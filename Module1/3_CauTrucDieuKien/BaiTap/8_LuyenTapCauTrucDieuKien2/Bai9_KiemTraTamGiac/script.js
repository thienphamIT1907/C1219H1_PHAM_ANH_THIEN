let a = parseFloat(window.prompt('Nhập cạnh a: '));
let b = parseFloat(window.prompt('Nhập cạnh b: '));
let c = parseFloat(window.prompt('Nhập cạnh c: '));

if (a > 0 && b > 0 && c > 0) {
    if (a + b > c || b + c > a || a + c > b) {
        alert('Là hình tam giác');
    } else {
        alert('Không phải hình tam giác');
    }
} else {
    alert('Không phải hình tam giác');
}