do {
    var diemLy = Number(prompt('Nhập điểm Lý: '));
    if(diemLy < 0 || diemLy > 10) {
        alert('Điểm không hợp lệ, nhấn F5 để nhập lại!'); break;
    }

    var diemHoa = Number(prompt('Nhập điểm Hoá: '));
    if(diemHoa < 0 || diemHoa > 10) {
        alert('Điểm không hợp lệ, nhấn F5 để nhập lại!'); break;
    }

    var diemSinh = Number(prompt('Nhập điểm Sinh: '));
    if(diemSinh < 0 || diemSinh > 10) {
        alert('Điểm không hợp lệ, nhấn F5 để nhập lại!'); break;
    }

}while(diemLy < 0 || diemLy > 10 || diemHoa < 0 || diemHoa > 10 || diemSinh < 0 || diemSinh > 10);


var tongDiem = diemLy + diemHoa + diemSinh; console.log(tongDiem);
var diemTrungBinh = tongDiem /3; console.log(diemTrungBinh);
alert('Điểm trung bình:'+ diemTrungBinh + ' || '+ 'Tổng điểm:' + tongDiem);