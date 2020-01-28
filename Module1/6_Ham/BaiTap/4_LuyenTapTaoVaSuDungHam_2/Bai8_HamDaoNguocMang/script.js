let a = [1,2,3,4,5,6,7,8,9,10];
document.write('Current Array: ' + a + '<br>');
reserveArray(a);

function reserveArray(arr) {
    let result = arr.reverse();
    document.write('Reverse Array: ' + result);
}