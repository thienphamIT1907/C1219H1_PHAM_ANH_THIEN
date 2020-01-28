class Circle {
    constructor(radius) {
        this.radius = radius;
    }

    get getRadius() {
        return this.radius;
    }

    get getArea() {
        return Math.PI * Math.pow(this.radius,2);
    }
}

let circle = new Circle(2);
let radius = circle.getRadius;
let area = circle.getArea;

alert(`radius: ${radius} | area: ${area}`);