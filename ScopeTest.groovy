class ScopeMe {
    
    def x = 1;
    
    def simpleMethod() {
        // groovy.lang.MissingPropertyException: No such property: a for class: ScopeMe
        // a = 1
        def a = 1
        println "a = $a"
        
        // expecting a string literal end, found '.'
        // println "this.x = $this.x"
        
        println "this.x = ${this.x}"
        if(true) {
            def b = 10
            println "b = $b"
        }
        // groovy.lang.MissingPropertyException: No such property: b for class: ScopeMe
        // println "b = $b"
    }
}

y = 1
abc()
//abc(10)
abc 11, 2
abc(11)
xyz()
xyz(121)
println "y=$y"
new ScopeMe().simpleMethod()


if(true) {
    p = 12393
    println "p = $p"
}
println "p = $p"

def abc() {
    println "in method abc"
}

def abc(x, y=30) {
    println "abc $x ==> $y"
}

def xyz(x=100) {
    println "xyz $x"
}

// groovy.lang.MissingMethodException: No signature of method: ScopeTest.abc123() is applicable for argument types:
// abc123() { println "in method abc123" }
