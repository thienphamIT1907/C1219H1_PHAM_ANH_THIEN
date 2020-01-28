let ami = null;
ami = document.getElementById('ami');

function upArrowPressed() {
    ami.style.top = parseInt(ami.style.top) - 5 + 'px';
}

function downArrowPressed() {
    ami.style.top = parseInt(ami.style.top) + 5 + 'px';
}

function leftArrowPressed() {
    ami.style.left = parseInt(ami.style.left) - 5 + 'px';
}

function rightArrowPressed() {
    ami.style.left = parseInt(ami.style.left) + 5 + 'px';
}

function moveSelection(evt) {
    switch (evt.keyCode) {
        case 37:
            leftArrowPressed();
            console.log('moved left');
            break;
        case 39:
            rightArrowPressed();
            console.log('moved right');
            break;
        case 38:
            upArrowPressed();
            console.log('moved up');
            break;
        case 40:
            downArrowPressed();
            console.log('moved down');
            break;
    }
}

function doReady() {
    window.addEventListener('keydown', moveSelection);
    alert('Finish load')
}