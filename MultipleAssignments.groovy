def splitName(fullName) { fullName.split(' ') }

def (firstName, lastName) = splitName('Muhammad Rasoolullah')

(f, l) = splitName('Abu Bakr')

println "$lastName, $firstName $lastName"
println "$l, $f $l"

def name1 = "Hassan"
def name2 = "Hussain"
println "$name1 and $name2"
(name1, name2) = [name2, name1]
// expecting ')', found ',' 
(name1, name2) = (name2, name1)
println "$name1 and $name2"