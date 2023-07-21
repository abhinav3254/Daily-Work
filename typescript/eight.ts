interface Rectangle {
	length : number;
	breadth : number;
}

interface TwoDRectangle extends Rectangle {
	dimension : number;
}

interface ColorRectangle extends Rectangle,TwoDRectangle {
	color : String;
}

var myRectange : ColorRectangle = {length : 10,breadth : 7,dimension : 2,color : 'Red'};
console.log(myRectange);
console.log(myRectange.length+'    '+myRectange.breadth+"         "+myRectange.dimension+"         "+myRectange.color);