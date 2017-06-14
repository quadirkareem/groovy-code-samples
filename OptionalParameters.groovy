def log(x, base=10) {
    Math.log(x) / Math.log(base)
}

println log(1024)
println log(1024, 10)
println log(1024, 2)

def task(name, String[] details) {
    println "$name - $details"
}

task 'Call', '123-456-7890'
task 'Call', '123-456-7890', '231-546-0987'
task 'Check Mail'

def opt(x) {
    println "opt x : $x"
}

println opt(2020)
// groovy.lang.MissingMethodException: No signature of method: OptionalParameters.opt() is applicable for argument types:
// println opt(202, 292)