let producstArray = ['Iphone','Sony','BlackBerry','Nokia','Xiaomi','Huawei'];

function showAllProducts() {
    let showArea = document.getElementById('show-area');
    let showAmount = document.getElementById('showAmount');
    let content = '';
    for (let i = 0; i < producstArray.length; i++) {
        let stt = (i+1).toString();
        let name = producstArray[i];
        content+= '<tr>'+ '<td>' + stt +'</td>' +
            '<td id="'+i+'">' + name + '</td>' +
            '<td>' + '<button'+' onclick="editProduct('+ i + ')">Edit</button>' +'</td>' +
            '<td>' + '<button'+' onclick="deleteProduct('+ i + ')">Delete</button>' +'</td>' +
            '</tr>';
    }
    showArea.innerHTML = content;
    showAmount.innerText = producstArray.length.toString();
}

function addProduct() {
    let input = document.getElementById('detail-product');
    if(input.value === '') {
        alert('Input Invalid!');
        input.focus();
    } else {
        producstArray.push(input.value);
        alert('Added Success!');
        document.getElementById('detail-product').value = '';
    }
}

function editProduct(pos) {
   producstArray[pos] = prompt('Enter your new Information: ');
   showAllProducts();

}

function saveEdit() {
    let data = document.getElementById('detail-product');
    console.log(data);
    document.getElementById('')
}


function deleteProduct(pos) {
    producstArray.splice(pos,1);
    showAllProducts();
}
