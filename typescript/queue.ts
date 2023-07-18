class Queue <T> {
	private a: T[];
	private ptr : Number = -1;
	private checkEnd : Number = -1;
	
	public constructor (a: T[]) {
		this.a = a;
	}
	
	private isFull () : boolean {
		if (this.ptr == 10) {
			return false;
		} else {
			return true;
		}
	}
	
	public addElement (element : T): void {
		if (this.isFull()) {
			a[++this.ptr] = element;
			++this.checkEnd;
		} else {
			console.log("Queue Full");
		}
	}
	
	public getElement () : void {
		if (this.isEmpty()) {
			console.log(this.a[this.ptr--]);
		} else {
			console.log("Queue Empty");
		}
	}
	
	private isEmpty () : boolean {
		if (this.ptr == -1) {
			return false;
		} else {
			return true;
		}
	}
	
}

var q = new Queue<Number>(new Array(10));

for (var i = 1;i<=12;i++) {
	q.addElement(i);
}

for (var i = 1;i<=11;i++) {
	q.getElement();
}