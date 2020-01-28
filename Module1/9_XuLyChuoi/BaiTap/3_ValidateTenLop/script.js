checkNameClass('C0318G');

checkNameClass('M0318G');
checkNameClass('P0323A');




function checkNameClass(nameClass) {
    let regex = /^[CAP]\d{4}[GHIKLM]$/;
    if(regex.test(nameClass)) {
        console.log('Success !');
    } else console.log('Failed');
}