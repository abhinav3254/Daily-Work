let x : number = 10.1; // typescript style
// x can only hold number

var y = 12; // js style

x = 9; //  same number can be reassigned

// y = "WELCOME"; // here it will throw error

var m = "WELCOME";

var k : String = "TYPESCRIPT";

console.log(x);
console.log(y);
console.log(m);
console.log(k);


function sum (x1:number,x2: number) : number {
	return x1 + x2;
}

console.log(sum(10.1,20));
// this throws error
// console.log(sum("type","script"));