class MyDate {
    constructor(day, month, year) {
        this.day = day;
        this.month = month;
        this. year = year;
    }
    get getDay() {
        return this.day;
    }
    set setDay(day) {
        this.day = day;
    }
    get getMonth() {
        return this.month;
    }
    set setMonth(month) {
        this.month = month;
    }
    get getYear() {
        return this.year;
    }
    set setYear(year) {
        this.year = year;
    }
}



let date = new MyDate(14,1,2020);

let day = date.getDay;
let month = date.getMonth;
let year = date.getYear;

alert(`${day}/${month}/${year}`);

