
checkPhoneNumber('(84)-(0978489648)');
checkPhoneNumber('(a8)-(22222222)');

function checkPhoneNumber(phoneNumber) {
    let regex = /\(\d{2}\)-\((?:0\d{9})\)/;
    if(regex.test(phoneNumber)) {
        console.log('Success!');
    } else console.log('Failed!');
}