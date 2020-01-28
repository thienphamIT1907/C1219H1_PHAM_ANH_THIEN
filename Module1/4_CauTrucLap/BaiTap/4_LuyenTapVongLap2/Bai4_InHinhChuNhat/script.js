let height = 5,
    width = 10;

for (let i = 0 ; i < height; i++) {
    for (let j = 0; j < width; j++) {
        if(i===0 || i === height-1 || j === 0 || j === width -1) {
            document.write('*');
        } else document.write('&nbsp');
    }
    document.write('<br>');
}