/*
var a = [10,'welcome',false,123.56];

for (var i = 0;i<a.length;i++)
	console.log(a[i]);

var a1 : number[] = [10,20.2,30,40]

for (var i = 0;i<a1.length;i++)
	console.log(a1[i]);


var myType : [String,number,boolean];
myType = ['welcome',1000,true];
console.log(myType);
myType.push(777.99);
myType.push("Farewell");
console.log(myType);

*/


var myType : readonly [String,number,boolean];
myType = ['welcome',1000,true];
console.log(myType);
//myType.push(777.99);
//myType.push("Farewell");
//console.log(myType);