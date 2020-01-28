let arrNameCustomer = [];
let choose = prompt('1. Add new customer' + '\n' + '2. Delete customer');

switch (choose) {
    case "1": addNewCustomer();
        break;
    case "2": DeleteCustomer();
        break;
    default:
        alert('Failed !');
        break;
}

function addNewCustomer() {
    let arrLength = prompt('Enter number of customer to add: ');
    for (let i = 0; i < arrLength; i++) {
       arrNameCustomer.push(prompt('Enter customer ' + (i + 1) + ': '));
    }
    arrNameCustomer.sort();
    let detail = '';
    for (let i = 0; i < arrLength; i++) {
        detail += (i+1) + '. ' + arrNameCustomer[i] + '\n';
    }
    alert(detail);
}

function DeleteCustomer() {
    arrNameCustomer[0] = 'Jordan';
    arrNameCustomer[1] = 'Peter';
    arrNameCustomer[2] = 'Michanel';
    arrNameCustomer[3] = 'Gordon';
    arrNameCustomer[4] = 'Inherit';
    arrNameCustomer[5] = 'PolyMophim';
    arrNameCustomer[6] = 'Encappedak';
    arrNameCustomer[7] = 'Aperio';
    arrNameCustomer[8] = 'Galio';
    arrNameCustomer[9] = 'Jhin';

    let detail = '';
    for (let i = 0; i < arrNameCustomer.length; i++) {
        detail += (i+1) + '. ' + arrNameCustomer[i] + '\n';
    }
    let indexDelete = prompt('Choose customer to delete: ' + '\n' + detail);

    arrNameCustomer.splice(parseInt(indexDelete - 1), 1);

    let resultAfterDelete = '';
    for (let i = 0; i < arrNameCustomer.length; i++) {
        resultAfterDelete += '\n' + (i+1) + '. ' + arrNameCustomer[i];
    }
    alert('List customer\'s name deleted: ' + resultAfterDelete);

}