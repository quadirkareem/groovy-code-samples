class Struct {
    def getSetOutside = 100
    final finalVar = 200
    private privateVar = 300
    def noSetOutside = 400
    
    Struct() {
       finalVar = finalVar + 1
    }
    
    def inside() {
        println "\n=== INSIDE ==="
        
        getSetOutside = getSetOutside + 1
        println "getSetOutside = ${getSetOutside}"
        
        // cannot modify final field 'finalVar' outside of constructor.
        // finalVar = finalVar + 1

        this.privateVar = this.privateVar + 1
        println "this.privateVar = ${this.privateVar}"
        
        noSetOutside = noSetOutside + 1
        println "noSetOutside = ${noSetOutside}"

    }
    
    private void setNoSetOutside(noSetOutside) {
        throw new IllegalAccessException("you're not allowed to change noSetOutside")
    }
    
    // private access modifier is NOT honored by Groovy
    private privateMethod() {
        println "privateMethod called"
    }
    
}

// groovy.lang.MissingPropertyException: No such property: x for class: PrivateFinal
// x = x + 1

x = 1
println "x = ${x}\n"

Struct s = new Struct()
println "s.finalVar = ${s.finalVar}"
println "s.privateVar = ${s.privateVar}"
println "s.getSetOutside = ${s.getSetOutside}"
println "s.noSetOutside = ${s.noSetOutside}"

s.privateMethod()

// groovy.lang.MissingPropertyException: No such property: inside for class: Struct
// s.inside

s.inside()

println "\n=== OUTSIDE ==="

s.getSetOutside = s.getSetOutside + 1
println "s.getSetOutside = ${s.getSetOutside}"

// groovy.lang.ReadOnlyPropertyException: Cannot set readonly property: finalVar for class: Struct
// s.finalVar = s.finalVar + 1

s.privateVar = s.privateVar + 1
println "s.privateVar = ${s.privateVar}"

// java.lang.IllegalAccessException: you're not allowed to change noSetOutside
// s.noSetOutside = s.noSetOutside + 1
