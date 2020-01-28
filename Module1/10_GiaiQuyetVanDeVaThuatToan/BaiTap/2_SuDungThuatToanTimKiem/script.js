let phoneNumArr=[
    '0169854365',
    '0796606996',
    '0165321512',
    '01321235125'
];
let regex = /^[01695]+\d{3}\d{3}$/;
let content = 'Viettel Number: ';

for (let i = 0; i < phoneNumArr.length; i++) {
    if(regex.test(phoneNumArr[i])) {
        content += phoneNumArr[i] + ' ';
    }
}
alert(content);