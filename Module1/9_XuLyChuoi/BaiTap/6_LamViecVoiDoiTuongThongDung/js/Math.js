function getRandomIntInclusive(min, max) {
    min = Math.ceil(min);
    max = Math.floor(max);
    return Math.floor(Math.random() * (max - min + 1)) + min;
}

let randomNumber1 = getRandomIntInclusive(0,10);
document.write(`Số ngẫu nhiên từ 0 -> 10: ${randomNumber1} <br/>`);

let randomNumber2 = getRandomIntInclusive(0,400);
document.write(`Số ngẫu nhiên từ 0 -> 400: ${randomNumber2} <br/>`);

let randomNumber3 = getRandomIntInclusive(50,100);
document.write(`Số ngẫu nhiên từ 50 -> 100: ${randomNumber3} <br/>`);

let min = Math.min(5, 7, 2, 9);
document.write(`Số nhỏ nhất trong dãy 5, 7, 2, 9 là: ${min} <br/>`);

let result = Math.pow(5,3);
document.write(`Kết quả 5 luỹ thừa 3: ${result} <br/>`);

let dienTich = Math.PI * Math.pow(5,2);
document.write(`Diện tích hình tròn bán kính 5cm: ${dienTich} <br/>`);