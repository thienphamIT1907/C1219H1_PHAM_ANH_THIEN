// let name = document.getElementById('input-name').value;
// let identityCard = document.getElementById('input-identity-card').value;
// let dateOfBirth = document.getElementById('input-date-of-birth').value;
// let email = document.getElementById('input-email').value;
// let address = document.getElementById('input-address').value;
// let custommersType = document.getElementById('customers-type').value;
// let discount = document.getElementById('input-discount').value;
// let amount = document.getElementById('input-amount').value;
// let dateOfHire = document.getElementById('input-date-of-hire').value;
// let servicesType = document.getElementById('services-type').value;
// let roomsType = document.getElementById('rooms-type').value;

// function ShowItems() {
//     return content =
//         '1 - Name : ' + name + '\n'
//     +   '2 - Identity Card: ' + identityCard + '\n'
//     +   '3 - Date of birth: ' + dateOfBirth + '\n'
//     +   '4 - Email: ' + email + '\n'
//     +   '5 - Address: ' + address + '\n'
//     +   '6 - Customers Type: ' + custommersType + '\n'
//     +   '7 - Discount: ' + discount + '%' + '\n'
//     +   '8 - Amount: ' + amount + '\n'
//     +   '9 - Date Of Hire: ' + dateOfHire + '\n'
//     +   '10 - Services Type: ' + servicesType + '\n'
//     +   '11 - Rooms Type: ' +roomsType + '\n'
// }

function Register() {
    alert('Register Success !');
}

function Menu1_ShowInformation() {
    let name = document.getElementById('input-name').value;
    let identityCard = document.getElementById('input-identity-card').value;
    let dateOfBirth = document.getElementById('input-date-of-birth').value;
    let email = document.getElementById('input-email').value;
    let address = document.getElementById('input-address').value;
    let custommersType = document.getElementById('customers-type').value;
    let discount = document.getElementById('input-discount').value;
    let amount = document.getElementById('input-amount').value;
    let dateOfHire = document.getElementById('input-date-of-hire').value;
    let servicesType = document.getElementById('services-type').value;
    let roomsType = document.getElementById('rooms-type').value;
    alert(
        '==== CUSTOMER INFORMATION ====' + '\n'
        +   '1 - Name : ' + name + '\n'
        +   '2 - Identity Card: ' + identityCard + '\n'
        +   '3 - Date of birth: ' + dateOfBirth + '\n'
        +   '4 - Email: ' + email + '\n'
        +   '5 - Address: ' + address + '\n'
        +   '6 - Customers Type: ' + custommersType + '\n'
        +   '7 - Discount: ' + discount + '%' + '\n'
        +   '8 - Amount: ' + amount + '\n'
        +   '9 - Date Of Hire: ' + dateOfHire + '\n'
        +   '10 - Services Type: ' + servicesType + '\n'
        +   '11 - Rooms Type: ' +roomsType + '\n'
    );
}

function Menu2_EditInformation() {
    let name = document.getElementById('input-name').value;
    let identityCard = document.getElementById('input-identity-card').value;
    let dateOfBirth = document.getElementById('input-date-of-birth').value;
    let email = document.getElementById('input-email').value;
    let address = document.getElementById('input-address').value;
    let custommersType = document.getElementById('customers-type').value;
    let discount = document.getElementById('input-discount').value;
    let amount = document.getElementById('input-amount').value;
    let dateOfHire = document.getElementById('input-date-of-hire').value;
    let servicesType = document.getElementById('services-type').value;
    let roomsType = document.getElementById('rooms-type').value;

    let chooseToEdit = window.prompt(
        'Choose number of property to edit: ' +'\n'
        + '--------------------------------------' + '\n'
        +   '1 - Name : ' + name + '\n'
        +   '2 - Identity Card: ' + identityCard + '\n'
        +   '3 - Date of birth: ' + dateOfBirth + '\n'
        +   '4 - Email: ' + email + '\n'
        +   '5 - Address: ' + address + '\n'
        +   '6 - Customers Type: ' + custommersType + '\n'
        +   '7 - Discount: ' + discount + '%' + '\n'
        +   '8 - Amount: ' + amount + '\n'
        +   '9 - Date Of Hire: ' + dateOfHire + '\n'
        +   '10 - Services Type: ' + servicesType + '\n'
        +   '11 - Rooms Type: ' +roomsType + '\n'
    );
    switch(chooseToEdit) {
        case '1':
            let nameEdit = window.prompt('Edit Name: ');
            name = nameEdit;
            document.getElementById('input-name').value = name;
            break;
        case '2':
            let identityCardEdit = window.prompt('Edit Identity Card: ');
            identityCard = identityCardEdit;
            document.getElementById('input-identity-card').value = identityCard;
            break;
        case '3':
            let dateOfBirthEdit = window.prompt('Edit Date Of Birth (YYYY-MM-dd):');
            dateOfBirth = dateOfBirthEdit;
            document.getElementById('input-date-of-birth').value = dateOfBirth;
            break;
        case '4':
            let emailEdit = window.prompt('Edit Email: ');
            email = emailEdit;
            document.getElementById('input-email').value = email;
            break;
        case '5':
            let addressEdit = window.prompt('Edit Address: ');
            address = addressEdit;
            document.getElementById('input-address').value = address;
            break;
        case '6':
            let custommersTypeEdit = window.prompt('Edit Customers Type: ');
            custommersType = custommersTypeEdit;
            document.getElementById('customers-type').value = custommersType;
            break;
        case '7':
            let discountEdit = window.prompt('Edit Discount: ');
            discount = discountEdit;
            document.getElementById('input-discount').value = discount;
            break;
        case '8':
            let amountEdit = window.prompt('Edit Amount: ');
            amount = amountEdit;
            document.getElementById('input-amount').value = amount;
            break;
        case '9':
            let dateOfHireEdit = window.prompt('Edit Date Of Hire: ');
            dateOfHire = dateOfHireEdit;
            document.getElementById('input-date-of-hire').value = dateOfHire;
            break;
        case '10':
            let servicesTypeEdit = window.prompt('Edit Services Type: ');
            servicesType = servicesTypeEdit;
            document.getElementById('services-type').value = servicesType;
            break;
        case '11':
            let roomsTypeEdit = window.prompt('Edit Rooms Type: ');
            roomsType = roomsTypeEdit;
            document.getElementById('rooms-type').value = roomsType;
            break;
        default: alert('Failed!');
    }
}

