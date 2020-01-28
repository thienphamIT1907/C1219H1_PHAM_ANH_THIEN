let thuNhap = parseInt(window.prompt('Thu nhập của bạn: '));
let thuNhapSauThue = parseInt(window.prompt('Thu nhập sau thuế của bạn: '));


let mucThue = 100 - (thuNhapSauThue * 100 / thuNhap);

if(mucThue < 0) {
    alert(`Số liệu không hợp lệ !`);
} else alert(`Mức thuế bạn phải chịu là ${mucThue}%`);