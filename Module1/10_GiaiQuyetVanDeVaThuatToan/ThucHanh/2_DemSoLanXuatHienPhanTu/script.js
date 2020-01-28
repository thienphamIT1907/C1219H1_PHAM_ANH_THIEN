let nums = [];
for(let i =0;i<100;++i) {
    nums[i] = Math.floor(Math.random() * 101);
}
insertionsort(nums);
dispArr(nums);
document.write("<br/>");

function dispArr(arr) {
    for (let i = 0; i < arr.length; i++) {
        document.write(arr[i] + ' ');
    }
}

function insertionsort(arr) {
    return arr.sort();
}

function count(arr, data) {
    let count = 0;
    let position = binSearch(arr, data);
    if (position > -1) {
        ++count;
        for (let i = position-1; i > 0; --i) {
            if (arr[i] === data) {
                ++count;
            }
            else {
                break;
            }
        }

        for (let i = position+1; i < arr.length; ++i) {
            if (arr[i] === data) {
                ++count;
            }
            else {
                break;
            }
        }
    } //end if
    return count;
}