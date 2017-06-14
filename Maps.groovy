def colors = [red: '#FF0000', green: '#00FF00', blue: '#0000FF']   

assert colors['red'] == '#FF0000'    
assert colors.green  == '#00FF00'    

colors["pink"] = '#FF00FF'           
colors.yellow  = '#FFFF00'           

assert colors.pink == '#FF00FF'
assert colors['yellow'] == '#FFFF00'

assert colors instanceof java.util.LinkedHashMap

assert colors.unknown == null

def numbers = [1: 'one', 2: 'two']

assert numbers[1] == 'one'
/*
assert numbers.1 == 'one'

1 compilation error:
unexpected token: 1 at line: 19, column: 16
*/

def key = 'name'
def person = [key: 'Guillaume']
assert !person.containsKey('name')   
assert person.containsKey('key') 
assert person.key == 'Guillaume'
assert person.name == null
assert person['name'] == null

// When you need to pass variable values as keys in your map definitions, 
// you must surround the variable or expression with parentheses
person = [(key): 'Guillaume']
assert person.containsKey('name')    
assert !person.containsKey('key') 
assert person.name == 'Guillaume'