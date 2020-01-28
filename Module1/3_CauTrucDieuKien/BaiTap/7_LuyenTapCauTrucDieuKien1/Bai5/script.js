//Bài 5: Xếp hạng học lực của học sinh dựa trên các điểm bài kiểm tra, điểm thi giữa kỳ, điểm thi cuối kỳ
let diemKiemTra = parseFloat(window.prompt('Nhập điểm bài kiểm tra:'));
let diemGiuaKi = parseFloat(window.prompt('Nhập điểm thi giữa kì:'));
let diemCuoiKi = parseFloat(window.prompt('Nhập điểm thi cuối kì:'));

Xeploai(diemKiemTra, diemGiuaKi, diemCuoiKi);


function Xeploai(diemKiemTra, diemGiuaKi, diemCuoiKi) {
    let diemTrungBinh = (diemKiemTra + diemGiuaKi + diemCuoiKi) / 3;
    if (diemTrungBinh >= 8 && diemTrungBinh <= 10) {
        ShowResult(diemTrungBinh, 'Giỏi');
    }
    if (diemTrungBinh >= 6.5 && diemTrungBinh <= 8) {
        ShowResult(diemTrungBinh, 'Khá');
    }
    if (diemTrungBinh >= 5 && diemTrungBinh <= 6.5) {
        ShowResult(diemTrungBinh, 'Trung bình');
    }
    if (diemTrungBinh >= 3.5 && diemTrungBinh <= 5) {
        ShowResult(diemTrungBinh, 'Yếu')
    }
    if (diemTrungBinh <= 3.5) {
        ShowResult(diemTrungBinh, 'Kém');
    }
}

function ShowResult(diemTrungBinh, xepLoai) {
    alert('Điểm trung bình: ' + diemTrungBinh + ' -- ' + ' Xếp loại: ' + xepLoai);
}