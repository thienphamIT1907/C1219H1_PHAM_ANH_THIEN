let listCustomers = [];

let checkDeleteCustomer = false;
let checkEditCustomer = false;
let checkDisplayTotalPay = false;



let validateBirthday = /^((0)[1-9]|[1-2][0-9]|(3)[0-1])(\/)((0)[1-9]|((1)[0-2]))(\/)\d{4}$/;
let validateEmail = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
// let validateEmail = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;

function addNewCustomer() {
    let checkBirthday = false;
    let checkEmail = false;

    let customer = new Customer();

    customer.setName(window.prompt('Name: '));
    customer.setIdCard(window.prompt('Id Card: '));

    do {
        customer.setBirthday(window.prompt('Birthday: '));
        if(validateBirthday.test(customer.getBirthday())) {
            checkBirthday = true;
        } else {
            alert('Birthday Invalid! Try again!');
        }
    }while(!checkBirthday);

    do {
        customer.setEmail(window.prompt('Email: '));
        if(validateEmail.test(customer.getEmail())) {
            checkEmail = true;
        } else {
            alert('Email Invalid! Try again!');
        }
    } while(!checkEmail);

    customer.setAddress(window.prompt('Address: '));
    customer.setCustomerType(window.prompt('Customer Type: '));
    customer.setDiscount(window.prompt('Discount: '));
    customer.setAmount(window.prompt('Amount: '));
    customer.setDateOfHire(window.prompt('Date of hire: '));
    customer.setServiceType(window.prompt('Service Type: '));
    customer.setRoomType(window.prompt('Room Type: '));

    listCustomers.push(customer);

    displayMainMenu();
}

function displayMainMenu() {
    let choose = prompt(
        '1. Add new customer' + '\n' +
        '2. Display information customer' + '\n' +
        '3. Display total pay customer' + '\n' +
        '4. Edit infomation customer' + '\n' +
        '5. Delete customer' + '\n' +
        '6. Exit'
    );
    switch (choose) {
        case '1':
            addNewCustomer();
            break;
        case '2':
            displayCustomer();
            break;
        case '3':
            chooseDisplayTotalPay();
            break;
        case '4':
            chooseCustomerEdit();
            break;
        case '5':
            chooseDeleteCustomer();
            break;
        case '6': return; //lệnh dừng
        default:
            alert('Failed!');
            break;
    }
}

function displayCustomer() {
    let result = '';

    //duyệt mảng 2 chiều
    for (let i = 0; i < listCustomers.length; i++) {
        result += '\n' + (i + 1) + '. '
            + 'Name: ' + listCustomers[i].getName() + '; '
            + 'ID card: ' + listCustomers[i].getIdCard();
    }
    //tạo menu back ở vị trí arrList.length + 1
    result += '\n' + (listCustomers.length + 1) + '. Back to menu';

    let chooseDisplayInfo = prompt(result);

    //Nếu không chọn vào mục Back thì show ra thông tin theo mục chọn khách hàng
    if (chooseDisplayInfo.toString() !== (listCustomers.length + 1).toString()) {
        if(!checkDeleteCustomer && !checkDisplayTotalPay) {
            displayInfomationCustomer(Number.parseInt(chooseDisplayInfo) - 1);
        } else if(checkDeleteCustomer){
            deleteCustomer(Number.parseInt(chooseDisplayInfo) - 1);
        } else {
           displayTotalPay(Number.parseInt(chooseDisplayInfo) - 1);
        }
    } else {
        checkDisplayTotalPay = false;
        checkDeleteCustomer = false;
        checkEditCustomer = false;
        displayMainMenu();
    }
}

