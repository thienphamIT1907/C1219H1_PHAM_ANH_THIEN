let input = prompt('Enter your date: ');
let regex = /^((0)[1-9]|[1-2][0-9]|(3)[0-1])(\/)((0)[1-9]|((1)[0-2]))(\/)\d{4}$/;

if(regex.test(input)) {
    alert('Hợp lệ !');
} else alert('Không hợp lệ');
