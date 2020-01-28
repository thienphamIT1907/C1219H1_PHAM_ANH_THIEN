function showInfomation() {
    let ten = document.getElementById('input-name').value;
    let cmnd = document.getElementById('input-cmnd').value;
    let ngaySinh = document.getElementById('input-date').value;
    let email = document.getElementById('input-email').value;
    let diaChi = document.getElementById('input-address').value;
    let loaiKH = document.getElementById('input-loai-kh').value;
    let giamGia = document.getElementById('input-giam-gia').value;
    let soLuong = document.getElementById('input-so-luong-di-kem').value;
    let soNgayThue = document.getElementById('input-so-ngay-thue').value;
    let loaiDV = document.getElementById('input-dich-vu').value;
    let loaiPhong = document.getElementById('input-loai-phong').value;
    let giaTien;

    document.getElementById('title').innerHTML = '<h2>' + 'Đăng kí thành công !' + '</h2>';

    //( Số tiền phải trả  = giá loại dịch vụ X số ngày X ( 1 – giảm giá/100 ) )
    // -	Villa 500$/ 1 ngày
    // -	House 300$/1 ngày
    // -	Room: 100$/1 ngày

    switch (loaiDV) {
        case 'Villa':
            giaTien = 500 * soNgayThue * (1 - giamGia / 100);
            break;
        case 'House':
            giaTien = 300 * soNgayThue * (1 - giamGia / 100);
            break;
        case 'Room':
            giaTien = 100 * soNgayThue * (1 - giamGia / 100);
            break;
    }

    // let showDiv = document.getElementById('show-infomation');
    // if(showDiv.style.display === 'block') {
    //    showDiv.style.display = 'none';
    // } else {
    //    showDiv.style.display = 'block';
    // }
    let infoArr = [ten, cmnd, ngaySinh, email, diaChi, loaiKH, giamGia, soLuong, soNgayThue, loaiDV, loaiPhong];
    document.getElementById('info-list').innerHTML = infoArr.map(item => '<li>' + item + '</li>').join('');
    document.getElementById('total-pay').innerText = `Giá tiền: ${giaTien} $`;

}