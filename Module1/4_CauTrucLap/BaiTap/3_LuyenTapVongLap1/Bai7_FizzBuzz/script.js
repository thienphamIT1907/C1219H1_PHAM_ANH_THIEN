for (let i = 1; i <=100 ; i++) {
   if(i % 15 === 0) {
       document.write(i + ': ' + 'FizzBuzz' + '<br>');
       console.log(i)
   } else if(i % 5 === 0) {
       document.write(i + ': ' + 'Buzz' + '<br>');
   } else if(i % 3 === 0) {
       document.write(i + ': ' + 'Fizz' + '<br>');
   } else {
       document.write(i + '<br>');
   }
}