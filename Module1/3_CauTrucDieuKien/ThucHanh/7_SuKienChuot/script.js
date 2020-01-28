let ami = null; //tạo biến ami để lưu ảnh
ami = document.getElementById('ami-fat'); // sử dụng DOM để gán cho ami

//khởi tạo đối tượng ami
function init() {
    ami = document.getElementById('ami-fat');
    ami.style.position = 'relative';
    ami.style.left = '0px';
}

//Xử lí sự kiện di chuyển qua phải
function MoveToRight() {
    ami.style.left = parseInt(ami.style.left) + 10 + 'px';
}

window.onload = init;

