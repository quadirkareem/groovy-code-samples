def m = Integer.MIN_VALUE
def n = null

println "$m > $n ==> ${(m >= n)}"

def x = 10
def y = 2
def p = 4
def q = 8

def z = x + y
def r = p + q

println "r == z: ${r == z}"

int x1 = 1
println (x1 | 10)
def x2 = 2 as int
println (x2 | 10)
def x3 = 31 as Integer
println (x3 | 10)
char c1 = 'c'
char c2 = 'm'
println (c1 | c2)
def c3 = 'x' as char
println (c3 | c2)
def c4 = 'x' as Character
println (c4 | c2)
 