function Menu3_ShowAmountAfterDiscount() {
    let dateOfBirth = document.getElementById('input-date-of-birth').value;
    let address = document.getElementById('input-address').value;
    let custommersType = document.getElementById('customers-type').value;
    let discount = document.getElementById('input-discount').value;
    let amount = document.getElementById('input-amount').value;
    let dateOfHire = parseInt(document.getElementById('input-date-of-hire').value);
    let servicesType = document.getElementById('services-type').value;
    let roomsType = document.getElementById('rooms-type').value;
    let pay;

    switch (servicesType) {
        case 'Villa':
            pay = 500 * dateOfHire * (1 - discount / 100);
            break;
        case 'House':
            pay = 300 * dateOfHire * (1 - discount / 100);
            break;
        case 'Room':
            pay = 100 * dateOfHire * (1 - discount / 100);
            break;
    }
    console.log(`Pay: ${pay}`);

    // check address:
    if(address.search('Đà Nẵng') !== -1) {
        pay -= 20;
        console.log('Pay at Da Nang: ' + pay);
    } else if(address.search('Huế') !== -1) {
        pay -= 10;
        console.log('Pay at Hue: ' + pay);
    } else if(address.search('Quảng Nam') !== -1) {
        pay -= 5;
        console.log('Pay at Quang Nam: ' + pay);
    }

    // check date of hire
    if(dateOfHire > 7) {
        pay -= 30;
        console.log('Pay 1: ' + pay);
    }
    if(dateOfHire >= 5 && dateOfHire <= 7 ) {
        pay -= 20;
        console.log('Pay 2: ' + pay);
    }
    if(dateOfHire >=2 && dateOfHire <= 4) {
        pay -=10;
        console.log('Pay 3: ' + pay);
    }

    // check customer type
    switch(custommersType) {
        case 'Diamond': pay -= 15;
            break;
        case 'Platinum': pay -= 10;
            break;
        case 'Gold': pay -= 5;
            break;
        case 'Silver': pay -= 2;
            break;
        case 'Member':
        default:
            break;
    }
    // check age and birthday
    let currenYear = new Date().getFullYear();
    let birthday = new Date(dateOfBirth).getFullYear();
    let ageCustomer = currenYear - birthday;

    if(ageCustomer > 30 && address.search('Đà Nẵng') !== -1) {
        pay -= 2;
    }
    if(ageCustomer >= 20 && ageCustomer <= 30  && address.search('Đà Nẵng') !== -1) {
        pay -= 1;
    }

    alert('PAY INFORMATION:' + '\n'
        + '-----------------------------------' + '\n'
        + 'Address: ' + address + '\n'
        + 'Date Of Hire: ' + dateOfHire + '\n'
        + 'Customers Type: ' + custommersType + '\n'
        + 'Age: ' + ageCustomer + '\n'
        + 'Discount: ' + discount + ' %' + '\n'
        + '-----------------------------------' + '\n'
        + 'TOTAL PAY: ' + pay  + ' $'
    );
}

function Menu() {
    let choose = window.prompt(
        '1. Show Information Customer' + '\n'
        +   '2. Edit Information Customer' + '\n'
        +   '3. Show the amount to be paid after discount ' + '\n'
        +   '0. Exit' + '\n'
        +   '--------------------' + '\n'
        +   'Your Choose: '
    );

    switch(choose) {
        case '1': Menu1_ShowInformation();
            break;
        case '2': Menu2_EditInformation();
            break;
        case '3': Menu3_ShowAmountAfterDiscount();
            break;
        case '0': alert('Exit !');
            break;
        default: alert('Failed!');
    }
}

function checkReview() {
    confirm('Done ! Do you want to review new information ?');
}