do {
    var r = Number(prompt('Nhập bán kính hình tròn: '));
    if (r <= 0 ){
        alert('Bán kính không hợp lệ, nhấn F5 để nhập lại !'); break;
    }
}while(r <= 0);

alert('Chu vi hình tròn là: ' + 2 * Math.PI * r );

