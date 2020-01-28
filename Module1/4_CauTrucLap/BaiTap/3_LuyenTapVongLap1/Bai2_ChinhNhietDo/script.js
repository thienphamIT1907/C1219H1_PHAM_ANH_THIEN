while(1) {
    let inputTemp = parseFloat(window.prompt('Nhiệt độ hiện tại: '));
    if(inputTemp >= 100) {
        alert('Giảm nhiệt độ !');
    } else if(inputTemp <= 20) {
        alert('Tăng nhiệt độ !');
    } else alert('Nhiệt độ bình thường!');
}