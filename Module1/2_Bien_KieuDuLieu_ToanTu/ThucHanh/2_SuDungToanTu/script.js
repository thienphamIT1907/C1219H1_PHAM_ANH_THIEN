do {
    var inputChieuDai = prompt('Nhập chiều dài');
    var inputChieuRong = prompt('Nhập chiều rộng');

    if(inputChieuRong <= 0 || inputChieuRong == '') alert('Chiều rộng không hợp lệ! Nhấn F5 để nhập lại');
    if(inputChieuDai <= 0 || inputChieuDai == '') alert('Chiều dài không hợp lệ! Nhấn F5 để nhập lại');

} while(inputChieuRong <= 0 || inputChieuDai <= 0 || inputChieuRong == '' || inputChieuDai == '');



alert('Diện tích của hình chữ nhật là: ' + inputChieuDai * inputChieuRong);
