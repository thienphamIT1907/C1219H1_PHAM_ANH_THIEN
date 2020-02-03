// let myArr = new Array(10);
// for(let i = 0; i < myArr.length; i++) {
//     myArr[i] = getRandomIntNumber(1,100);
// }

let arr = [10, 30, 50, 90, 40, 20, 60];
// let number = parseInt(window.prompt('Enter your number: '));

console.time('Linear Search: ');
linearSearch(50);
console.timeEnd('Linear Search: ');

arr.sort((num1, num2) => num1 - num2);
console.time('Binary Search: ');
console.log(binarySearch(arr,50));
console.timeEnd('Binary Search: ');



// function getRandomIntNumber(min, max) {
//     min = Math.ceil(min);
//     max = Math.floor(max);
//     return Math.floor(Math.random() * (max - min)) + min;
// }

function linearSearch(number) {
    let result = arr.includes(number);
    if(result) {
        console.log('Found it !');
    } else console.log('Not found !');
}

function binarySearch(arr,number) {
    let leftPos = 0;
    let rightPos = arr.length;

    while(leftPos <= rightPos) {
        let midPos = Math.floor((leftPos + rightPos) / 2);
        if(arr[midPos] === number) {
            return true;
        } else if(arr[midPos] < number) {
            leftPos = midPos + 1;
        } else {
            rightPos = midPos -1;
        }
    }
    return false;
}