function displayInfomationCustomer(index) {
    if (checkEditCustomer) {
        let chooseInfoEdit = prompt(
            '1. Name : ' + listCustomers[index].getName() + '\n'
            + '2. Identity Card: ' + listCustomers[index].getIdCard() + '\n'
            + '3. Date of birth: ' + listCustomers[index].getBirthday() + '\n'
            + '4. Email: ' + listCustomers[index].getEmail() + '\n'
            + '5. Address: ' + listCustomers[index].getAddress() + '\n'
            + '6. Customers Type: ' + listCustomers[index].getCustomerType() + '\n'
            + '7. Discount: ' + listCustomers[index].getDiscount() + '%' + '\n'
            + '8. Amount: ' + listCustomers[index].getAmount() + '\n'
            + '9. Date Of Hire: ' + listCustomers[index].getDateOfHire() + '\n'
            + '10. Services Type: ' + listCustomers[index].getServiceType() + '\n'
            + '11. Rooms Type: ' + listCustomers[index].getRoomType() + '\n'
            + '12. Back'
        );
        if(chooseInfoEdit.toString() !== '12') {
            editInfomationCustomer(Number.parseInt(chooseInfoEdit) -1);
            //lua chon bi lech 1 don vi so voi vi tri index trong array nen phai -1
        } else { // chon 12
            checkEditCustomer = false;
            displayCustomer(); //back về menu show customer
        }
    } else {
        alert('1 - Name : ' + listCustomers[index].getName() + '\n'
            + '2 - Identity Card: ' + listCustomers[index].getIdCard() + '\n'
            + '3 - Date of birth: ' + listCustomers[index].getBirthday() + '\n'
            + '4 - Email: ' + listCustomers[index].getEmail() + '\n'
            + '5 - Address: ' + listCustomers[index].getAddress() + '\n'
            + '6 - Customers Type: ' + listCustomers[index].getCustomerType() + '\n'
            + '7 - Discount: ' + listCustomers[index].getDiscount() + '%' + '\n'
            + '8 - Amount: ' + listCustomers[index].getAmount() + '\n'
            + '9 - Date Of Hire: ' + listCustomers[index].getDateOfHire() + '\n'
            + '10 - Services Type: ' + listCustomers[index].getServiceType()+ '\n'
            + '11 - Rooms Type: ' + listCustomers[index].getRoomType() + '\n'
        );
        displayMainMenu();
    }
}

function chooseDisplayTotalPay() {
    checkDisplayTotalPay = true;
    displayCustomer();
}

function displayTotalPay(index) {
    alert(listCustomers[index].totalPay());
    checkDisplayTotalPay = false;
    displayMainMenu();
}

function chooseCustomerEdit() {
    checkEditCustomer = true;
    displayCustomer();
}

function editInfomationCustomer(index) {
    let editInfo = prompt('Enter information to change: ');
    switch (index) {
        //khong cần chuyển sang case string vì đã parseInt ở dòng 96
        case 0:
            listCustomers[index].setName(editInfo);
            break;
        case 1:
            listCustomers[index].setIdCard(editInfo);
            break;
        case 2:
            listCustomers[index].setBirthday(editInfo);
            break;
        case 3:
            listCustomers[index].setEmail(editInfo);
            break;
        case 4:
            listCustomers[index].setAddress(editInfo);
            break;
        case 5:
            listCustomers[index].setCustomerType(editInfo);
            break;
        case 6:
            listCustomers[index].setDiscount(editInfo);
            break;
        case 7:
            listCustomers[index].setAmount(editInfo);
            break;
        case 8:
            listCustomers[index].setDateOfHire(editInfo);
            break;
        case 9:
            listCustomers[index].setServiceType(editInfo);
            break;
        case 10:
            listCustomers[index].setRoomType(editInfo);
            break;
        default: alert('Failed');
            return;
    }
    checkEditCustomer = false;
    displayMainMenu();
}

function chooseDeleteCustomer() {
    checkDeleteCustomer = true;
    displayCustomer();
}
function deleteCustomer(index) {
    let chooseConfirm = confirm(
        'Confirm to delete '
        + listCustomers[index].getName() + '\n' +
        + listCustomers[index].getIdCard()
    );

    if(chooseConfirm) {
        listCustomers.splice(index, 1);
        alert('Delete Success!');
    }
    checkDeleteCustomer = false;
    displayMainMenu();
}

displayMainMenu();
