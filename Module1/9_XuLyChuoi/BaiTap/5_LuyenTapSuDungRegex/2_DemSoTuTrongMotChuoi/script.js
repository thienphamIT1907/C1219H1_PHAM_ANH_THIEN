let input = window.prompt('Enter your string: ');
let regex = /\b\w+\b/igm;
let numbersOfWords = input.match(regex).length;

alert(`Your string have: ${numbersOfWords} words`);