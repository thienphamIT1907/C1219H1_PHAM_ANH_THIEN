let input = window.prompt('Enter something: ');
checkNumber(input);

function checkNumber(input) {
    if(!isNaN(input)) {
        input = Number.parseFloat(input);
        if(Number.parseInt(input)) {
            alert('A number !')
        }
    } else alert('Not a number');
}