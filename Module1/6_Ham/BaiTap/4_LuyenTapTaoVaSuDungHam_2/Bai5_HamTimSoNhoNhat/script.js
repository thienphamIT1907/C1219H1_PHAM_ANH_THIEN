let a = parseInt(window.prompt('Enter number 1: '));
let b = parseInt(window.prompt('Enter number 2: '));
let c = parseInt(window.prompt('Enter number 3: '));

findMin(a,b,c);

function findMin(number1, number2, number3) {
    let min = number1;
    if(number2 < min) {
        min = number2;
    }

    if(number3 < min) {
        min = number3;
    }
    alert('Min value: ' + min);

}