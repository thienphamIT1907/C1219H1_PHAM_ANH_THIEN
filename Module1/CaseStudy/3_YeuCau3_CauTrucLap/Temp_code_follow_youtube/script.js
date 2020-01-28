function registerButton() {
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

    //yeucau3 - task1
    let checkValidate = false;
    let email;
    let birthday;
    let identityCard;
    let discount;
    let amount;
    let dateOfHire;

    //yeucau3 - task2
    let name = prompt('Enter Customer\'s name:');
    let nameStandard = ''; //khai bao bien de cong don ten sau khi dc validate
    name = name.trim().toLocaleLowerCase();
    for (let i = 0; i < name.length; i++) {
        if (name.charAt(i) === ' ' && name.charAt(i+1) === ' ') { //kiemtra 2 ki tu lien tiep co phai space khong
            continue;
        }
        //check vi tri dau de in hoa va vi tri phia trc no la khoang trang thi in hoa
        if(i ===  0 || name.charAt(i-1) === ' ') {
            nameStandard += name.charAt(i).toLocaleUpperCase();
            continue // neu k continue se thuc hien tiep dong` duoi'
        }
        nameStandard += name.charAt(i); //cong don chu cai vao`
    }
    name = nameStandard;

    console.log(name);

    //validate email
    do {
        checkValidate = true;
        email = window.prompt('Enter email:');
        let countDot = 0;
        let countAt = 0;
        for(let i = 0; i < email.length; i++) {
            if(email.charAt(i) === '@') {
                countAt++;
            }
            if(email.charAt(i) === '.') {
                countDot++;
            }
        }
        if(countAt !== 1 || countDot < 1) {
            checkValidate = false;
            alert('Email Invalid! Try again!');
        }
    }while(!checkValidate);

    //validate birthday
    do {
        checkValidate = false;
        birthday = window.prompt('Enter birthday:');
        if(birthday.charAt(2) !== '/' || birthday.charAt(5) !== '/') {
            alert('Birthday invalid ! Try again !');
            continue;
        }
        let day = birthday.substring(0,2);
        let month = birthday.substring(3,5);
        let year = birthday.substring(6,10);

     //kiem tra ngay thang nam la chuoi
        if(!isNaN(day) && !isNaN(month) && !isNaN(year)) { //kiem tra ngay thang nam la so
            day = Number.parseFloat(day);   //parse chuoi qua so float
            month = Number.parseFloat(month);
            year = Number.parseFloat(year);
            if(Number.isInteger(day) && Number.isInteger(month) && Number.isInteger(year)) { // kiem tra so float phai integer khong
                if(day > 0 && day < 32 && month > 0 && month < 13 && year >= 1960 && year <= 2019) {
                    checkValidate = true;
                }
            }
        }
        if(!checkValidate) {
            alert('Birthday invalid ! Try again !');
        }
    }while(!checkValidate);

    //validate idcard
    do{
        checkValidate = true;
        identityCard = window.prompt('Enter ID card:');
        if(isNaN(identityCard)) { //kiem tra id card co phai la chuoi k. true -> continue
            alert('ID card Invalid!');
            continue;
        }
        identityCard = Number.parseFloat(identityCard);
        if(!Number.isInteger(identityCard)) {
            alert('ID card Invalid!');
            continue;
        }
        if(identityCard >= 100000000 && identityCard <= 999999999) {
            checkValidate = true;
        } else {
            alert('ID card Invalid!');
        }
    }while(!checkValidate);

        alert('Email:' + email + '\n' + 'Birthday: '+ birthday + '\n' + 'Id card: ' + identityCard);

    //validate discount
    do {
        checkValidate = false;
        discount = window.prompt('Enter discount:');
        if(!isNaN(discount)) {
            discount = Number.parseFloat(discount);
            if(discount >= 0) {
                checkValidate = true;
            }
        }
        if(!checkValidate) {
            alert('Discount Invalid!')
        }
    }while(!checkValidate);

    // validate amount
    do {
        checkValidate = false;
        amount = window.prompt('Enter amount:');
        if(!isNaN(amount)) {
            amount = Number.parseFloat(amount);
            if(amount >= 0 && Number.isInteger(amount)) {
                checkValidate = true;
            }
        }
        if(!checkValidate) {
            alert('Amount Invalid!');
        }
    }while(!checkValidate);

    //validate date of hire
    do {
        checkValidate = false;
        dateOfHire = window.prompt('Enter date of hire:');
        if(!isNaN(dateOfHire)) {
            dateOfHire = Number.parseFloat(dateOfHire);
            if(dateOfHire >= 0 && Number.isInteger(dateOfHire)) {
                checkValidate = true;
            }
        }
        if(!checkValidate) {
            alert('Date of hire Invalid!');
        }
    } while (!checkValidate);

        //alert('Register Success !');
    }
        function menuButton() {
            //GET DATA
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
            let pay;

            //SHOW PROPERTIES OF LIST
            function showListProperty() {
                return content =
                    '1 - Name : ' + name + '\n'
                    +   '2 - Identity Card: ' + identityCard + '\n'
                    +   '3 - Date of birth: ' + dateOfBirth + '\n'
                    +   '4 - Email: ' + email + '\n'
                    +   '5 - Address: ' + address + '\n'
                    +   '6 - Customers Type: ' + custommersType + '\n'
                    +   '7 - Discount: ' + discount + '%' + '\n'
                    +   '8 - Amount: ' + amount + '\n'
                    +   '9 - Date Of Hire: ' + dateOfHire + '\n'
                    +   '10 - Services Type: ' + servicesType + '\n'
                    +   '11 - Rooms Type: ' + roomsType + '\n';
            }
            //REVIEW AFTER EDIT
            function checkReview() {
                let check = confirm('Done ! Do you want to review new information ?');
                if(check) {
                    alert(showListProperty());
                } else alert('Exit !')
            }
            //MENU 1 - SHOW INFORMATION
            function Menu1_ShowInformation() {
                alert('==== CUSTOMER INFORMATION ====' + '\n'+ showListProperty());
            }
            //MENU2 - EDIT INFOMATION
            function Menu2_EditInformation() {
                let chooseToEdit = window.prompt(
                    'Choose number of property to edit: ' +'\n'
                    + '--------------------------------------' + '\n'
                    + showListProperty()
                );
                switch(chooseToEdit) {
                    case '1':
                        let nameEdit = window.prompt('Edit Name: ');
                        name = nameEdit;
                        document.getElementById('input-name').value = name;
                        checkReview();
                        break;
                    case '2':
                        let identityCardEdit = window.prompt('Edit Identity Card: ');
                        identityCard = identityCardEdit;
                        document.getElementById('input-identity-card').value = identityCard;
                        checkReview();
                        break;
                    case '3':
                        let dateOfBirthEdit = window.prompt('Edit Date Of Birth (YYYY-MM-dd):');
                        dateOfBirth = dateOfBirthEdit;
                        document.getElementById('input-date-of-birth').value = dateOfBirth;
                        checkReview();
                        break;
                    case '4':
                        let emailEdit = window.prompt('Edit Email: ');
                        email = emailEdit;
                        document.getElementById('input-email').value = email;
                        checkReview();
                        break;
                    case '5':
                        let addressEdit = window.prompt('Edit Address: ');
                        address = addressEdit;
                        document.getElementById('input-address').value = address;
                        checkReview();
                        break;
                    case '6':
                        let custommersTypeEdit = window.prompt('Edit Customers Type: ');
                        custommersType = custommersTypeEdit;
                        document.getElementById('customers-type').value = custommersType;
                        checkReview();
                        break;
                    case '7':
                        let discountEdit = window.prompt('Edit Discount: ');
                        discount = discountEdit;
                        document.getElementById('input-discount').value = discount;
                        checkReview();
                        break;
                    case '8':
                        let amountEdit = window.prompt('Edit Amount: ');
                        amount = amountEdit;
                        document.getElementById('input-amount').value = amount;
                        checkReview();
                        break;
                    case '9':
                        let dateOfHireEdit = window.prompt('Edit Date Of Hire: ');
                        dateOfHire = dateOfHireEdit;
                        document.getElementById('input-date-of-hire').value = dateOfHire;
                        checkReview();
                        break;
                    case '10':
                        let servicesTypeEdit = window.prompt('Edit Services Type: ');
                        servicesType = servicesTypeEdit;
                        document.getElementById('services-type').value = servicesType;
                        checkReview();
                        break;
                    case '11':
                        let roomsTypeEdit = window.prompt('Edit Rooms Type: ');
                        roomsType = roomsTypeEdit;
                        document.getElementById('rooms-type').value = roomsType;
                        checkReview();
                        break;
                    default: alert('Failed!');
                }
            }
            //MENU3 - SHOW AMOUNT AFTER DISCOUNT
            function Menu3_ShowAmountAfterDiscount() {
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
                // CHECK ADDRESS
                if(address.search('Đà Nẵng') !== -1) {
                    pay -= 20;
                } else if(address.search('Huế') !== -1) {
                    pay -= 10;
                } else if(address.search('Quảng Nam') !== -1) {
                    pay -= 5;
                }
                // CHECK DATE OF HIRE
                if(dateOfHire > 7) {pay -= 30;}
                if(dateOfHire >= 5 && dateOfHire <= 7) {pay -= 20;}
                if(dateOfHire >=2 && dateOfHire <= 4) {pay -=10;}
                // CHECK CUSTOMER TYPE
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
                // CHECK AGE + BIRTHDAY
                let currenYear = new Date().getFullYear();
                let birthday = new Date(dateOfBirth).getFullYear();
                let ageCustomer = currenYear - birthday;
                if(ageCustomer > 30 && address.search('Đà Nẵng') !== -1) {pay -= 2;}
                if(ageCustomer >= 20 && ageCustomer <= 30  && address.search('Đà Nẵng') !== -1) {pay -= 1;}
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