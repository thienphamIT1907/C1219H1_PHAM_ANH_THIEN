let regexEmail = /^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\.[A-Za-z0-9]+)$/;

checkValidEmail('a@gmail.com');
checkValidEmail('ab@yahoo.com');
checkValidEmail('abc@hotmail.com');

checkValidEmail('@gmail.com');
checkValidEmail('ab@gmail.');
checkValidEmail('@#abc@gmail.com');


function checkValidEmail(pattern) {
    let regex = /^[A-Za-z0-9]+@[A-Za-z0-9]+(\.[a-z]{3})$/;
    if(regex.test(pattern)) {
        console.log('Email Access !');
    } else console.log('Email Invalid!');
}
