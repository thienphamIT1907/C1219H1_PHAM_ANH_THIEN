let str = 'Tôi yêu ngôn ngữ lập trình Javascript';
let regex = /a/ig;
let numberOfA = str.match(regex).length;

document.write(`Chuỗi: ${str} có ${numberOfA} chữ a <br/>` );

let tachChuoi = str.split(' ');
document.write('Mảng của chuỗi sau khi tách: ' + tachChuoi.join() + '<br/>');
document.write('Số lượng từ có trong chuỗi: ' + tachChuoi.length + '<br/>');
document.write('Chuỗi sau khi thay thế: ' + str.replace('Javascript','Typescript'));