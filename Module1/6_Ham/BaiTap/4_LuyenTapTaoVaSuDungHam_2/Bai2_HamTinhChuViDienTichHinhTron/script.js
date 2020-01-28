let banKinh = parseInt(window.prompt('Nhập bán kính: '));
alert('Chu vi hình tròn: ' + chuVi(banKinh) + '\n' + 'Diện tích hình tròn: ' + dienTich(banKinh));


function chuVi(banKinh) {
    return (2 * Math.PI * banKinh).toFixed(3);
}

function dienTich(banKinh) {
    return (Math.PI* Math.pow(banKinh,2)).toFixed(3);
}