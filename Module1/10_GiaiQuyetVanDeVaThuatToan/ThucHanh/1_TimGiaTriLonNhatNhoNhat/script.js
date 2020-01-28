function findMin(arr) {
    let min = arr[0];
    for (let i = 1; i < arr.length; ++i) {
        if (arr[i] < min) {
            min = arr[i];
        }
    }
    return min;
}

let nums = [];
for(let i=0;i<100;++i){
    nums[i] = Math.floor(Math.random() * 101);
}
let minValue = findMin(nums);
document.write(nums);
document.write("<br/>");
document.write("The minimum value is: " + minValue);