
Translate = () => {
    let input = document.getElementById('input').value;
    let engArr = ['school', 'baby', 'computer', 'sky', 'hello','home',];
    let vieArr = ['trường học', 'em bé', 'máy tính', 'bầu trời', 'xin chào', 'nhà'];

    let checkWord = engArr.indexOf(input);
    if(checkWord !== -1) {
        document.getElementById('show-en').value = vieArr[checkWord];
        document.getElementById('notification').innerText = 'Tìm thấy !';
        setTimeout(()=> {
            document.getElementById('notification').innerHTML = '';
        },1500);
    } else {
        document.getElementById('notification').innerText = 'Không tìm thấy !';
            setTimeout(()=> {
                document.getElementById('notification').innerHTML = '';
            },1500);
    }


    // let strList = engArr.join();
    // let checkWord = strList.search(input);
    // if(checkWord !==-1) {
    //     for (let i = 0; i < engArr.length; i++) {
    //         if(input === engArr[i]) {
    //             engArr[i] = vieArr[i];
    //             document.getElementById('show-en').value = engArr[i];
    //             document.getElementById('notification').innerText = 'Tìm thấy !';
    //             setTimeout(()=> {
    //                 document.getElementById('notification').innerHTML = '';
    //             },1500);
    //         }
    //     }
    // } else {
    //     document.getElementById('notification').innerText = 'Không tìm thấy !';
    //     setTimeout(()=> {
    //         document.getElementById('notification').innerHTML = '';
    //     },1500);
    // }
};

