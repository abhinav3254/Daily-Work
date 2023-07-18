var MyTest = /** @class */ (function () {
    function MyTest() {
    }
    MyTest.prototype.sqr = function (x) {
        return x * x;
    };
    return MyTest;
}());
//var myTest : Test = {x : 10,sqr : x => x*x};
//console.log(myTest.sqr(10));
console.log(new MyTest().sqr(5));
