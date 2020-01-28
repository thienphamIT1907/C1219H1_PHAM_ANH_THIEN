let num = parseInt(window.prompt('Enter number: '));

alert(tinhGiaiThua(num));

function tinhGiaiThua(num) {
    let result = 1;
    for(let i = 1; i <= num; i++) {
        result *= i;
    }
    return result;
}