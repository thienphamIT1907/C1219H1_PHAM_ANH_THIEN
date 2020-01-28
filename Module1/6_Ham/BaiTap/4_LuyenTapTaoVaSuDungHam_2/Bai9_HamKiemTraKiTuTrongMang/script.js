let charArr = ['a','b','d','e','z','y','b','b','a'];

find(charArr,'a');


function find(arr, input) {
    let count = 0;
    arr.forEach(char => {
        if(char === input) {
            count++;
        }
    });
    if(count === 0) {
        alert('your input not found !');
    } else {
        alert('Find it with ' + count + ' times')
    }
}



