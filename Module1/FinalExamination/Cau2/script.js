let input = parseInt(prompt('Nhập số: '));
alert(isMainNumber(input));

function isMainNumber(num) {
    return (Math.pow(Math.sqrt(num),2) === num);
}
