let ngoiSao = ['Polaris', 'Aldebaran', 'Deneb', 'Vega', 'Altair', 'Dubhe', 'Regulus'];
let chomSao = ['Ursa Minor', 'Tarurus', 'Cygnus', 'Lyra', 'Aquila', 'Ursa Major', 'Leo'];
function load() {
    let tenNgoiSao = window.prompt('Nhập tên ngôi sao: ');
    timChomSao(tenNgoiSao);


    function timChomSao(tenNgoiSao) {
        let viTri = ngoiSao.indexOf(tenNgoiSao);
        if (viTri !== -1) {
            alert(tenNgoiSao + ' --> ' + chomSao[viTri]);
        } else {
            alert('Không tìm thấy');
        }
    }
}