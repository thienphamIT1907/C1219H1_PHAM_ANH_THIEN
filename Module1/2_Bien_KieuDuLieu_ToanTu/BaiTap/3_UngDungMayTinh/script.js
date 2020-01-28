function getFirstNum() {
    let data = document.getElementById('firstNum').value;
    return parseFloat(data);
}

function getSecondNum() {
    let data = document.getElementById('secondNum').value;
    return parseFloat(data);
}

function additionBtn() {
    let result = getFirstNum() + getSecondNum();
    document.getElementById('result').innerHTML = 'Result: '+result;
}

function subtractionBtn() {
    let result = getFirstNum() - getSecondNum();
    document.getElementById('result').innerHTML = 'Result: '+result;
}

function multiplicationBtn() {
    let result = getFirstNum() * getSecondNum();
    document.getElementById('result').innerHTML = 'Result: '+result;
}

function divisionBtn() {
    let result = getFirstNum() / getSecondNum();
    if(result =='Infinity' || result == '-Infinity') {
        document.getElementById('result').innerHTML = 'Result: Cannot divide with 0';
    } else document.getElementById('result').innerHTML = 'Result: '+result;
}