let arrListCustomers = [];
let checkEditCustomer = false;
let checkDeleteCustomer = false;

function displayMainMenu() {
    let choose = prompt(
        '1. Add new customer' + '\n' +
        '2. Display information customer' + '\n' +
        '3. Edit infomation customer' + '\n' +
        '4. Delete customer' + '\n' +
        '5. Exit'
    );
    switch (choose) {
        case '1':
            addNewCustomer();
            break;
        case '2':
            displayCustomer();
            break;
        case '3':
            chooseCustomerEdit();
            break;
        case '4':
            chooseDeleteCustomer();
            break;
        case '5':
            alert('Exit !');
            break;
        default:
            alert('Failed');
            break;
    }

}

function addNewCustomer() {
    let arrInfo = [];

    let nameCustomer = prompt('Name: ');
    let idCard = prompt('ID card:');
    let birthdayCustomer = prompt('Birthday:');
    let emailCustomer = prompt('Email: ');
    let addressCustomer = prompt('Address: ');
    let typeCustomer = prompt('Type Customer: ');
    let discount = prompt('Discount: ');
    let numBerofAccompanying = prompt('NumBerofAccompanying:');
    let typeRoom = prompt('Type room: ');
    let rentDays = prompt('Rent days: ');
    let typeServices = prompt('Type Services: ');

    arrInfo.push(nameCustomer);
    arrInfo.push(idCard);
    arrInfo.push(birthdayCustomer);
    arrInfo.push(emailCustomer);
    arrInfo.push(addressCustomer);
    arrInfo.push(typeCustomer);
    arrInfo.push(discount);
    arrInfo.push(numBerofAccompanying);
    arrInfo.push(typeRoom);
    arrInfo.push(rentDays);
    arrInfo.push(typeServices);
    arrListCustomers.push(arrInfo);
    displayMainMenu();
}

function displayCustomer() {
    let result = '';

    //duyệt mảng 2 chiều
    for (let i = 0; i < arrListCustomers.length; i++) {
        result += '\n' + (i + 1) + '. '
            + 'Name: ' + arrListCustomers[i][0] + '; '
            + 'ID card: ' + arrListCustomers[i][1];
    }
    //tạo menu back ở vị trí arrList.length + 1
    result += '\n' + (arrListCustomers.length + 1) + '. Back to menu';

    let chooseDisplayInfo = prompt(result);

    //Nếu không chọn vào mục Back thì show ra thông tin theo mục chọn khách hàng
    if (chooseDisplayInfo.toString() !== (arrListCustomers.length + 1).toString()) {
        if(!checkDeleteCustomer) {
            displayInfomationCustomer(Number.parseInt(chooseDisplayInfo) - 1);
        } else {
            deleteCustomer(Number.parseInt(chooseDisplayInfo) - 1);
        }

    } else {
        checkDeleteCustomer = false;
        checkEditCustomer = false;
        displayMainMenu();
    }
}

function displayInfomationCustomer(index) {
    if (checkEditCustomer) {
        let chooseInfoEdit = prompt(
            '1. Name : ' + arrListCustomers[index][0] + '\n'
            + '2. Identity Card: ' + arrListCustomers[index][1] + '\n'
            + '3. Date of birth: ' + arrListCustomers[index][2] + '\n'
            + '4. Email: ' + arrListCustomers[index][3] + '\n'
            + '5. Address: ' + arrListCustomers[index][4] + '\n'
            + '6. Customers Type: ' + arrListCustomers[index][5] + '\n'
            + '7. Discount: ' + arrListCustomers[index][6] + '%' + '\n'
            + '8. Amount: ' + arrListCustomers[index][7] + '\n'
            + '9. Date Of Hire: ' + arrListCustomers[index][8] + '\n'
            + '10. Services Type: ' + arrListCustomers[index][9] + '\n'
            + '11. Rooms Type: ' + arrListCustomers[index][10] + '\n'
            + '12. Back'
        );
        if(chooseInfoEdit.toString() !== '12') {
            editInfomationCustomer(Number.parseInt(chooseInfoEdit) -1);
            //lua chon bi lech 1 don vi so voi vi tri index trong array nen phai -1
        } else { // chon 12
            displayCustomer(); //back về menu show customer
        }
    } else {
        alert('1 - Name : ' + arrListCustomers[index][0] + '\n'
            + '2 - Identity Card: ' + arrListCustomers[index][1] + '\n'
            + '3 - Date of birth: ' + arrListCustomers[index][2] + '\n'
            + '4 - Email: ' + arrListCustomers[index][3] + '\n'
            + '5 - Address: ' + arrListCustomers[index][4] + '\n'
            + '6 - Customers Type: ' + arrListCustomers[index][5] + '\n'
            + '7 - Discount: ' + arrListCustomers[index][6] + '%' + '\n'
            + '8 - Amount: ' + arrListCustomers[index][7] + '\n'
            + '9 - Date Of Hire: ' + arrListCustomers[index][8] + '\n'
            + '10 - Services Type: ' + arrListCustomers[index][9] + '\n'
            + '11 - Rooms Type: ' + arrListCustomers[index][10] + '\n'
        );
        displayMainMenu();
    }
}

function editInfomationCustomer(index) {
    let editInfo = prompt('Enter information to change: ');
    switch (index) {
        //khong cần chuyển sang case string vì đã parseInt ở dòng 96
        case 0:
            arrListCustomers[index][0] = editInfo;
            break;
        case 1:
            arrListCustomers[index][1] = editInfo;
            break;
        case 2:
            arrListCustomers[index][2] = editInfo;
            break;
        case 3:
            arrListCustomers[index][3] = editInfo;
            break;
        case 4:
            arrListCustomers[index][4] = editInfo;
            break;
        case 5:
            arrListCustomers[index][5] = editInfo;
            break;
        case 6:
            arrListCustomers[index][6] = editInfo;
            break;
        case 7:
            arrListCustomers[index][7] = editInfo;
            break;
        case 8:
            arrListCustomers[index][8] = editInfo;
            break;
        case 9:
            arrListCustomers[index][9] = editInfo;
            break;
        case 10:
            arrListCustomers[index][10] = editInfo;
            break;
        default: alert('Failed');
            return;
    }
    checkEditCustomer = false;
    displayMainMenu();
}

function deleteCustomer(index) {
    let chooseConfirm = confirm('Confirm to delete '
        + arrListCustomers[index][0]) + '\n' +
        + arrListCustomers[index][1];

    if(chooseConfirm) {
        arrListCustomers.splice(index, 1);
        alert('Delete Success!');
    }
    checkDeleteCustomer = false;
    displayMainMenu();
}

function chooseCustomerEdit() {
    checkEditCustomer = true;
    displayCustomer();
}

function chooseDeleteCustomer() {
    checkDeleteCustomer = true;
    displayCustomer();
}

displayMainMenu();