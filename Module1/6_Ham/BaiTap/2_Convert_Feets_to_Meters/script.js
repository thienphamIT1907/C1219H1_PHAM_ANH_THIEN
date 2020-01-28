let choose = window.prompt('1. Meters -> Feet' + '\n' + '2. Feet -> Meters');
let input, result;

switch (choose) {
    case '1':
        input = parseFloat(window.prompt('Enter number: '));
        result = meterToFeet(input).toFixed(3);
        alert(`${input}m = ${result} feet`);
        break;
    case '2':
        input = parseFloat(window.prompt('Enter number: '));
        result = feetToMeter(input).toFixed(3);;
        alert(`${input} feet = ${result}m`);
        break;
    default: alert('Exit');
        break;
}

function feetToMeter(num) {
    return num * 0.305;
}

function meterToFeet(num) {
    return num / 0.305;
}


