let x = 0,
    array = [];


function add_element_to_array() {
    array[x] = document.getElementById("txtValue").value;
    alert("Element: " + array[x] + " Added at index " + x);
    x++;
    document.getElementById("txtValue").value = "";
    //
    // let item = document.getElementById('txtValue').value;
    // array.push(item);
    // alert('Add done !');
}

function display_array() {
    let e = "<hr/>";
    for (let i = 0; i < array.length; i++) {
        e += "Element " + i + " = " + array[i] + "<br/>";
    }
    document.getElementById("result").innerHTML = e;
}