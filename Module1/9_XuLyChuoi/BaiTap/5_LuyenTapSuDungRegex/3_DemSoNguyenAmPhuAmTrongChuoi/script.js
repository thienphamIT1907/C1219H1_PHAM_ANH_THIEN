let input = window.prompt('Enter your string: ');


let regexVowels = /[aeoiu]/ig;
let regexConsonant = /[^aeoiu^\s\d]/ig;


let resultVowels = input.match(regexVowels).length;
let resultConsonant = input.match(regexConsonant).length;


alert(`Your string have: ${resultVowels} vowels (Nguyên âm) and ${resultConsonant} consonants(Phụ âm) `);