let create = "<table border='3' width=300' cellspacing='0' cellpadding='3'>";
for(let i = 1; i < 10; i++) {
    create += '<tr>';
    for(let j = 2; j < 10; j++) {
        create += '<td>' + j + 'x' + i + '=' + i * j + '</td>';
    }
    create += '</tr>'
}
create += '</table>';

document.write(create);