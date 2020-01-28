function showBMI() {
    let chieuCao = parseFloat(document.getElementById('chieuCao').value);
    let canNang = parseFloat(document.getElementById('canNang').value);

    let bmi = canNang / Math.pow(chieuCao,2);

    if (bmi < 18)
        document.getElementById('result').textContent = 'Underweight';
    else if (bmi < 25.0)
        document.getElementById('result').textContent = 'Normal';
    else if (bmi < 30.0)
        document.getElementById('result').textContent = 'Overweight';
    else
        document.getElementById('result').textContent = 'Obese';


}