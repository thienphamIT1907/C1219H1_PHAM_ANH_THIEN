

check('123abc_');
check('_abc123');
check('______');
check('123456');
check('abcdefg');


check('.@');
check('12345');
check('1234_');
check('abcde ');



function check(account) {
    let regex = /^[_a-z0-9]{6,}$/;
    if(regex.test(account)) {
        console.log('Access !')
    } else console.log('Failed');
}