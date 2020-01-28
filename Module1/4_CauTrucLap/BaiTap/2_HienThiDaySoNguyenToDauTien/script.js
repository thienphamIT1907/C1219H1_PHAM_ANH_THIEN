let limitPrime = window.prompt('Bạn muốn nhập bao nhiêu số?: ');
let inputPrime = 0;

document.write('Các số nguyên tố trong dãy bạn vừa nhập: ');
while(inputPrime < limitPrime) {
    if(isPrime(inputPrime)) {
        document.write(inputPrime + ' ');
    }
    inputPrime++;
}

function isPrime(num) {
    if(num <= 1) {
        return false;
    }
    for(let i = 2; i < num; i++) {
        if(num % i === 0) {
            return false;
        }
    }
    return true;
}

