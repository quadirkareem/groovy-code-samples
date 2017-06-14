// iterate over a range
def x = 0
for ( i in 0..9 ) {
    x += i
}
assert x == 45

// iterate over a list
x = 0
for ( i in [0, 1, 2, 3, 4] ) {
    x += i
}
assert x == 10

// iterate over an array
x = 0
for ( i in (0 .. 5).toArray() ) {
    x += i
}
assert x == 15

// iterate over an array
x = 0
for ( i in [0, 1, 2, 3, 4].toArray() ) {
    x += i
}
assert x == 10

// iterate over a map
def map = ['abc':1, 'def':2, 'xyz':3]
x = 0
y = ""
for ( e in map ) {
    x += e.value
    y += e.key
}
assert x == 6
assert y == 'abcdefxyz'


// iterate over values in a map
x = 0
for ( v in map.values() ) {
    x += v
}
assert x == 6

// iterate over the characters in a string
def text = "abc"
def list = []
for (c in text) {
    list.add(c)
}
assert list == ["a", "b", "c"]

// ==================
// Closures

def stringList = [ "java", "perl", "python", "ruby", "c#", "cobol",
                   "groovy", "jython", "smalltalk", "prolog", "m", "yacc" ];

def stringMap = [ "Su" : "Sunday", "Mo" : "Monday", "Tu" : "Tuesday",
                  "We" : "Wednesday", "Th" : "Thursday", "Fr" : "Friday",
                  "Sa" : "Saturday" ];

// it property is predefined, cannot use other property names
stringList.each() { print " ${it}" }; println "";
println "\n====="

stringMap.each() { a, b -> println "${a} ==> ${b}" };
println "\n====="

stringList.eachWithIndex() { object, i11 -> println " ${i11}: ${object}" };
println "\n====="

stringMap.eachWithIndex() { obj, i -> println " ${i}: ${obj}" };
println "\n====="
