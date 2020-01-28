let num = parseInt(window.prompt('Nhập vào 1 số bất kì:'));

if (num > 0) {
    alert('Số bạn nhập lớn hơn 0');
} else {
    if (num < 0) {
        alert('Số bạn nhập bé hơn 0');
    } else {
        if(num === 0){
            alert('Số bạn nhập là số 0');
        } else {
            alert('Cái bạn nhập không phải là số');
        }
    }
}