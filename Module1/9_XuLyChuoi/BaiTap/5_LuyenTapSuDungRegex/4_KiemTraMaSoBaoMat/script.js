
//code number pattern: XX-XXXX-abcd


let input = window.prompt('Enter your code number: ');
let regex = /^\d{2}-\d{4}-[^\d\s]{4}$/;

if(regex.test(input)) {
    alert('Success!');
} else alert('Failed');
