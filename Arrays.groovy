// Groovy reuses the list notation for arrays, 
// but to make such literals arrays, you need to 
// explicitly define the type of the array through coercion or type declaration.

String[] arrStr = ['Ananas', 'Banana', 'Kiwi']  

assert arrStr instanceof String[]    
assert !(arrStr instanceof List)     

def numArr = [1, 2, 3] as int[]      

assert numArr instanceof int[]       
assert numArr.size() == 3
println "numArr.length = $numArr.length"

def matrix3 = new Integer[3][3]         
assert matrix3.size() == 3

Integer[][] matrix2                     
matrix2 = [[1, 2], [3, 4]]
assert matrix2 instanceof Integer[][]

String[] names = ['Cédric', 'Guillaume', 'Jochen', 'Paul']
assert names[0] == 'Cédric'     

names[2] = 'Blackdrag'          
assert names[2] == 'Blackdrag'
