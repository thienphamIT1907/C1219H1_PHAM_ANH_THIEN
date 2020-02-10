let arr = [];

for(let i = 0; i < 5; i++) {
    let input = parseInt(prompt(`Enter your number ${i+1}: `));
    arr.push(input);
    arr.sort((a,b) => a-b);
}

alert(`Your arr sorted: ${arr.join(' - ')}` );