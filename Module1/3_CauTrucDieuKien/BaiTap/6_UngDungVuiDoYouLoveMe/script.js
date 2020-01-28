function SayYes() {
    alert('Yes. I love you too <3');
}
function MoveUntilDead() {
    let moveX = Math.round(Math.random() * window.innerHeight) * 0.4;
    let moveY = Math.round(Math.random() * window.innerWidth) * 0.4;

    console.log('position x: ' + moveX + ',' + moveY);
    document.getElementById('no-button').style.top = moveX + 'px';
    document.getElementById('no-button').style.left = moveY + 'px';
    console.log('position x after random: ' + moveX + ',' + moveY);

}