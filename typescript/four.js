var Stack = /** @class */ (function () {
    function Stack(a) {
        this.index = -1;
        this.a = a;
    }
    Stack.prototype.isFull = function () {
        return this.index == 9;
    };
    Stack.prototype.push = function (element) {
        if (!this.isFull()) {
            this.a[++this.index] = element;
        }
        else
            console.log("Stack is Overflow");
    };
    Stack.prototype.isEmpty = function () {
        return this.index == -1;
    };
    Stack.prototype.pop = function () {
        if (!this.isEmpty()) {
            console.log(this.a[this.index--]);
        }
        else {
            console.log("Stack Underflow");
        }
    };
    return Stack;
}());
var s = new Stack(new Array(10));
for (var i = 1; i <= 12; i++) {
    s.push(i);
}
for (var i = 1; i <= 11; i++) {
    s.pop();
}
