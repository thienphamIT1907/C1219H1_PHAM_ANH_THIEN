let total = 0,
    count = 30;
document.write('Các số chia hết cho 7 trong 30 số đầu tiên: ');
for (let i = 0; i < count ; i++) {
    if(i % 7 === 0) {
        document.write(i+ ' ');
        total += i;
    }
}
document.write('<br/>' + 'Tổng các số chia hết cho 7: ' + total);
