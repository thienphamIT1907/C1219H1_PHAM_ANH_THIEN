let input = parseInt(window.prompt('Input your number: '));
let checkPrime = isPrime(input);
if(checkPrime) {
    alert(`${input} is a prime number !`)
} else alert(`${input} is not a prime number !`)

function isPrime(number) {
    if(number <= 1) {
        return false;
    }
    for(let i = 2; i < number; i++) {
        if(number % i === 0) {
            return false;
        }
    }
    return true;
}