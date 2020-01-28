function Hero(image, top, left, size){
    this.image = image;
    this.top = top;
    this.left = left;
    this.size = size;

    this.getHeroElement = function(){
        return '<img width="'+ this.size + '"' +
            ' height="'+ this.size + '"' +
            ' src="' + this.image +'"' +
            ' style="top: '+this.top+'px; left:'+this.left+'px;position:absolute;"  alt="Picture"/>';
    };

    this.moveRight = function(){
        this.left += 50;
        console.log('left: ' + this.left);
    };

    this.moveDown = function() {
        this.top += 50;
        console.log('top: ' + this.top);
    }

}

let hero = new Hero('images/ami-fat.png', 20, 30, 250);

function start(){
    if(hero.left < window.innerWidth - hero.size){ // - hero.size để đối tượng không đi ra khỏi màn hình
        hero.moveRight();
    }
    if(hero.left === window.innerWidth - hero.size) {
        hero.moveDown();
    }
    document.getElementById('game').innerHTML = hero.getHeroElement();
    setTimeout(start, 100)
}

start();