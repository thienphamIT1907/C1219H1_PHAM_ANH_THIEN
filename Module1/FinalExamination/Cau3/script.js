let arrScore = [];
let amount = parseInt(prompt('Enter number of score: '));

for(let i = 0; i < amount; i++) {
    let input = parseInt(prompt(`Enter your score: `));
    arrScore.push(input);
}

findMaxScore(arrScore);

function findMaxScore(arr) {
    let max = arr[0];
    let i;
    for(i = 0; i < arr.length; i++) {
        if(max < arr[i]) {
            max = arr[i];
        }
    }
    alert(`max: ${max} | index: ${arr.lastIndexOf(max)} `);
}