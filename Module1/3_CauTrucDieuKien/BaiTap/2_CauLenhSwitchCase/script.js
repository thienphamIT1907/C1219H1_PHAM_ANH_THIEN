/*
    - Tháng có 31 ngày: 1 3 5 7 8 10 12
    - Tháng có 30 ngày: 4 6 9 11
    - Tháng có 28 or 29 ngày: 2

 */

function showDays() {
    let inputMonth = document.getElementById('input-month').value;
    console.log(inputMonth)

    let result = document.getElementById('result');

    switch (inputMonth) {
        case '1':
        case '3':
        case '5':
        case '7':
        case '8':
        case '10':
        case '12':
            result.innerText = `Tháng ${inputMonth} có 31 ngày.`;
            break;
        case '4':
        case '6':
        case '9':
        case '11':
            result.innerText = `Tháng ${inputMonth} có 30 ngày.`;
            break;
        case '2':
            result.innerText = `Tháng ${inputMonth} có 28 hoặc 29 ngày.`;
            break;

        default:
            result.innerText = `Dữ liệu không hợp lệ !`;
            break;
    }
}