def method2() {
    100
    def i = 10
    def j = "hello"
}

println method2()

/*
 it is possible for if/else and try/catch/finally blocks to return a value
 when they are the last expression in a method or a closure. 
 No need to explicitly use the return keyword inside these constructs, 
 as long as they are the latest expression in the block of code.
*/

def method() {
    if (true) 1 else 0
}

assert method() == 1

/*
 For try/catch/finally blocks, the last expression evaluated is the one being returned.
 If an exception is thrown in the try block, the last expression in the catch block is 
 returned instead. Note that finally blocks don't return any value.
*/
def method(bool) {
    try {
        if (bool) throw new Exception("foo")
        1
    } catch(e) {
        2
    } finally {
        3
    }
}

assert method(false) == 1
assert method(true) == 2
