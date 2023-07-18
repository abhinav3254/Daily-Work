class Stack <T> {
	private a : T[];
	private index : number = -1;
	public constructor (a:T[]) {
		this.a = a;
	}
	
	private isFull() : boolean {
		return this.index == 9;
	}
	public push (element : T) : void {
		if (!this.isFull()) {
			this.a[++this.index] = element;
		} else 
		console.log("Stack is Overflow");
	}
	
	private isEmpty() : boolean {
		return this.index == -1;
	}
	
	public pop () : void {
		if (!this.isEmpty()) {
			console.log(this.a[this.index--]);
		} else {
			console.log("Stack Underflow");
		}
	}
}


var s = new Stack<Number>(new Array(10));

for (var i = 1;i<=12;i++) {
	s.push(i);
}

for (var i = 1;i<=11;i++) {
	s.pop();
}
