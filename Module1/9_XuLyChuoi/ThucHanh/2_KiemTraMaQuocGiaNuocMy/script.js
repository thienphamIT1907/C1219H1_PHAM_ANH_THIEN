let regex = /^[0-9]{5}(?: - [0-9]{4})?$/;

function is_usZipCode(str) {
    return regex.test(str);
}

let zipcode = '03201 -2150';
console.log(is_usZipCode(zipcode));

zipcode = '11111';
console.log(is_usZipCode(zipcode));
zipcode = '11111 - 12312';
console.log(is_usZipCode(zipcode));