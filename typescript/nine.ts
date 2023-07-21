interface Test {
	// x : number;
	sqr(number);
}

class MyTest implements Test {
	sqr(x:number) {
	return x * x;
	}
}

//var myTest : Test = {x : 10,sqr : x => x*x};

//console.log(myTest.sqr(10));

console.log(new MyTest().sqr(5));