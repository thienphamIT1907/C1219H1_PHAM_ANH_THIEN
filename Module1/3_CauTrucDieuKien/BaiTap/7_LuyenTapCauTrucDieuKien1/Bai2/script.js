let age = parseInt(window.prompt('Nhập tuổi: '));
Check(age);

function Check(age) {
    if(age >= 15) {
        alert('Học sinh đủ tuổi học lớp 10 !');
    } else {
        if(age <= 0) {
            alert('Tuổi của học sinh không hợp lệ !');
        } else  alert('Học sinh không đủ tuổi học lớp 10 !');
    }
}
