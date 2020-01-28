let count = 0;
let inputString = window.prompt('Nhập chuỗi của bạn: ');
document.write(`Chuỗi vừa nhập: ${inputString} <br>`);


stringArr = Array.from(inputString.toLowerCase());

stringArr.map(item => {
    if(item === 'u' || item === 'e' || item === 'o' || item === 'a' || item === 'i')
        return count++;
});

document.write(`Số nguyên âm trong chuỗi: ${count}`);
