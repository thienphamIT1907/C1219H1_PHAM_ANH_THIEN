let good = document.getElementById('good');
let fast = document.getElementById('fast');
let cheap = document.getElementById('cheap');


function change(btn) {
    let isGood = good.checked;
    let isFast = fast.checked;
    let isCheap = cheap.checked;

    if(isGood && isFast && isCheap && btn === cheap) {
        fast.checked = false;
    }

    if(isGood && isCheap && isFast && btn === fast) {
        good.checked = false;
    }

    if(isCheap && isFast && isGood && btn === good) {
        cheap.checked = false;
    }
}