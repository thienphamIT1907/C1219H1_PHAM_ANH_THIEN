let a = parseFloat(window.prompt('Nhập a:'));
let b = parseFloat(window.prompt('Nhập b:'));

if(a === 0) {
    if(b === 0) {
        alert(`Phương trình có vô số nghiệm.`);
    } else {
        alert(`Phương trình vô nghiệm.`);
    }
} else {
    alert('Phương trình có 1 nghiệm là : x = ' + (-b/a));
}