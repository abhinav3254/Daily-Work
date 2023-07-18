var Queue = /** @class */ (function () {
    function Queue(a) {
        this.ptr = -1;
        this.checkEnd = -1;
        this.a = a;
    }
    Queue.prototype.isFull = function () {
        if (this.ptr == 10) {
            return false;
        }
        else {
            return true;
        }
    };
    Queue.prototype.addElement = function (element) {
        if (this.isFull()) {
            a[++this.ptr] = element;
            ++this.checkEnd;
        }
        else {
            console.log("Queue Full");
        }
    };
    Queue.prototype.getElement = function () {
        if (this.isEmpty()) {
            console.log(this.a[this.ptr--]);
        }
        else {
            console.log("Queue Empty");
        }
    };
    Queue.prototype.isEmpty = function () {
        if (this.ptr == -1) {
            return false;
        }
        else {
            return true;
        }
    };
    return Queue;
}());
var q = new Queue(new Array(10));
for (var i = 1; i <= 12; i++) {
    q.addElement(i);
}
for (var i = 1; i <= 11; i++) {
    q.getElement();
}
