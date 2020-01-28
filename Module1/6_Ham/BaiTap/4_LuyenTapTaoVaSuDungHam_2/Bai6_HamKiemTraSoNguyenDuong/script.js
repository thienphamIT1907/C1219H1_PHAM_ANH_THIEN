let num = parseInt(window.prompt('Enter number: '));
checkNum(num);

function checkNum(num) {
    if(num >= 0) {
        alert('Your num >= 0');
    } else alert('Your num < 0')
}