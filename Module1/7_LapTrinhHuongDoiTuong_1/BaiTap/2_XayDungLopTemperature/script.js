class Temperature {
    constructor(doC) {
        this.doC = doC;
    }

    CtoF() {
        return (9 * this.doC) / 5 + 32
    }

    CtoK() {
        return this.doC + 273.15;
    }
}

let temperature = new Temperature(25);

alert(temperature.doC + ' C --> ' + temperature.CtoF() +  ' F' + '\n'
    + temperature.doC + ' C --> ' + temperature.CtoK() +  ' K'
);