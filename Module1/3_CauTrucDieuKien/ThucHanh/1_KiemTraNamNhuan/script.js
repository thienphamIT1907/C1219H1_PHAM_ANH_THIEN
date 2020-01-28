let year= parseInt(prompt('Enter a year: '));
let isLeapYear = false;

if(year % 4 == 0) {
    if(year % 100 == 0) {
        if(year % 400 == 0) {
            isLeapYear = true;
        }
    } else {
        isLeapYear = true;
    }
}

if(isLeapYear) {
    alert(year + " is a leap year");
} else {
    alert(year + " is not a leap year")
}

/*
Cách xác định năm nhuận: Những năm chia hết cho 4 là năm nhuận, ngoại trừ những năm chia hết cho 100 mà không chia hết cho 400.

Từ đó, có thể rút gọn thành các quy tắc xác định năm nhuận:

Những năm chia hết cho 4 mà không chia hết cho 100 là năm nhuận

Những năm chia hết cho 100 mà không chia hết cho 400 thì KHÔNG PHẢI là năm nhuận

Những năm chia hết đồng thời cho 100 và 400 là năm nhuận
 */