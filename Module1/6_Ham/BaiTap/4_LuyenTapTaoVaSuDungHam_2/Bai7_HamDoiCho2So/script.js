let a = parseInt(window.prompt('Enter a: '));
let b = parseInt(window.prompt('Enter b: '));

swapNumber(a,b);

function swapNumber(a,b) {
    let temp = a;
    a = b;
    b = temp;
    alert(`a = ${a} | b = ${b}`);
}
