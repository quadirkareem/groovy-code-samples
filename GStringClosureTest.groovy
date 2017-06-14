def number = 1
def KK = "number"
def eagerGString = "value == ${number}"
def lazyGString = "value == ${ -> number }"
number = 2
println "$eagerGString"
println "$lazyGString"

assert KK instanceof String
assert eagerGString instanceof GString 
assert lazyGString instanceof GString 