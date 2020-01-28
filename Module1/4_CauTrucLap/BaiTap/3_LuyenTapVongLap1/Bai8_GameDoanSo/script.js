let restart = 3;
do {
   let minLimit = parseInt(window.prompt('Đoán trong khoảng từ: ')),
       maxLimit = parseInt(window.prompt('đến khoảng: ')),
       guessNum = parseInt(window.prompt('Nhập số muốn đoán: ')),
   result = getRandomNumber(minLimit,maxLimit);

   if(guessNum === parseInt(result)) {
       alert('Chúc mừng đã đoán đúng !'); break;
   } else if(guessNum < parseInt(result)) {
       let checkSmaller = confirm('Số đoán bé hơn kết quả, chơi lại ?');
       if(checkSmaller) {
           restart--;
       } else if(restart===0) {
           alert('Đã quá số lần chơi');
       } else break;
   } else if(guessNum >parseInt(result)) {
       let checkBigger = confirm('Số đoán lớn hơn kết quả, chơi lại ?');
       if(checkBigger) {
           restart--;
       } else if(restart === 0) {
           alert('Đã quá số lần chơi')
       } else break;
   }
    console.log(restart)
}while(restart > 0 && restart <= 3);
alert('Đã quá số lần chơi !');

function getRandomNumber(minLimit,maxLimit) {
    return Math.random() * (maxLimit - minLimit) + minLimit;
}