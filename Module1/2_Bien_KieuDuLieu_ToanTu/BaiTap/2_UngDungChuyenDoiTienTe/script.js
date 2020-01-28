function convertMoney() {
    let result;
    const input = Number( document.getElementById('input').value);
    const fromCurrency = document.getElementById('fromCurrency').value;
    const toCurrency = document.getElementById('toCurrency').value;

    if(fromCurrency === toCurrency) {
        result = input;
        document.getElementById('result').innerHTML = '<span>'+ 'Result: ' + result +' '+ fromCurrency +'</span>';
    }
    if(fromCurrency === 'USD' && toCurrency === 'VND') {
        result = input * 23000;
        document.getElementById('result').innerHTML = '<span>'+ 'Result: ' + result +' '+ toCurrency +'</span>';
    }
    if(fromCurrency === 'VND' && toCurrency === 'USD') {
        result = input / 23000;
        document.getElementById('result').innerHTML = '<span>'+ 'Result: ' + result +' '+ toCurrency +'</span>';
    }
}