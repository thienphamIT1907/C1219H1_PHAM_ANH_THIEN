let a = parseFloat(window.prompt('Nhap a: '));
let b = parseFloat(window.prompt('Nhap b: '));
let c = parseFloat(window.prompt('Nhap c: '));

if(a === 0) {
    if(b === 0) {
        if(c === 0) {
            alert('Phương trình vô số nghiệm');
        } else {
            alert('Phương trình vô nghiệm');
        }
    } else alert('Phương trình có 1 nghiệm là x = ' + (-c/b));
} else {
    let x1 ,x2, delta=Math.pow(b,2) - 4*a*c;
    if(delta<0) {
        alert('Phuơng trình vô nghiệm');
    } else {
        if(delta>0) {
            x1=(-b + Math.sqrt(delta))/(2*a);
            x2=(-b - Math.sqrt(delta))/(2*a);
            alert('Phương trình có 2 nghiệm phân biệt:' + '\n'
                + 'x1 = ' + x1 + '\n'
                + 'x2 = ' + x2
            );
        } else {
            alert('Phương trình có nghiệm kép x1 = x2 = ' + (-b/(2*a)));
        }
    }
}
